package com.itschool.module31.withOOP.Burgers.Burger;

public enum BurgerType {
    LIGTH(1, "Простой"), COMMON(2, "Обычный"), SUPER(3, "Супер");

    BurgerType(int i, String name) {
    }

    @Override
    public String toString() {
        return name();
    }
}
