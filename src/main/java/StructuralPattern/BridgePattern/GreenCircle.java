package StructuralPattern.BridgePattern;

public class GreenCircle implements DrawAPI {
        public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Green Circle of Radius, x, y : "+radius+" "+x+" "+y);
    }
}
