package StructuralPattern.DecoratorPattern;

public abstract class ShapeDecorator implements Shape {
    protected Shape shapeDecorator;

    ShapeDecorator(Shape shapeDecorator) {
        this.shapeDecorator = shapeDecorator;
    }

    public void draw() {
        shapeDecorator.draw();
    }
}
