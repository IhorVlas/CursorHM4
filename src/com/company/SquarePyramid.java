package com.company;

public class SquarePyramid extends SpaceShape {

    double distanceAB, distanceBC, distanceAD, pyramidArea, pyramidVolume;

    public SquarePyramid(Vertex[] vertices) {
        super(vertices);
    }

    @Override
    public double getArea() {
        distanceAB = distance(getVertices()[0], getVertices()[1]);
        distanceBC = distance(getVertices()[1], getVertices()[2]);
        distanceAD = distance(getVertices()[0], getVertices()[3]);
        pyramidArea = (Math.pow(distanceBC, 2)) + (2 * distanceBC * Math.sqrt(Math.pow(distanceAB, 2) - (Math.pow(distanceBC, 2) / 4)));
        return pyramidArea;
    }

    @Override
    public double getVolume() {
        pyramidVolume = distanceAD / 3 * Math.pow(distanceBC, 2);
        return pyramidVolume;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" + " A: " + getVertices()[0].toString() + " B: " + getVertices()[1].toString() +
                " C: " + getVertices()[2].toString() + " D: " + getVertices()[3].toString() +
                " pyramidArea=" + String.format("%.2f", pyramidArea) +
                ", pyramidVolume=" + String.format("%.2f", pyramidVolume) +
                '}';
    }
}
