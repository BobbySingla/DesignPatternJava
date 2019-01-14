package StructuralPattern.BridgePattern;

public class BridgePatternMain  {
    public static void main(String[] args) {
        Shape circle=new Circle(4,4,4,new RedCircle());
        Shape circle1=new Circle(4,4,4,new GreenCircle());
        circle.draw();
        circle1.draw();
    }
}
