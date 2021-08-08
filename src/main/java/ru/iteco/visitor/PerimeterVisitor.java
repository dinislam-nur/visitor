package ru.iteco.visitor;

import static java.lang.Math.*;

public class PerimeterVisitor implements Visitor {
    @Override
    public void doOn(Triangle triangle) {
        final Point a = triangle.getOne();
        final Point b = triangle.getTwo();
        final Point c = triangle.getThree();
        double perimeter = length(a, b) + length(a, c) + length(b, c);
        System.out.println("Triangle perimeter is " + perimeter);
    }

    @Override
    public void doOn(Rectangle rectangle) {
        final Point a = rectangle.getOne();
        final Point b = rectangle.getTwo();
        final Point c = rectangle.getThree();
        double perimeter = 2 * (length(a, b) + length(a, c));
        System.out.println("Rectangle perimeter is " + perimeter);
    }

    @Override
    public void doOn(Circle circle) {
        final int radius = circle.getRadius();
        double perimeter = 2 * PI * radius;
        System.out.println("Circle perimeter is " + perimeter);
    }

    private double length(Point a, Point b) {
        return sqrt(pow(b.getX() - a.getX(), 2.0) + pow(b.getY() - a.getY(), 2.0));
    }
}
