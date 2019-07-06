package app.Singleton;

/**
 * Created by tt on 2017/12/13.
 * Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (instance== null)检查，这样就可以保    证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (instance== null)，直接return实例化对象。
 优点：线程安全；延迟加载；效率较高。
 */
public class Singleton2 {
    /**
     * 懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
     */
    private static Singleton2 instance=null;

    private Singleton2() {};

    public static Singleton2 getInstance(){
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
