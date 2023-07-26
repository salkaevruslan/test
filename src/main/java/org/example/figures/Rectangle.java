package org.example.figures;

public class Rectangle extends Shape {
    private final double height;
    private final double width;

    public Rectangle(String name, String colour, Point p, double width, double height) {
        super(name, colour, p);
        this.width = width;
        this.height = height;
    }

    public boolean isSquare() {
        return (width == height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public Point getCentrePoint() {
        double centreX = getX() + width / 2;
        double centreY = getY() + height / 2;
        return new Point(centreX, centreY);
    }

    @Override
    public String toString() {
        return "Rectangle: height=" + height + ", width=" + width
                + ", isSquare()=" + isSquare() + ", getArea()="
                + getArea() + ", getCentrePoint()=" + getCentrePoint()
                + ", getX()=" + getX() + ", getY()=" + getY()
                + ", getName()=" + getName() + ", getColour()="
                + getColor();
    }
}