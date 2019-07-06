package app.Factory.FactoryMethod;

/**
 * Created by tt on 2017/12/13.
 */
public class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {

        return new BMW523();
    }
}
