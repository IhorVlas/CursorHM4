package com.company;

public class Circle extends PlaneShape {

    int xA, xB, yA, yB;
    double distanceAB;
    double circleLength, circleArea;

    public Circle(int xA, int xB, int yA, int yB) {
        this.xA = xA;
        this.xB = xB;
        this.yA = yA;
        this.yB = yB;

    }

    @Override
    public void getPerimeter() {
        distanceAB = Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2));
        circleLength = 2 * 3.14 * distanceAB;
        System.out.println("Circle: " + "radius = " + String.format("%.2f",distanceAB));
        System.out.printf("Circle perimeter = " + "%.2f%n", circleLength);
    }

    @Override
    public void getArea() {
        circleArea = 3.14 * distanceAB * distanceAB;
        System.out.println("Circle area = " + String.format("%.2f%n", circleArea));
    }
}
