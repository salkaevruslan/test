package org.example.books;

import java.util.List;

public class Book {
    private String name;
    private List<String> authors;

    private double price;

    public Book(String name, List<String> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: name=" + name + "; authors=" +
                String.join(", ", authors) + "; price=" + price;
    }
}
