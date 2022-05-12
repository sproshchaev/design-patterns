package com.prosoft;

/**
 * Шаблон Decorator Pattern при его использовании не увеличивается число наследников от Circle, Rectangle
 * создаются новые компоненты (фигура с рамкой/бордюром, фигура в цвете) путем декорирования
 * предидущих
 *
 * Шаблон Decorator Pattern позволяет динамически добавлять объектам новую функциональность,
 * оборачивая их в обертки
 *
 * Вызывающий код работает с декоратором как с обычным объектом, т.к. декоратор реализует
 * тот же интерфейс
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Figure figure = new Circle();
        figure.print();

        System.out.println("");

        Figure borderedFigure = new BorderedFigure(figure);
        borderedFigure.print();

        System.out.println("");

        Figure coloredFigure = new ColoredFigure(figure);
        coloredFigure.print();

        System.out.println("");

        Figure borderedAndColoredFigure = new ColoredFigure(borderedFigure);
        borderedAndColoredFigure.print();

    }
}
