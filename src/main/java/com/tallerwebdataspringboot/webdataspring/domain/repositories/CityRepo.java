package com.tallerwebdataspringboot.webdataspring.domain.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tallerwebdataspringboot.webdataspring.domain.entities.City;


public interface CityRepo extends JpaRepository<City, Long> {

}
