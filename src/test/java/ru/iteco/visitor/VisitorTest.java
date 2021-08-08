package ru.iteco.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    @Test
    public void test() {
        final Point a = new Point(0, 0);
        final Point b = new Point(0, 1);
        final Point c = new Point(1, 0);
        Figure[] figures = {new Triangle(a, b, c), new Rectangle(a, b, c), new Circle(a, 1)};

        Visitor visitor = new AreaVisitor();
        doAction(figures, visitor);

        visitor = new PerimeterVisitor();
        doAction(figures, visitor);

        visitor = new DrawingVisitor();
        doAction(figures, visitor);
    }

    private void doAction(Figure[] figures, Visitor visitor) {
        for (Figure figure : figures) {
            System.out.println("<========================>");
            figure.accept(visitor);
        }
        System.out.println("");
    }

}