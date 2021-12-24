package com.itschool.module31.withOOP.Burgers;

public enum OrderType {
    BURGER("Бургер");


    OrderType(String name) {
    }

    @Override
    public String toString() {
        return name();
    }
}
