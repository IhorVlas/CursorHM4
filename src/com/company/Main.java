package com.company;

public class Main {

    public static void main(String[] args) {

        Vertex[] fourVertices = new Vertex[4];
        fourVertices[0] = new Vertex(4, 3);
        fourVertices[1] = new Vertex(5, 6);
        fourVertices[2] = new Vertex(2, 9);
        fourVertices[3] = new Vertex(8, 3);

        Vertex[] threeVertices = new Vertex[3];
        threeVertices[0] = new Vertex(2, 3);
        threeVertices[1] = new Vertex(4, 5);
        threeVertices[2] = new Vertex(5, 6);

        Vertex[] twoVertices = new Vertex[2];
        twoVertices[0] = new Vertex(2, 5);
        twoVertices[1] = new Vertex(4, 6);

        Triangle triangle = new Triangle(threeVertices);
        triangle.getPerimeter();
        triangle.getArea();

        Circle circle = new Circle(twoVertices);
        circle.getPerimeter();
        circle.getArea();

        Rectangle rectangle = new Rectangle(threeVertices);
        rectangle.getPerimeter();
        rectangle.getArea();

        Cuboid cuboid = new Cuboid(threeVertices);
        cuboid.getArea();
        cuboid.getVolume();

        Sphere sphere = new Sphere(twoVertices);
        sphere.getArea();
        sphere.getVolume();

        SquarePyramid squarePyramid = new SquarePyramid(fourVertices);
        squarePyramid.getArea();
        squarePyramid.getVolume();

        Shape[] shape = new Shape[6];
        shape[0] = triangle;
        shape[1] = circle;
        shape[2] = rectangle;
        shape[3] = cuboid;
        shape[4] = sphere;
        shape[5] = squarePyramid;

        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i].toString());
        }
    }
}
