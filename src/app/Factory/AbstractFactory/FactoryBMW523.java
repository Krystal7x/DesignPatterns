package app.Factory.AbstractFactory;

/**
 * Created by k on 2017/12/13.
 */
//宝马523系列
public class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }

}
