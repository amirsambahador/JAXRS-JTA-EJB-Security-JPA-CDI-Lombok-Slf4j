package org.j2os.project.entity;
/*
    Bahador, Amirsam
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.ws.rs.QueryParam;
import java.io.Serializable;

@Entity(name = "person")
@Data
public class Person implements Serializable {
    @QueryParam("id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @QueryParam("name")
    private String name;
    @QueryParam("family")
    private String family;

}
