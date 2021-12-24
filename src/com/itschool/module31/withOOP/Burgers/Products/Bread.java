package com.itschool.module31.withOOP.Burgers.Products;

public class Bread extends Product {


    public Bread() {
        variant = true;
        name = "Хлеб";
        variants = new String[]{"Батон", "Ржаной", "Злаковый", "Бриош"};
    }

    public void setType(String t) {
        type = t;
    }


    public String[] getVariants() {
        return variants;
    }
}
