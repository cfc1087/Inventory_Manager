package com.example.springtest1.View;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springtest1.Inventory.InventoryService;
import com.example.springtest1.Product.Product;
import com.example.springtest1.Product.ProductService;

@Controller
@RequestMapping("/")
public class ViewController {

	@Autowired
	private ProductService productService;
	@Autowired
	InventoryService invSerive;

	@GetMapping
	public String getCatalog(Model model, @RequestParam(defaultValue = "0") int page) {
		System.out.println("VIEW CONTROLLER");
		model.addAttribute("products", productService.getProductCatalog(page));
		model.addAttribute("currentPage", page);
		return "index";

	}

	@GetMapping("/findOne")
	@ResponseBody
	public Product findOne(String id) {
		System.out.println("FIND ONE IN VIEW CONTROLLER");
		return productService.getProduct(id);
	}

	@PutMapping("/new")
	public String newProduct(Product newProduct) {
		productService.addProductToCatalog(newProduct);
		return "redirect:/";
	}

	@PutMapping("/save")
	public String save(Product product) {
		productService.updateProduct(product);
		return "redirect:/";
	}

	@DeleteMapping("/delete")
	public String delete(String id) {

		productService.deleteProduct(id);
		return "redirect:/";
	}

}
