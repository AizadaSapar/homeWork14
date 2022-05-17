package com.company;

public class Singer extends Person {
    private String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    void singing() {
        System.out.println(getName() + "is singing. ");
    }

    void playGitar() {
        System.out.println(getName() + "is good playing gitar");
    }

    @Override
    void learn() {
        System.out.println(getName()+"is learn.");
    }

    @Override
    void walk() {
        System.out.println(getName()+"is walking.");
    }

    @Override
    void eat() {
        System.out.println(getName()+"is eating.");
    }

    @Override
    public String toString() {
        return "Name " + getName() + "designation " + getDesignation() + "BandName " + getBandName();
    }
}
