/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Christopher
 */
@Controller
@RequestMapping("/catalog")
public class ProductController {

	@Autowired
	private ProductService productService;

	/*
	 * @GetMapping() public List<Product> getProductCatalog() {
	 * System.out.println("test"); return productService.getProductCatalog(); }
	 */

	@GetMapping
	public String getCatalog(Model model, @RequestParam(defaultValue = "0") int page) {
		System.out.println("PRODUCT CONTROLLER");
		model.addAttribute("products", productService.getProductCatalog(page));
		model.addAttribute("currentPage", page);
		return "catalog";
	}

	@GetMapping("/findOne")
	@ResponseBody
	public Product findOne(String id) {
		System.out.println("FIND ONE IN PRODUCT CONTROLLER");
		return productService.getProduct(id);
	}

	/*
	 * @RequestMapping("/{productId}") public Product getProduct(@PathVariable
	 * String productId) { return productService.getProduct(productId); }
	 */

	/*
	 * @RequestMapping(method = RequestMethod.POST, value = "/addProduct") public
	 * void addNewProduct(@RequestBody Product product) {// NEW PRODUCTS ADDED TO
	 * BOTH CATALOG AND // INVENTORY(QUANTITY TO 0 BY DEFAULT)
	 * 
	 * productService.addProductToCatalog(product);
	 * 
	 * }
	 */

	@DeleteMapping("/delete")
	public String deleteProduct(String id) {// DELETES PRODUCTS FROM BOTH THE CATALOG AND INVENTORY
		System.out.println("**********");
		System.out.println("DELETING IN PRODUCT CONTROLLER:" + id);
		System.out.println("***********");
		productService.deleteProduct(id);
		return "redirect:/catalog";

	}

	@PutMapping("/save")
	public String updateProduct(Product product) {
		System.out.println("**********");
		System.out.println("SAVING IN PRODUCT CONTROLLER" + product);
		System.out.println("***********");
		productService.updateProduct(product);
		return "redirect:/catalog";
	}
	
	@PutMapping("/new")
	public String newProduct(Product newProduct) {
		productService.addProductToCatalog(newProduct);
		return "redirect:/catalog";
	}

}
