/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Inventory;

import com.example.springtest1.Product.Product;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

/**
 *
 * @author Christopher
 */
@Document(collection = "Inventory")
@Component
public class Inventory {

	@Id
	private String id;
	@Indexed(name = "product_quantity_index", direction = IndexDirection.DESCENDING)
	private int quantity;
	private Product product;
	// private String productId;

	public Inventory() {

	}

	public Inventory(Product product, int quantity) {
		this.product = product;
		// this.productId = product.getId();
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	/*
	 * public String getProductId() { return productId; }
	 */
	public void adjustProductStock(int quantity) {// add new products to inventory
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Inventory Id: " + id + "\n" + product + "\n" + "Product quantity: " + quantity;
	}
}
