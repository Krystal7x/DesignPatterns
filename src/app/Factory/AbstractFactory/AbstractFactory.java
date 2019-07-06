package app.Factory.AbstractFactory;

/**
 * Created by tt on 2017/12/13.
 * //创建工厂的接口
 * 工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，而抽象工厂模式所提供的产品则是衍生自不同的接口或抽象类。
 */
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
