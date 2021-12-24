package com.itschool.module31.withOOP.Burgers.Products;

public class Meat extends Product {

    public Meat() {
        variant = true;
        name = "Мясо";
        variants = new String[]{"Курица", "Говядина", "Рыба"};
    }

    public void setType(String t) {
        type = t;
    }


    public String[] getVariants() {
        return variants;
    }
}
