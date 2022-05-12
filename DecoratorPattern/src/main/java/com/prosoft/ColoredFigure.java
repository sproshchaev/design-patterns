package com.prosoft;

/**
 * Класс ColoredFigure реализует фигуры Circle, Rectangle с цветом (декорация)
 * без необходимости создания классов ColoredCircle, ColoredRectangle
 */
public class ColoredFigure implements Figure {

    private final Figure figure;

    public ColoredFigure(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void print() {
        figure.print();
        System.out.print(" with color");
    }
}
