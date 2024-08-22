package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adress {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String address;
private String address2;

}
