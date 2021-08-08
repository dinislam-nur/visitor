package ru.iteco.visitor;

import static java.lang.Math.*;

public class AreaVisitor implements Visitor {

    @Override
    public void doOn(Triangle triangle) {
        final Point a = triangle.getOne();
        final Point b = triangle.getTwo();
        final Point c = triangle.getThree();
        double area = 0.5 * abs((b.getX() - a.getX()) * (c.getY() - a.getY()) -
                (c.getX() - a.getX()) * (b.getY() - a.getY()));
        System.out.println("Triangle area is " + area);
    }

    @Override
    public void doOn(Rectangle rectangle) {
        final Point a = rectangle.getOne();
        final Point b = rectangle.getTwo();
        final Point c = rectangle.getThree();
        double area = length(a, b) * length(a, c);
        System.out.println("Rectangle area is " + area);
    }

    @Override
    public void doOn(Circle circle) {
        final int radius = circle.getRadius();
        double area = PI * pow(radius, 2.0);
        System.out.println("Circle area is " + area);
    }

    private double length(Point a, Point b) {
        return sqrt(pow(b.getX() - a.getX(), 2.0) + pow(b.getY() - a.getY(), 2.0));
    }
}
