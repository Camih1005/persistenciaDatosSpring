package com.tallerwebdataspringboot.webdataspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(columnDefinition = "VARCHAR(150)",nullable = false)
private String name;
@Column(columnDefinition = "decimal(10,2)",nullable = false)
private double price;
@Column(nullable = false)
private int stock;
@Column(nullable = false)
private int stockmin;
@Column(nullable = false)
private int stockmax;



public Product() {
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getStock() {
    return stock;
}
public void setStock(int stock) {
    this.stock = stock;
}
public int getStockmin() {
    return stockmin;
}
public void setStockmin(int stockmin) {
    this.stockmin = stockmin;
}
public int getStockmax() {
    return stockmax;
}
public void setStockmax(int stockmax) {
    this.stockmax = stockmax;
}


}
