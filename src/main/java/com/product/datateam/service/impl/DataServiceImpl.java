package com.product.datateam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.datateam.dto.ShopperAndProductDTO;
import com.product.datateam.entity.Shopper;
import com.product.datateam.repository.ShopperRepository;
import com.product.datateam.service.DataService;


@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private ShopperRepository shopperRepository;
	
	@Override
	public ShopperAndProductDTO getShopperAndProductdetails() {
		List<Shopper> shopperDetails =  shopperRepository.findAll();
		return ShopperAndProductDTO.builder().shopperAndProductDetails(shopperDetails).build();
	}

}
