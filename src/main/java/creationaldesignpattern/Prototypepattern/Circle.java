package creationaldesignpattern.Prototypepattern;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circla class draw method");
    }
}
