package com.company;

public class Sphere extends SpaceShape {

    int xA, xB, yA, yB;
    double distanceAB, sphereArea, sphereVolume;

    public Sphere(int xA, int xB, int yA, int yB) {
        this.xA = xA;
        this.xB = xB;
        this.yA = yA;
        this.yB = yB;
    }

    @Override
    public void getArea() {
        distanceAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
        sphereArea = (4 * 3.14 * Math.pow((distanceAB), 2));
        System.out.print("Sphere area = " + String.format("%.2f%n", sphereArea));
    }

    @Override
    public void getVolume() {
        sphereVolume = ((4 / 3) * 3.14 * (Math.pow(distanceAB, 3)));
        System.out.println("Sphere volume = " + String.format("%.2f%n", sphereVolume));
    }
}
