package ru.iteco.visitor;

public abstract class AbstractFigure implements Figure {

    private final Point one;

    protected AbstractFigure(Point one) {
        this.one = one;
    }

    public Point getOne() {
        return one;
    }
}
