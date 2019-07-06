package app.Factory.SimpleFactory;

/**
 * Created by tt on 2017/12/13.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
