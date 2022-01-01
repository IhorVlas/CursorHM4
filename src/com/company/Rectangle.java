package com.company;

public class Rectangle extends PlaneShape {

    double rectanglePerimeter, rectangleArea;

    public Rectangle(Vertex[] vertices) {
        super(vertices);
    }

    @Override
    public double getPerimeter() {
        rectanglePerimeter = 2 * (distance(getVertices()[0], getVertices()[1]) + distance(getVertices()[1], getVertices()[2]));
        return rectanglePerimeter;
    }

    @Override
    public double getArea() {
        rectangleArea = (distance(getVertices()[0], getVertices()[1])) * (distance(getVertices()[1], getVertices()[2]));
        return rectangleArea;
    }

    @Override
    public String toString() {
        return "Rectangle{" + " A: " + getVertices()[0].toString() + " B: " + getVertices()[1].toString() +
                " C: " + getVertices()[2].toString() +
                " rectanglePerimeter=" + String.format("%.2f", rectanglePerimeter) +
                ", rectangleArea=" + String.format("%.2f", rectangleArea) +
                '}';
    }
}