package StructuralPattern.BridgePattern;

public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red Circle of Radius, x, y : "+radius+" "+x+" "+y);
    }
}
