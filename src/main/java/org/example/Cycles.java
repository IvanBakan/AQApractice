package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Cycles {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};

        for (int number : numbers) {
            System.out.println(number);

            if (number==5) {
                break;
            }
        }


        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");

        for (String month : months) {
            System.out.println(month);
        }


        Random random = new Random ();
        boolean Working;
        int load;

        while (Working=true) {
            load = random.nextInt(101);
            System.out.println("Текущая нагрузка: " + load + "%");

            if (load>85) {
                System.out.println("Крылышки в опасности! Нагрузка - " + load + "%");
                break;
            }
        }

    }
}


