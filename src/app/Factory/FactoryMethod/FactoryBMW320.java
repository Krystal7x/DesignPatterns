package app.Factory.FactoryMethod;

/**
 * Created by tt on 2017/12/13.
 */
public class FactoryBMW320 implements FactoryBMW{

    @Override
    public BMW320 createBMW() {

        return new BMW320();
    }

}
