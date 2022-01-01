package com.company;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    public PlaneShape(Vertex[] vertices) {
        super(vertices);
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}
