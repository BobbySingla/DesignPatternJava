package creationaldesignpattern.Prototypepattern;

import java.util.Hashtable;

public class ShapeCache  {
    private static Hashtable<String,Shape> stringShapeHashtable=new Hashtable<String, Shape>();
    public static Shape getShape(String shapeid) {
        Shape cacheshape = stringShapeHashtable.get(shapeid);
        return (Shape) cacheshape.clone();
    }
        static void loadCache() {
            Circle circle = new Circle();
            circle.setId("1");
            stringShapeHashtable.put(circle.getId(),circle);
            Rectangle rectangle=new Rectangle();
            rectangle.setId("2");
            stringShapeHashtable.put(rectangle.getId(),rectangle);
            Square square=new Square();
            square.setId("3");
            stringShapeHashtable.put(square.getId(),square);
        }
    }

