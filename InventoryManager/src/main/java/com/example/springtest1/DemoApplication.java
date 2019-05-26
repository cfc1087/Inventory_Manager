package com.example.springtest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springtest1.Inventory.InventoryRepository;
import com.example.springtest1.Product.Product;
import com.example.springtest1.Product.ProductRepository;
import com.example.springtest1.Product.ProductService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository proRepo;
	@Autowired
	private InventoryRepository invRepo;

	@Autowired
	private ProductService proserv;

	public static void main(String args[]) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		invRepo.deleteAll();
		proRepo.deleteAll();
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));
		proserv.addProductToCatalog(new Product("Milk", 123));
		proserv.addProductToCatalog(new Product("soup", 456));
		proserv.addProductToCatalog(new Product("water", 789));
		proserv.addProductToCatalog(new Product("chips", 111));

	}

}
