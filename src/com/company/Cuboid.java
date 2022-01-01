package com.company;

public class Cuboid extends SpaceShape {

    double cuboidArea, cuboidVolume;

    public Cuboid(Vertex[] vertices) {
        super(vertices);
    }

    @Override
    public double getArea() {
        cuboidArea = 6 * Math.pow(distance(getVertices()[0], getVertices()[1]), 2);
        return cuboidArea;
    }

    @Override
    public double getVolume() {
        cuboidVolume = Math.pow(distance(getVertices()[0], getVertices()[1]), 3);
        return cuboidVolume;
    }

    @Override
    public String toString() {
        return "Cuboid{" + " A: " + getVertices()[0].toString() + " B: " + getVertices()[1].toString() +
                " cuboidArea=" + String.format("%.2f", cuboidArea) +
                ", cuboidVolume=" + String.format("%.2f", cuboidVolume) +
                '}';
    }
}
