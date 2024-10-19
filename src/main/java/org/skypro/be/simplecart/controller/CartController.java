package org.skypro.be.simplecart.controller;


import org.skypro.be.simplecart.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/add")
    public String addItemsToCart(@RequestParam("item") List<Integer> items) {
        return cartService.addItemsToCart(items);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> getItemsFromCart() {
        return cartService.getItemsFromCart();
    }
}
