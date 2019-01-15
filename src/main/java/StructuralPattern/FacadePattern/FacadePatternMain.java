package StructuralPattern.FacadePattern;

public class FacadePatternMain extends Square {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
    }
}
