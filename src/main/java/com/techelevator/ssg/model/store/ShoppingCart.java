package com.techelevator.ssg.model.store;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {
	
	public Map<Product, Integer> contents = new LinkedHashMap<>();

	public Map<Product, Integer> getContents() {
		return contents;
	}

	public void setContents(Product product, Integer quantity) {
		Product initialProduct = null;
		
		for(Product prdct : contents.keySet()) {
			if(prdct.getId().equals(product.getId())) {
				initialProduct = prdct;
			}
		}

		if(initialProduct == null) {
			contents.put(product, quantity);
		} else {
			int currentQuantity = contents.get(initialProduct);
			quantity += currentQuantity;
			contents.replace(initialProduct, quantity);
		}
	}
}
