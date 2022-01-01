package com.company;

public class Sphere extends SpaceShape {

    double sphereArea, sphereVolume;

    public Sphere(Vertex[] vertices) {
        super(vertices);
    }

    @Override
    public double getArea() {
        sphereArea = 4 * Math.PI * Math.pow((distance(getVertices()[0], getVertices()[1])), 2);
        return sphereArea;
    }

    @Override
    public double getVolume() {
        sphereVolume = (4 * Math.PI * (Math.pow(distance(getVertices()[0], getVertices()[1]), 3))) / 3;
        return sphereVolume;
    }

    @Override
    public String toString() {
        return "Sphere{" + " A: " + getVertices()[0].toString() + " B: " + getVertices()[1].toString() +
                " sphereArea=" + String.format("%.2f", sphereArea) +
                ", sphereVolume=" + String.format("%.2f", sphereVolume) +
                '}';
    }
}
