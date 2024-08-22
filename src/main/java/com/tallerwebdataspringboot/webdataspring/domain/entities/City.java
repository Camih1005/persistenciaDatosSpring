package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long codeCity;
@Column(columnDefinition = "VARCHAR(50)", nullable = false)
private String nameCity;

@ManyToOne
private Region region;

public City() {
}

public Long getCodeCity() {
    return codeCity;
}

public void setCodeCity(Long codeCity) {
    this.codeCity = codeCity;
}

public String getNameCity() {
    return nameCity;
}

public void setNameCity(String nameCity) {
    this.nameCity = nameCity;
}

public Region getRegion() {
    return region;
}

public void setRegion(Region region) {
    this.region = region;
}


}
