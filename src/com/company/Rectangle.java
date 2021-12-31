package com.company;

public class Rectangle extends PlaneShape {

    int xA, xB, xC, yA, yB, yC;
    double distanceAB, distanceAC;
    double rectanglePerimeter, rectangleArea;

    public Rectangle(int xA, int xB, int xC, int yA, int yB, int yC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
        this.yA = yA;
        this.yB = yB;
        this.yC = yC;
    }

    @Override
    public void getPerimeter() {
        distanceAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
        distanceAC = Math.sqrt(Math.pow((xA - xC), 2) + Math.pow((yA - yC), 2));
        rectanglePerimeter = 2 * (distanceAB + distanceAC);
        System.out.println("Rectangle: width = " + String.format("%.2f",distanceAB) + ", height = " + String.format("%.2f",distanceAC));
        System.out.println("Rectangle perimeter = " + String.format("%.2f",rectanglePerimeter));
    }

    @Override
    public void getArea() {
        rectangleArea = distanceAB * distanceAC;
        System.out.println("Rectangle area = " + String.format("%.2f",rectangleArea) + "\n");
    }
}