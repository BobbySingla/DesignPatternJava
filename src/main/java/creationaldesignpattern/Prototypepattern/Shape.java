package creationaldesignpattern.Prototypepattern;

public abstract class Shape implements Cloneable{
    abstract public void draw();
    String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public Object clone(){
        Object clone=null;
        try {
            clone=super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }
}
