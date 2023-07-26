package org.example.figures;

public abstract class Shape {
    private String name;
    private String color;
    private Point p;

    public Shape(String name, String color, Point p) {
        this.name = name;
        this.color = color;
        this.p = p;
    }

    //getters and setters
    public double getX() {
        return p.getX();
    }

    public void setX(double x) {
        p.setX(x);
    }

    public double getY() {
        return p.getY();
    }

    public void setY(double y) {
        p.setY(y);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract Point getCentrePoint();
}
