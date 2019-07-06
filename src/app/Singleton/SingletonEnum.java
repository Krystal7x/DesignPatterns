package app.Singleton;

/**
 * Created by k on 2017/12/13.
 * 可以看到枚举的书写非常简单，访问也很简单在这里SingletonEnum.instance这里的instance即为SingletonEnum类型的引用所以得到它就可以调用枚举中的方法了。
 */
public enum SingletonEnum {

    instance;

    private SingletonEnum() {}

    public void method(){
    }
}
