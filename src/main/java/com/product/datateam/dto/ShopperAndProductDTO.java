package com.product.datateam.dto;

import java.util.List;

import com.product.datateam.entity.Shopper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShopperAndProductDTO {

	private List<Shopper> shopperAndProductDetails;
}
