package creationaldesignpattern.AbstractFactoryPattern;

public class Admin {

    public static void main(String[] args) {
        AbstractFactory factoryProducer=FactoryProducer.getMethod("SHAPE");
        Shape shape=factoryProducer.getShape("Circle");
        shape.draw();
        AbstractFactory factoryProducer1=FactoryProducer.getMethod("COLOR");
        Color color=factoryProducer1.getColor("Red");
        color.fillColor();




    }

}

