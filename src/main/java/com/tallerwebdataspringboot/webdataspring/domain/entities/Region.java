package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "regiones")
public class Region {
@Id
@Column(columnDefinition = "VARCHAR(50)", nullable = false)
private String codeRegion;
@Column(columnDefinition = "VARCHAR(50)", nullable = false)
private String nameCity;

@ManyToOne
@JoinColumn(name = "idcountry")
private Country country;


public Region() {
}
public String getCodeRegion() {
    return codeRegion;
}
public void setCodeRegion(String codeRegion) {
    this.codeRegion = codeRegion;
}
public String getNameCity() {
    return nameCity;
}
public void setNameCity(String nameCity) {
    this.nameCity = nameCity;
}
public Country getCountry() {
    return country;
}
public void setCountry(Country country) {
    this.country = country;
}


}
