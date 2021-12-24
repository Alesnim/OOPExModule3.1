package com.itschool.module31.withoutOOP;

import java.util.Scanner;

public class AllChef {
    // Компоненты предметной области
    final String BREAD_TYPE_ONE = "Батон";
    final String BREAD_TYPE_TWO = "Ржаной";
    final String BREAD_TYPE_THREE = "Злаковый";
    final String BREAD_TYPE_FOUR = "Бриош";

    final String MEAT_TYPE_ONE = "Курица";
    final String MEAT_TYPE_TWO = "Говядина";
    final String MEAT_TYPE_THREE = "Свинина";

    final String SALAD_TYPE_ONE = "Обычный салат";
    final String SALAD_TYPE_TWO = "Латук";

    final String CHEESE = "Сыр";

    final int BURGER_TYPE_ONE = 1;
    final int BURGER_TYPE_TWO = 2;
    final int BURGER_TYPE_THREE = 3;


    public AllChef() {
        final int burger_type;
        final String bread;
        final String meat;
        final String salad;
        final boolean cheese;

        Scanner scan = new Scanner(System.in);
        System.out.println("Добрый день, выберите тип бургера: 1 - простой, 2 - обычный, 3 - крутой");
        burger_type = scan.nextInt();
        switch (burger_type) {
            case BURGER_TYPE_ONE:
                System.out.println("Спасибо за заказ начинаем сборку, выберите тип хлеба");
                bread = scan.nextLine();
                switch (bread) {
                    case BREAD_TYPE_ONE:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_ONE);
                        break;
                    case BREAD_TYPE_TWO:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_ONE);
                        break;
                    case BREAD_TYPE_THREE:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_THREE);
                        break;
                    case BREAD_TYPE_FOUR:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_FOUR);
                        break;
                    default:
                        System.out.println("Выберайте только из представленных");
                        break;

                }
                System.out.printf("Выберите тип мяса: %s %s %s%n",
                        MEAT_TYPE_ONE, MEAT_TYPE_TWO, MEAT_TYPE_THREE);
                meat = scan.nextLine();
                switch (meat) {
                    case MEAT_TYPE_ONE:
                        System.out.printf("Вы выбрали %s%n", MEAT_TYPE_ONE);
                        System.out.printf("Собираем ваш заказ: %s %s%n", bread, meat);
                        break;
                }
                System.out.printf("Ваш бургер: Простой %s %s%n", bread, meat);
                break;
            case BURGER_TYPE_TWO:
                System.out.println("Спасибо за заказ начинаем сборку, выберите тип хлеба");
                bread = scan.nextLine();
                switch (bread) {
                    case BREAD_TYPE_ONE:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_ONE);
                        break;
                    case BREAD_TYPE_TWO:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_ONE);
                        break;
                    case BREAD_TYPE_THREE:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_THREE);
                        break;
                    case BREAD_TYPE_FOUR:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_FOUR);
                        break;
                    default:
                        System.out.println("Выберайте только из представленных");
                        break;

                }
                System.out.printf("Выберите тип мяса: %s %s %s%n",
                        MEAT_TYPE_ONE, MEAT_TYPE_TWO, MEAT_TYPE_THREE);
                meat = scan.nextLine();
                switch (meat) {
                    case MEAT_TYPE_ONE:
                        System.out.printf("Вы выбрали %s%n", MEAT_TYPE_ONE);
                        System.out.printf("Собираем ваш заказ: %s %s%n", bread, meat);
                        break;
                }
                // код выше скопирован, поскольку логика та же
                salad = scan.nextLine();
                switch (salad) {
                    case SALAD_TYPE_ONE:
                        System.out.printf("Вы выбрали %s", SALAD_TYPE_ONE);
                        break;
                    case SALAD_TYPE_TWO:
                        System.out.printf("Вы выбрали %s", SALAD_TYPE_TWO);

                }

                System.out.printf("Ваш бургер: Обычный %s %s %s%n", bread, meat, salad);
                break;
            case BURGER_TYPE_THREE:
                System.out.println("Спасибо за заказ начинаем сборку, выберите тип хлеба");

                bread = scan.nextLine();
                switch (bread) {
                    case BREAD_TYPE_ONE:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_ONE);
                        break;
                    case BREAD_TYPE_TWO:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_ONE);
                        break;
                    case BREAD_TYPE_THREE:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_THREE);
                        break;
                    case BREAD_TYPE_FOUR:
                        System.out.printf("Вы выбрали: %s%n", BREAD_TYPE_FOUR);
                        break;
                    default:
                        System.out.println("Выберайте только из представленных");
                        break;

                }
                System.out.printf("Выберите тип мяса: %s %s %s%n",
                        MEAT_TYPE_ONE, MEAT_TYPE_TWO, MEAT_TYPE_THREE);
                meat = scan.nextLine();
                switch (meat) {
                    case MEAT_TYPE_ONE:
                        System.out.printf("Вы выбрали %s%n", MEAT_TYPE_ONE);
                        System.out.printf("Собираем ваш заказ: %s %s%n", bread, meat);
                        break;
                }
                // код выше скопирован, поскольку логика та же
                salad = scan.nextLine();
                switch (salad) {
                    case SALAD_TYPE_ONE:
                        System.out.printf("Вы выбрали %s", SALAD_TYPE_ONE);
                        break;
                    case SALAD_TYPE_TWO:
                        System.out.printf("Вы выбрали %s", SALAD_TYPE_TWO);

                }
                cheese = scan.nextBoolean();
                String cheeseStatus = "Без сыра";
                if (cheese) {
                    cheeseStatus = "C сыром";
                }

                System.out.printf("Ваш бургер: Крутой %s %s %s %s %n", bread, meat, salad, cheeseStatus);
                break;
        }
    }
}
