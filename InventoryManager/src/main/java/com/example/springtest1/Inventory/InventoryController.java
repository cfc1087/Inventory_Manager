/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springtest1.Inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author Christopher
 */
@Controller
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

	@GetMapping
	public String getCatalog(Model model, @RequestParam(defaultValue = "0") int page) {
		System.out.println("PRODUCT CONTROLLER");
		model.addAttribute("products", inventoryService.getInventory(page));
		model.addAttribute("currentPage", page);
		return "inventory";
	}
	@GetMapping("/findOne")
	@ResponseBody
	public Inventory findOne(String id) {
		System.out.println("FIND ONE IN PRODUCT CONTROLLER");
		return inventoryService.getProductInventory(id);
	}
    

    @RequestMapping(method = RequestMethod.POST, value = "/inventory/{id}")
    public void adjustQuantity(@PathVariable String id, int quantity) {//NEED @REQUESTBODY
       inventoryService.adjustQuantity(id, quantity);
    }
    
    //To delete products from inventory, delete from catalog.

}
