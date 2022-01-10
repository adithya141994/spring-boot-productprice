package com.adithya.productPrice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adithya.productPrice.model.Product;
import com.adithya.productPrice.model.ProductPrice;

@Service
public class ProductPriceService implements IProductPriceService {

	@Override
	public List<ProductPrice> getProductPrice() {

		ArrayList<ProductPrice> productprice = new ArrayList<ProductPrice>();

		productprice.add(new ProductPrice(100, "Mobile", 9000.00));
		productprice.add(new ProductPrice(101, "Smart TV", 60000.00));
		productprice.add(new ProductPrice(102, "Washing Machine", 9000.00));
		productprice.add(new ProductPrice(103, "Laptop", 24000.00));
		productprice.add(new ProductPrice(104, "Air Conditioner", 30000.00));
		productprice.add(new ProductPrice(105, "Refrigerator ", 10000.00));

		return productprice;

	}

}
