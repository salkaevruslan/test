package org.example.animals;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Cat" + super.getName();
    }

    @Override
    public String move() {
        return "Cat move";
    }

    public String toString() {
        return "Cat: " + super.toString();
    }

}