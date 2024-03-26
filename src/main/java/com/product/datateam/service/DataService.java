package com.product.datateam.service;

import org.springframework.stereotype.Service;

import com.product.datateam.dto.ShopperAndProductDTO;

@Service
public interface DataService {
	
	ShopperAndProductDTO getShopperAndProductdetails();

}
