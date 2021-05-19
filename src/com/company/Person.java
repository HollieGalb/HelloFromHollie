package com.company;

public class Person implements Greeter{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("Hello Hollie, my name is %s", this.name);
    }
}
