package StructuralPattern.FlyWeightPattern;

import java.awt.*;

public class FlyWeightMain extends ShapeFactory {
    private final static String [] colors={"Red","Blue","White","Golden"};
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
    ShapeFactory shapeFactory=new ShapeFactory();

    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }





}
