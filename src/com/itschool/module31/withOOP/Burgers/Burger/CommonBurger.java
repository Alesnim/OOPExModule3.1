package com.itschool.module31.withOOP.Burgers.Burger;

public class CommonBurger extends Burger {
    public CommonBurger() {
        scheme = new String[]{"Хлеб", "Мясо", "Салат"};
        name = "Обычный бургер";
        type = BurgerType.COMMON;
    }
}
