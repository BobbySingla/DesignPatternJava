package creationaldesignpattern.AbstractFactoryPattern;

public class FactoryProducer {

       public static AbstractFactory getMethod(String choice){

           if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeDemo();}
        else if(choice.equalsIgnoreCase("COLOR"))
       {
               return new ColorDemo();
           }
        else
            return null;

}
}

