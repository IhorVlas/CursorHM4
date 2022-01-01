package com.company;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex[] vertices) {
        super(vertices);
    }

    public abstract double getArea();

    public abstract double getVolume();
}
