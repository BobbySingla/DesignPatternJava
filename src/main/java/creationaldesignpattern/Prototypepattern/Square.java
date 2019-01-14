package creationaldesignpattern.Prototypepattern;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square class draw method");
    }
}
