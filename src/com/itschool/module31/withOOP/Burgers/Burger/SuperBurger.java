package com.itschool.module31.withOOP.Burgers.Burger;

public class SuperBurger extends Burger {
    public SuperBurger() {
        scheme = new String[]{"Хлеб", "Мясо", "Салат", "Сыр"};
        name = "Супер бургер";
        type = BurgerType.SUPER;
    }
}
