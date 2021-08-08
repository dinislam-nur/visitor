package ru.iteco.visitor;

public class Rectangle extends AbstractFigure{

    private final Point two;
    private final Point three;

    public Rectangle(Point one, Point two, Point three) {
        super(one);
        this.two = two;
        this.three = three;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doOn(this);
    }

    public Point getTwo() {
        return two;
    }

    public Point getThree() {
        return three;
    }
}
