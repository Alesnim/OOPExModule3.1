package com.itschool.module31.withOOP.Burgers;

import java.util.Scanner;

public class BurgerMaker {


    public BurgerMaker(Scanner scaner) {
        OrderMaker orderMaker = new BurgerOrderMaking();
        OrderReader orderReader = new ConsoleBurgerReader(scaner);

        System.out.println(orderMaker.make(orderReader.read()));
    }
}
