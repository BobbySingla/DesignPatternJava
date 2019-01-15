package StructuralPattern.DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal color : ");
        circle.draw();
        System.out.println("Circle with red color : ");
        redCircle.draw();
        System.out.println("Rectangle with red color : ");
        redRectangle.draw();
    }
}
