package com.itschool.module31.withOOP.Burgers;

import com.itschool.module31.withOOP.Burgers.Products.Product;

public class Order {

    private OrderType typeOrder;
    private Dish[] dishes;
    private Product[] components;

    public Order(OrderType typeOrder, Dish[] component, Product[] components) {
        this.typeOrder = typeOrder;
        this.dishes = component;
        this.components = components;
    }

    public OrderType getTypeOrder() {
        return typeOrder;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public Product[] getComponents() {
        return components;
    }
}
