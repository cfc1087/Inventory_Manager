/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Inventory;



import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;


/**
 *
 * @author Christopher
 */
@Repository
public interface InventoryRepository extends MongoRepository<Inventory,String>{

   
   public Inventory findByProductId(String id);
   
   public boolean existsByProductId(String productId);


}
