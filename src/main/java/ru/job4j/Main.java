package ru.job4j;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.println("Привет Мир!");
        // git@github.com:mskorolyow/job4j_elementary.git
        StudentInfo studentInfo = new StudentInfo("Max","08.05.1986");
        System.out.println(studentInfo.getName() + " " + studentInfo.getBirthday());
    }
}