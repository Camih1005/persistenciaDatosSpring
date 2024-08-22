package com.tallerwebdataspringboot.webdataspring.web.controller;

import java.util.List;
import java.util.Optional;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tallerwebdataspringboot.webdataspring.domain.entities.Product;
import com.tallerwebdataspringboot.webdataspring.domain.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController  {

   @Autowired
    private ProductRepository productRepository;

 
@GetMapping("/page")
    public ResponseEntity<Page<Product>> getAllProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "15") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        Page<Product> productPage = productRepository.findAll(pageable);
        
        return ResponseEntity.ok(productPage);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productRepository.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        if (!productRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        product.setId(id);
        Product updatedProduct = productRepository.save(product);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        if (!productRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        productRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
     @PatchMapping("/{id}")
    public ResponseEntity<Product> partiallyUpdateProduct(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        
        if (!optionalProduct.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Product product = optionalProduct.get();
        
        updates.forEach((key, value) -> {
            switch (key) {
                case "name":
                    product.setName((String) value);
                    break;
                case "price":
                    product.setPrice(Double.parseDouble(value.toString()));
                    break;
                case "stock":
                    product.setStock(Integer.parseInt(value.toString()));
                    break;
                case "stockmin":
                    product.setStockmin(Integer.parseInt(value.toString()));
                    break;
                case "stockmax":
                    product.setStockmax(Integer.parseInt(value.toString()));
                    break;
                default:
                    // Ignorar campos desconocidos
                    break;
            }
        });

        Product updatedProduct = productRepository.save(product);
        return ResponseEntity.ok(updatedProduct);
    }

}
