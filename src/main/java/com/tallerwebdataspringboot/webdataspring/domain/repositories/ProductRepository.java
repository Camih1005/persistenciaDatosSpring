package com.tallerwebdataspringboot.webdataspring.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tallerwebdataspringboot.webdataspring.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
