package ru.iteco.visitor;

public class Circle extends AbstractFigure {

    private final int radius;

    public Circle(Point one, int radius) {
        super(one);
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doOn(this);
    }

    public int getRadius() {
        return radius;
    }
}
