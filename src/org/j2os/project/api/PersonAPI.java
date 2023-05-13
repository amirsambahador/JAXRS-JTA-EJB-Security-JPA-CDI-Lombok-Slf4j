package org.j2os.project.api;
/*
    Bahador, Amirsam
 */

import com.sun.jersey.api.core.InjectParam;
import lombok.extern.slf4j.Slf4j;
import org.j2os.project.entity.Person;
import org.j2os.project.service.PersonService;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@ApplicationScoped
@Path("/person")
@Slf4j
public class PersonAPI {
    @EJB
    private PersonService personService;

    @GET
    @Produces("application/json")
    @Path("/save")
    public Object save(@InjectParam Person person) throws Exception {
        log.info("SAVE");
        personService.save(person);
        return findAll();
    }

    @GET
    @Produces("application/json")
    @Path("/update")
    public Object update(@InjectParam Person person) throws Exception {
        log.info("UPDATE");
        personService.update(person);
        return findAll();
    }

    @GET
    @Produces("application/json")
    @Path("/remove")
    public Object remove(@InjectParam Person person) throws Exception {
        log.info("REMOVE");
        personService.remove(person);
        return findAll();
    }

    @GET
    @Produces("application/json")
    @Path("/findOne")
    public Object findOne(@InjectParam Person person) throws Exception {
        log.info("FIND ONE");
        return personService.findOne(person);
    }

    @GET
    @Produces("application/json")
    @Path("/findAll")
    public Object findAll() {
        log.info("FIND ALL");
        return personService.findAll();
    }

    @GET
    @Produces("application/json")
    @Path("/search")
    public Object search(@QueryParam("content") String search) {
        log.info("SEARCH");
        return personService.search(search);
    }
}
