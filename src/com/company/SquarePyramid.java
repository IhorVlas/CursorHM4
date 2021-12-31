package com.company;

public class SquarePyramid extends SpaceShape{

    int xA, xB, xC, xD, yA, yB, yC, yD;
    double distanceAB, distanceBC, distanceAD, pyramidArea, pyramidVolume;

    public SquarePyramid(int xA, int xB, int xC, int xD, int yA, int yB, int yC, int yD) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
        this.xD = xD;
        this.yA = yA;
        this.yB = yB;
        this.yC = yC;
        this.yD = yD;
    }

    @Override
    public void getArea() {
        distanceAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
        distanceBC = Math.sqrt(Math.pow((xB - xC), 2) + Math.pow((yB - yC), 2));
        distanceAD = Math.sqrt(Math.pow((xA - xD), 2) + Math.pow((yA - yD), 2));
        pyramidArea = 2 * distanceBC * Math.sqrt(Math.pow(distanceAB, 2) - (Math.pow(distanceBC, 2)/4));
        System.out.print("SquarePyramid area = " + String.format("%.2f%n", pyramidArea));
    }

    @Override
    public void getVolume() {
        pyramidVolume = distanceAD/3 * Math.pow(distanceBC, 2);
        System.out.print("SquarePyramid volume = " + String.format("%.2f%n", pyramidVolume));
    }
}
