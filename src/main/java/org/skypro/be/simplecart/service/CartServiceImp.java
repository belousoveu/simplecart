package org.skypro.be.simplecart.service;


import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SessionScope(proxyMode = ScopedProxyMode.INTERFACES)
public class CartServiceImp implements CartService {
    private Map<Integer, Integer> cart = new HashMap<>();


    public Map<Integer, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Integer, Integer> cart) {
        this.cart = cart;
    }

    public String addItemsToCart(List<Integer> items) {
        items.forEach(item -> cart.put(item, cart.getOrDefault(item, 0) + 1));
        return String.format("Adding %d items to cart", items.size());
    }

    public Map<Integer, Integer> getItemsFromCart() {
        return Collections.unmodifiableMap(cart);
    }
}
