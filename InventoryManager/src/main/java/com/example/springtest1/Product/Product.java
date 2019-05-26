/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

/**
 *
 * @author Christopher
 */
@Document(collection = "Product_Catalog")
@Component
public class Product {

    @Id
    private String id;
    
    @Indexed(name = "product_name_index", direction = IndexDirection.ASCENDING)
    private String name;
    
    @Indexed(name = "product_price_index", direction = IndexDirection.ASCENDING)
    private int price;


    
    public Product() {

    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

  
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setId(String id) {
    	this.id = id;
    }

    @Override
    public String toString() {
        return "Product Id: " + id + "\n"
                + "Product name: " + name + "\n"
                + "Product price: $" + price;
    }

}
