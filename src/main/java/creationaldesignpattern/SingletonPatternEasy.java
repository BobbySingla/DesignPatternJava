package creationaldesignpattern;

public class SingletonPatternEasy {
    //Early Instantiation
    private static SingletonPatternEasy instance = new SingletonPatternEasy();

    private SingletonPatternEasy() {
        if (instance != null)
            throw new RuntimeException("used getInstance method to create instance");
    }

    public static SingletonPatternEasy getInstance() {
        return instance;
    }
}
