package com.techelevator.ssg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCart;

@Controller
@SessionAttributes ("shoppingCart")
public class ShoppingCartController {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping(value="/shoppingCart/index", method=RequestMethod.GET)
	public String displayShopIndex(Model modelHolder) {
		
		List<Product> productList = productDao.getAllProducts();
		
		modelHolder.addAttribute("productList", productList);
		return "shoppingCartIndex";
	}
	
	@RequestMapping(value="/shoppingCart/detail/{id}", method=RequestMethod.GET)
	public String displayShopProductDetails(Model modelHolder, @ModelAttribute Product product) {
		Long id = product.getId();
		modelHolder.addAttribute("product", productDao.getProductById(id));
		return "shoppingCartDetails";
	}
	
	@RequestMapping(value="/shoppingCart/detail/added", method=RequestMethod.POST)
	public String displayShopProductDetails(Model modelHolder, @RequestParam Long productId, @RequestParam Integer quantity) {
		ShoppingCart shoppingCart;
		if(modelHolder.containsAttribute("shoppingCart")) {
			shoppingCart = (ShoppingCart) modelHolder.asMap().get("shoppingCart");
		} else {
			shoppingCart = new ShoppingCart();
			modelHolder.addAttribute("shoppingCart", shoppingCart);
		}
		Product product = productDao.getProductById(productId);
		shoppingCart.setContents(product, quantity);
		return "redirect:/shoppingCart/view";
	}
	
	@RequestMapping(value="/shoppingCart/view", method=RequestMethod.GET)
	public String displayShopCartView(Model modelHolder) {
		return "shoppingCartView";
	}
	
	@RequestMapping(value="/shoppingCart/thankYou", method=RequestMethod.GET)
	public String displayShopCartThankYou(SessionStatus status) {
		status.setComplete();
		return "shoppingCartThankYou";
	}

}
