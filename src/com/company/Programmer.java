package com.company;

public class Programmer extends Person{
    private String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    void coding(){
        System.out.println(getName()+" is writing cod.");
    }

    @Override
    void learn() {
        System.out.println(getName()+" is study.");
    }

    @Override
    void walk() {
        System.out.println(getName()+" is walking.");
    }

    @Override
    void eat() {
        System.out.println(getName()+" is eating.");
    }

    @Override
    public String toString() {
        return " Name is " + getName() + " Designation is " + getDesignation() + " CompanyName " + getCompanyName();

    }
}
