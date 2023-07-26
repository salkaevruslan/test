package org.example.figures;

public class Circle extends Shape implements Movable {
    private final double radius;

    public Circle(String name, String colour, Point p,
                  double radius) {
        super(name, colour, p);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point getCentrePoint() {
        return new Point(getX(), getY());
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", getArea()="
                + getArea() + ", getCentrePoint()=" + getCentrePoint()
                + ", getX()=" + getX() + ", getY()=" + getY()
                + ", getName()=" + getName() + ", getColour()="
                + getColor();
    }

    @Override
    public Point getCurrentLocation() {
        return this.getCentrePoint();
    }

    @Override
    public void move(double x, double y) {
        this.setX(this.getCentrePoint().getX() + x);
        this.setY(this.getCentrePoint().getY() + y);
    }
}