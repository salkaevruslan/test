package org.example;

import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.Rabbit;
import org.example.books.Book;
import org.example.figures.Circle;
import org.example.figures.Point;
import org.example.figures.Rectangle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> authors = List.of("Author1", "Author2", "Author3");
        Book b1 = new Book("title", authors, 228);
        Book b2 = new Book("title2", authors, 15);
        Book b3 = new Book("title3", authors, 1.13);
        System.out.println(b1);
        Book[] bookArray = {b1, b2, b3};
        for (Book book : bookArray) {
            System.out.println(book);
        }
        //-----
        Circle c = new Circle("circle1", "red", new Point(0, 0), 10);
        Circle c2 = new Circle("circle2", "blue", new Point(10, 10), 5);
        Rectangle r = new Rectangle("rectangle1", "yellow", new Point(0, 0), 10, 10);
        Rectangle r2 = new Rectangle("rectangle2", "green", new Point(2, 2), 5, 2);

        //print out the objects
        System.out.println(c);
        System.out.println(c2);
        System.out.println(r);
        System.out.println(r2);

        // following code not required when toString() methods enhanced

        System.out.println(c + ", CentrePoint is: " +
                c.getCentrePoint() + ", Area is: " + c.getArea());
        System.out.println(c2 + ", CentrePoint is: " +
                c2.getCentrePoint() + ", Area is: " + c2.getArea());
        System.out.println(r + ", CentrePoint is: "
                + r.getCentrePoint() + ", Area is: " + r.getArea()
                + ". Is it square? " + r.isSquare());
        System.out.println(r2 + ", CentrePoint is: ");


        //---------
        Cat cat = new Cat("Whiskers", 10);
        Cat cat2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit rabbit = new Rabbit("Peter", 2);
        Rabbit rabbit2 = new Rabbit("Cottontail", 3);
        // Ex7-2 Task2
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(cat2);
        animalList.add(d);
        animalList.add(rabbit);
        animalList.add(rabbit2);
        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat);
        catList.add(cat2);
        System.out.println("For Loop on ArrayList");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
        // Ex7-2 Task3
        HashMap<String, Animal> animalMap =
                new HashMap<>();
        animalMap.put(c.getName(), cat);
        animalMap.put(c2.getName(), cat2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), rabbit);
        System.out.println("\nFinding Spot.");
        for (Animal a : animalList) {
            if (a.getName().equals("Spot")) {
                System.out.println(
                        "Found Spot in the ArrayList: " + a);
            }
        }
        Collections.sort(animalList);
        System.out.println("Sorted animal list");
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
        TreeMap<String, Animal> tree = new TreeMap<>(animalMap);
        System.out.println("TreeMap");
        for (String key : tree.keySet()) {
            System.out.println("Key: " + key + " Value: " +
                    tree.get(key));
        }
    }
}