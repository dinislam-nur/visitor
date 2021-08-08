package ru.iteco.visitor;

public class DrawingVisitor implements Visitor {

    @Override
    public void doOn(Triangle triangle) {
        System.out.println("Triangle is drawn at three points:");
        System.out.println(triangle.getOne());
        System.out.println(triangle.getTwo());
        System.out.println(triangle.getThree());
    }

    @Override
    public void doOn(Rectangle rectangle) {
        System.out.println("Rectangle is drawn at three points:");
        System.out.println(rectangle.getOne());
        System.out.println(rectangle.getTwo());
        System.out.println(rectangle.getThree());
    }

    @Override
    public void doOn(Circle circle) {
        System.out.println("Circle is drawn at point " + circle.getOne() + " and radius "
                + circle.getRadius());
    }
}
