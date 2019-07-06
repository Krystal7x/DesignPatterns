package app.Factory.AbstractFactory;

/**
 * Created by tt on 2017/12/13.
 */
public class FactoryBMW320 implements AbstractFactory{

    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
