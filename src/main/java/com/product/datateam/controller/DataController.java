package com.product.datateam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.datateam.dto.ShopperAndProductDTO;
import com.product.datateam.service.DataService;

@RestController
public class DataController {

	@Autowired
	private DataService shopperService;
	
	@GetMapping("/products")
	public ShopperAndProductDTO getShopperDetails(){
		return shopperService.getShopperAndProductdetails();
		
	}
	
	
}
