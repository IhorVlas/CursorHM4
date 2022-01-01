package com.company;

public class Circle extends PlaneShape {

    double circleLength, circleArea;

    public Circle(Vertex[] vertices) {
        super(vertices);
    }

    @Override
    public double getPerimeter() {
        circleLength = 2 * Math.PI * distance(getVertices()[0], getVertices()[1]);
        return circleLength;
    }

    @Override
    public double getArea() {
        circleArea = Math.PI * Math.pow(distance(getVertices()[0], getVertices()[1]), 2);
        return circleArea;
    }

    @Override
    public String toString() {
        return "Circle{" + " A: " + getVertices()[0].toString() + " B: " + getVertices()[1].toString() +
                " circleLength=" + String.format("%.2f", circleLength) +
                ", circleArea=" + String.format("%.2f", circleArea) +
                '}';
    }
}
