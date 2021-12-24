package com.itschool.module31.withOOP.Burgers.Burger;

public class LightBurger extends Burger {

    public LightBurger() {
        scheme = new String[]{"Хлеб", "Мясо"};
        name = "Простой бургер";
        type = BurgerType.LIGTH;
    }
}
