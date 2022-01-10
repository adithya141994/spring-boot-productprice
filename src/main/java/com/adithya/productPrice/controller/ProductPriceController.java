package com.adithya.productPrice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adithya.productPrice.model.Product;
import com.adithya.productPrice.model.ProductPrice;
import com.adithya.productPrice.service.IProductPriceService;

@RestController
public class ProductPriceController {

	@Autowired
	private IProductPriceService productPriceService;

	@GetMapping(value = "/productprice")
	public List<ProductPrice> getProductPrice() {
		System.out.println("In Product Price Controller");
		List<ProductPrice> productPrices = productPriceService.getProductPrice();

		return productPrices;

	}

}
