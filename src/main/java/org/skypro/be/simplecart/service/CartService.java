package org.skypro.be.simplecart.service;

import java.util.List;
import java.util.Map;

public interface CartService {

    String addItemsToCart(List<Integer> items);

    Map<Integer, Integer> getItemsFromCart();
}
