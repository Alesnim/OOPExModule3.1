package com.itschool.module31;

import com.itschool.module31.withOOP.Burgers.BurgerMaker;
import com.itschool.module31.withoutOOP.AllChef;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        AllChef a = new AllChef();
        Scanner scanner = new Scanner(System.in);
        BurgerMaker bm = new BurgerMaker(scanner);
    }
}
