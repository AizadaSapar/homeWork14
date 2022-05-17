package com.company;

public class Dancer extends Person {
    private String groupName;


    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void dancing() {
        System.out.println(getName() + "dancing.");
    }

    @Override
    void learn() {
        System.out.println(getName() + " Dancer is dancing. ");
    }

    @Override
    void walk() {
        System.out.println(getName() + "Dancer is walking. ");
    }

    @Override
    void eat() {
        System.out.println(getName() + "Dancer is eating.");
    }

    @Override
    public String toString() {
        return "Dancer " + getName() + "  Designation " + getDesignation() + "  CompanyName  " + getGroupName();
    }
}
