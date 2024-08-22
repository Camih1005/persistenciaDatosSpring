package com.tallerwebdataspringboot.webdataspring.domain.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "idiomas")
public class Language {
@Getter
@Setter
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Getter
@Setter
@Column(name = "nombre",columnDefinition = "varchar(50)")
private String nameLanguage;
@Getter
@Setter
@Column(name = "UA")
private LocalDateTime ultimaActualizacion;

}
