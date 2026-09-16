package ru.job4j.tasks;

public class Multiply {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                int multiply = i * j;
                System.out.println(i + " * " + j + " = " + multiply);
                if (j == 10 && i != 10) {
                    System.out.println("- - - - - - -");
                }
            }

        }
    }
}
