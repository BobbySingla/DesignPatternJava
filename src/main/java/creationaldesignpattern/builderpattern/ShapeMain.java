package creationaldesignpattern.builderpattern;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeDemo shapeDemo =new ShapeDemo();
        Shape shape=shapeDemo.getShape("Circle");
        shape.draw();
    }
}
