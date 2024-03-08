package com.mybank;

public class Individual {

    private String name;
    private int age;

    public Individual(String name) {
        this.name = name;
    }

    public Individual(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
