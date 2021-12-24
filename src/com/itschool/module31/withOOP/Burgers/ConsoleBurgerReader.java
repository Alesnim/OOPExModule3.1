package com.itschool.module31.withOOP.Burgers;

import com.itschool.module31.withOOP.Burgers.Burger.*;
import com.itschool.module31.withOOP.Burgers.Products.*;

import java.util.Scanner;

public class ConsoleBurgerReader implements OrderReader {
    Scanner scanner;

    public ConsoleBurgerReader(Scanner scaner) {
        this.scanner = scaner;
    }

    @Override
    public Order read() {
        int typeOrder = init();
        if (typeOrder == OrderType.BURGER.ordinal()) {
            return burgerRead();
        }

        return null;
    }

    private Order burgerRead() {
        Burger b = readBurgerType(scanner);
        Product[] components = readComponentBurger(b);
        Order o = new Order(OrderType.BURGER, new Dish[]{b}, components);
        return o;
    }

    private Product[] readComponentBurger(Burger b) {
        Product component[] = new Product[b.getScheme().length];
        component[0] = readBread(b);
        component[1] = readMeat(b);
        if (b instanceof CommonBurger) component[2] = readSalad(b);
        if (b instanceof SuperBurger) component[3] = readCheese(b);
        return component;
    }

    private Product readCheese(Burger b) {
        return new Cheese();
    }

    private Product readSalad(Burger b) {
        return new Salad();
    }

    private Product readMeat(Burger b) {
        System.out.println("Выберите мясо");
        Meat m = new Meat();
        for (int i = 0; i < m.getVariants().length; i++) {
            System.out.printf("%d %s %n", i, m.getVariants()[i]);
        }
        int type = scanner.nextInt();
        m.setType(m.getVariants()[type]);

        return m;
    }

    private Product readBread(Burger b) {
        System.out.println("Выберите хлеб");
        Bread bread = new Bread();
        for (int i = 0; i < bread.getVariants().length; i++) {
            System.out.printf("%d %s %n", i, bread.getVariants()[i]);
        }

        int type = scanner.nextInt();
        bread.setType(bread.getVariants()[type]);
        return bread;
    }

    private Burger readBurgerType(Scanner scanner) {
        System.out.println("Выберите тип бургера");
        for (BurgerType bt : BurgerType.values()) {
            System.out.printf("%d %s %n", bt.ordinal(), bt);
        }
        int t = scanner.nextInt();

        if (t == BurgerType.LIGTH.ordinal()) {
            return new LightBurger();
        } else if (t == BurgerType.COMMON.ordinal()) {
            return new CommonBurger();
        } else if (t == BurgerType.SUPER.ordinal()) {
            return new SuperBurger();
        }
        return null;
    }

    private int init() {
        System.out.println("Выберите тип блюда:");
        for (OrderType ot : OrderType.values()) {
            System.out.printf("%d %s %n", ot.ordinal(), ot);
        }
        int t = scanner.nextInt();

        for (OrderType ot : OrderType.values()) {
            if (ot.ordinal() == t) {
                return ot.ordinal();
            }
        }
        return -1;
    }
}
