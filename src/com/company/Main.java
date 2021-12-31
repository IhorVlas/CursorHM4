package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,3,5,5, 2, 3);
        Triangle triangle = new Triangle(2,2,4,5,8,5);
        Circle circle = new Circle(2,3,6, 2);

        Cuboid cuboid = new Cuboid(2, 3, 4, 5);
        Sphere sphere = new Sphere(2,3,4,5);
        SquarePyramid squarePyramid = new SquarePyramid(2,4,4,6,4,5,3,3);

        rectangle.getPerimeter();
        rectangle.getArea();
        triangle.getPerimeter();
        triangle.getArea();
        circle.getPerimeter();
        circle.getArea();

        cuboid.getArea();
        cuboid.getVolume();
        sphere.getArea();
        sphere.getVolume();
        squarePyramid.getArea();
        squarePyramid.getVolume();

    }
}
