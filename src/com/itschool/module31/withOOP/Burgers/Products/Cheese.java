package com.itschool.module31.withOOP.Burgers.Products;

import com.itschool.module31.withOOP.Burgers.Products.Product;

public class Cheese extends Product {
    public Cheese() {
        variant = false;
        name = "Сыр";
        type = "";
    }


    @Override
    public String getType() {
        return type;
    }
}
