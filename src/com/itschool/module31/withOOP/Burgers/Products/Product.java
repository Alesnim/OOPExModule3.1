package com.itschool.module31.withOOP.Burgers.Products;

public abstract class Product {
    protected String name;
    protected boolean variant;
    protected String[] variants = {""};
    protected String type;

    public Product() {
        variant = false;
        name = "";

    }

    protected void initType(int type) {
        for (int i = 1; i < variants.length; i++) {
            if (type == i) this.type = variants[i];
        }
    }


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
