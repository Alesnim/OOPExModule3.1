package com.itschool.module31.withOOP.Burgers;

import com.itschool.module31.withOOP.Burgers.Products.Product;

public class BurgerOrderMaking implements OrderMaker {
    @Override
    public String make(Order order) {
        StringBuilder res = new StringBuilder();
        res.append("Вы выбрали: \n");
        for (Dish d : order.getDishes()) {
            res.append(String.format("%s%n", d.name));
        }
        for (Product p : order.getComponents()) {
            res.append(String.format("%s: %s%n", p.getName(), p.getType()));
        }

        return res.toString();
    }
}
