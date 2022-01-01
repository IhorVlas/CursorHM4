package com.company;

public class Triangle extends PlaneShape {

    private double trianglePerimeter, triangleArea;

    public Triangle(Vertex[] vertices) {
        super(vertices);
    }

    @Override
    public double getPerimeter() {
        trianglePerimeter = (distance(getVertices()[0], getVertices()[1]) + distance(getVertices()[1], getVertices()[2]) + distance(getVertices()[2], getVertices()[0]));
        return trianglePerimeter;
    }

    @Override
    public double getArea() {
        double p = (trianglePerimeter / 2);
        triangleArea = Math.sqrt(p * (p - (distance(getVertices()[0], getVertices()[1]))) *
                (p - (distance(getVertices()[1], getVertices()[2]))) * (p - (distance(getVertices()[2], getVertices()[0]))));
        return triangleArea;
    }

    @Override
    public String toString() {
        return "Triangle{" + " A: " + getVertices()[0].toString() + " B: " + getVertices()[1].toString() +
                " C: " + getVertices()[2].toString() +
                " trianglePerimeter=" + String.format("%.2f", trianglePerimeter) +
                ", triangleArea=" + triangleArea +
                '}';
    }
}
