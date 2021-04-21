package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShopCartTest {

    @BeforeEach
    void setUp() {
        ShopCart trolley = new ShopCart();
    }

    @Test
    @DisplayName("Add product to Shopcart")
    void addToShopcart(){
        ShopCart shopcart = new ShopCart();
        Product product = new Product ("Dummy",20.4);
        shopcart.addProduct(product);
        assertNotNull(shopcart.getProducts());
    }

}