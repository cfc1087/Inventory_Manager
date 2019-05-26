/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Christopher
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    @Query(value = "{name:?0}")
    public Product findByProductName(String name);

    
    public boolean existsByName(String name);
}
