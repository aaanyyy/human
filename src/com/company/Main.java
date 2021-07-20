package com.company;

public class Main {

    public static void main(String[] args) {

        Human Human1=new Human("Ivanov","Ivan","Ivanovich");
        Human Human2=new Human("Petrov","Ivan");

        System.out.println(Human1.getFullName());
        System.out.println(Human1.getShortName());
        System.out.println(Human2.getFullName());
        System.out.println(Human2.getShortName());

    }
}
