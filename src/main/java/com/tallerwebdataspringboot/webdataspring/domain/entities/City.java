package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
@Id
@Column(columnDefinition = "VARCHAR(50)", nullable = false)
private String codeCity;
@Column(columnDefinition = "VARCHAR(50)", nullable = false)
private String nameCity;

@ManyToOne
private Region region;

public City() {
}

public String getCodeCity() {
    return codeCity;
}

public void setCodeCity(String codeCity) {
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
