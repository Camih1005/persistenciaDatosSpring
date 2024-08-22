package com.tallerwebdataspringboot.webdataspring.web.controller;
import java.util.List;
import java.util.Optional;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tallerwebdataspringboot.webdataspring.domain.entities.City;
import com.tallerwebdataspringboot.webdataspring.domain.entities.Product;
import com.tallerwebdataspringboot.webdataspring.domain.repositories.CityRepo;
import com.tallerwebdataspringboot.webdataspring.domain.repositories.ProductRepository;

@RestController
@RequestMapping("/api/city")
public class CityController {
     @Autowired
    private CityRepo cityRepo;

 @GetMapping
    public List<City> getAllProducts() {
        return cityRepo.findAll();
    }

}
