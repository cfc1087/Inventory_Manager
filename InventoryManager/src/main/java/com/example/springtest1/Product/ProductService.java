/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Product;

import com.example.springtest1.Inventory.InventoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 *
 * @author Christopher
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private InventoryService invService;

    private int numberOfProducts;

    public ProductService() {

    }

    public Page<Product> getProductCatalog(int page) {
    	
        return productRepo.findAll(PageRequest.of(page, 10));
    }
    public List<Product> getProductCatalog() {
    	
    	return productRepo.findAll();
    }

    public Product getProduct(String productId) {
        return productRepo.findById(productId).get();
    }

    public int getNumberOfProducts() {
        numberOfProducts = productRepo.findAll().size();
        return numberOfProducts;
    }

    public void addProductToCatalog(Product newProduct) {
        productRepo.insert(newProduct);//CHECK FOR DUPLICATES
        
        invService.addNewProduct(newProduct, 0);

    }

    public void adjustPrice(String produceId, int price) {
        //TO DO ADJUST PRICE IN CATALOG AND INVENTORY
    }

    public void deleteProduct(String productId) {//TO DO, CHANGE TO PRODUCT ID, CHECK FOR DUPLICATES
        if (!productRepo.existsById(productId)) {
            System.out.println("DOES NOT EXIST");
            return;

        }
        
        invService.deleteProduct(productId);
        productRepo.deleteById(productId);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
        

    }

}
