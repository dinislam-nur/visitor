package ru.iteco.visitor;

public interface Visitor {

    void doOn(Triangle triangle);

    void doOn(Rectangle rectangle);

    void doOn(Circle circle);
}
