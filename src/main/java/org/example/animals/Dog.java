package org.example.animals;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "DOG: " + super.getName();
    }

    @Override
    public String move() {
        return "Dog move";
    }

    public String toString() {
        return "Dog: " + super.toString();
    }
}
