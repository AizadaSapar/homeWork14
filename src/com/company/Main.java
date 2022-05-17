package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Maksat  ", "projectManager  ", "Google");
        System.out.println(programmer);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();


        Dancer dancer = new Dancer("Ainura  ", "lider", "Tumar");
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();

        Singer singer = new Singer("imani  ", "singer ", "solo ");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.eat();
        singer.learn();
        singer.walk();

    }
}

