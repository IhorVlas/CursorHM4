package com.company;

public class Triangle extends PlaneShape {

    int xA, xB, xC, yA, yB, yC;
    double distanceAB, distanceBC, distanceCA;
    double trianglePerimeter, triangleArea;

    public Triangle(int xA, int xB, int xC, int yA, int yB, int yC) {
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
        distanceBC = Math.sqrt(Math.pow((xB - xC), 2) + Math.pow((yB - yC), 2));
        distanceCA = Math.sqrt(Math.pow((xC - xA), 2) + Math.pow((yC - yA), 2));
        trianglePerimeter = distanceAB + distanceBC + distanceCA;

        System.out.println("Triangle: " + "AB = " + String.format("%.2f", distanceAB) + ", BC = " + String.format("%.2f", distanceBC) + ", CA = " + String.format("%.2f", distanceCA));
        System.out.printf("Triangle perimeter = " + "%.2f%n", trianglePerimeter);
    }

    @Override
    public void getArea() {
        double p = (trianglePerimeter / 2);
        triangleArea = Math.sqrt(p * (p - distanceAB) * (p - distanceBC) * (p - distanceCA));
        System.out.println("Triangle area = " + String.format("%.2f%n", triangleArea));
    }
}
