package com.company;

public class Cuboid extends SpaceShape{

    int xA, xB, yA, yB;
    double distanceAB, cuboidArea, cuboidVolume;

    public Cuboid(int xA, int xB, int yA, int yB) {
        this.xA = xA;
        this.xB = xB;
        this.yA = yA;
        this.yB = yB;
    }

    @Override
    public void getArea() {
        distanceAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
        cuboidArea = 6 * 2 * distanceAB;
        System.out.print("Cuboid area = " + String.format("%.2f%n", cuboidArea));
    }

    @Override
    public void getVolume() {
        cuboidVolume = Math.pow(distanceAB, 3);
        System.out.println("Cuboid volume = " + String.format("%.2f%n", cuboidVolume));
    }
}
