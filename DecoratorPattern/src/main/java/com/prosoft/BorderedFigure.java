package com.prosoft;

/**
 * Класс BorderedFigure реализует фигуры Circle, Rectangle с бордюрами (декорация)
 * без необходимости создания классов BorderedCircle, BorderedRectangle
 */
public class BorderedFigure implements Figure {

    private final Figure figure;

    public BorderedFigure(Figure figure) {
        this.figure = figure;
    }

    @Override
    public void print() {

    }
}
