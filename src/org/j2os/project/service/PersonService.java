package org.j2os.project.service;
/*
    Bahador, Amirsam
 */

import org.j2os.project.entity.Person;
import org.j2os.project.repository.CrudRepository;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.UserTransaction;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class PersonService {
    @EJB
    private CrudRepository<Person, Long> crudRepository;
    @Resource
    private UserTransaction transaction;

    public void save(Person person) throws Exception {
        transaction.begin();
        crudRepository.save(person);
        transaction.commit();
    }

    public void update(Person person) throws Exception {
        transaction.begin();
        crudRepository.update(person);
        transaction.commit();
    }

    public void remove(Person person) throws Exception {
        transaction.begin();
        crudRepository.remove(person);
        transaction.commit();
    }

    public Person findOne(Person person) {
        return crudRepository.findOne(Person.class, person.getId());
    }

    public List<Person> findAll() {
        return crudRepository.findAll(Person.class);
    }

    public List<Person> search(String content) {
        Map<String, Object> params = new HashMap<>();
        params.put("content", content);
        return crudRepository.findAll(Person.class, "entity.name=:content or entity.family=:content", params);
    }

}
