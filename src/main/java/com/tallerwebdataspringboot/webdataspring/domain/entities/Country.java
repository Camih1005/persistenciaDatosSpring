package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
@Id
@Column(name = "id",columnDefinition = "varchar(50)",nullable = false)
private String codecountry;
@Column(columnDefinition = "varchar(50)",nullable = false)
private String nameCountry;



public Country() {
}
public String getCodecountry() {
    return codecountry;
}
public void setCodecountry(String codecountry) {
    this.codecountry = codecountry;
}
public String getNameCountry() {
    return nameCountry;
}
public void setNameCountry(String nameCountry) {
    this.nameCountry = nameCountry;
}


}
