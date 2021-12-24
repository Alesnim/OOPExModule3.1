package com.itschool.module31.withOOP.Burgers.Burger;

import com.itschool.module31.withOOP.Burgers.Dish;

public abstract class Burger extends Dish {
    protected String[] scheme;
    protected BurgerType type;



    public String[] getScheme() {
        return scheme;
    }

    public int getType() {
        return -1;
    }

    public String getName() {
        return name;
    }
}

