package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tyoe_person")
public class Type {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column(name = "id_person",columnDefinition = "VARCHAR(20)",nullable = false)
private String description;

@ManyToOne
Person persons;



public Type() {
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public Person getPersons() {
    return persons;
}

public void setPersons(Person persons) {
    this.persons = persons;
}



}
