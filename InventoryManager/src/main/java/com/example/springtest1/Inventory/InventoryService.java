/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Inventory;

import com.example.springtest1.Product.Product;
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
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepo;

	public List<Inventory> getInventory() {
		return inventoryRepo.findAll();
	}

	public void adjustQuantity(String id, int quantity) {

		if (!inventoryRepo.existsById(id)) {
//***********TO DO*************
		}
	}

	public void addNewProduct(Product product, int quantity) {
		// System.out.println(product);
		inventoryRepo.save(new Inventory(product, quantity));
	}

	public void adjustPrice(String productId, int newPrice) {
		// TO DO, ADJUST PRICE OF GIVEN PRODUCT_ID
	}

	public Inventory getProductInventory(String productId) {

		return inventoryRepo.findByProductId(productId);
	}

	public void deleteProduct(String productId) {

		if (!inventoryRepo.existsByProductId(productId)) {
			System.out.println("PRODUCT DOES NOT EXIST IN INVENTORY");
			return;
		}
		inventoryRepo.delete(inventoryRepo.findByProductId(productId));
	}

	public Page<Inventory> getInventory(int page) {

		return inventoryRepo.findAll(PageRequest.of(page, 10));
	}

	// INDEX BY QUANTITY
	// INDEX BY PRICE

}
