package creationaldesignpattern.AbstractFactoryPattern;

abstract class AbstractFactory {
abstract Shape getShape(String shape);
abstract public Color getColor(String color);

}
