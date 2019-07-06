package app;

public class Main {

    public static void main(String[] args) {
	    //write your code here
        /**
         1
         */
        //Observer观察者模式

        /**
         2
         */
        //Factory工厂模式 http://blog.csdn.net/jason0539/article/details/23020989
        /*
            1）简单工厂模式（Simple Factory）
            2）工厂方法模式（Factory Method）
            3）抽象工厂模式（Abstract Factory
            简单工厂模式（Simple Factory）看为工厂方法模式的一种特例，两者归为一类
            工厂方法模式：
            一个抽象产品类，可以派生出多个具体产品类。
            一个抽象工厂类，可以派生出多个具体工厂类。
            每个具体工厂类只能创建一个具体产品类的实例。
            抽象工厂模式：
            多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。
            一个抽象工厂类，可以派生出多个具体工厂类。
            每个具体工厂类可以创建多个具体产品类的实例。
            区别：
            工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。
            工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
        */

        /**
         3
         */
        //Singleton 单例设计模式 http://blog.csdn.net/dmk877/article/details/50311791

        /**
         4
         */
        //Strategy 策略模式 http://blog.csdn.net/lmj623565791/article/details/24116745
        /*
        *定义了算法族，分别封装起来，让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
        */

        /**
         5
         */
        //Adapter 适配器模式 http://blog.csdn.net/lmj623565791/article/details/25833393
        /*
        * 将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
        */

        /**
         6
         */
        //Command http://blog.csdn.net/lmj623565791/article/details/24602057
        /*
         将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
         命令模式就是把命令封装成对象，然后将动作请求者与动作执行者完全解耦，上例中遥控器的按钮和电器一毛钱关系都没吧。
         还记得定义中提到了队列，命令模式如何用于队列呢，比如饭店有很多个点菜的地方，有一个做菜的地方，把点菜看作命令，做菜看作命令执行者，不断有人点菜就相当于把菜加入队列，对于做菜的只管从队列里面取，取一个做一个。
         定义中还提到了日志，日志一般用于记录用户行为，或者在异常时恢复时用的，比如每个命令现在包含两个方法，一个执行execute，一个undo（上例中为了方便大家理解，没有写undo），我们可以把用户所有命令调用保存到日志中，比如用户操作不当了，电器异常了，只需要把日志中所有的命令拿出来执行一遍undo就完全恢复了，是吧，就是这么个意思。
         */

        /**
         7
         */
        // 装饰者模式 http://blog.csdn.net/lmj623565791/article/details/24269409
        /*
        先简单描述下装饰者模式发挥作用的地方，当我们设计好了一个类，我们需要给这个类添加一些辅助的功能，
        并且不希望改变这个类的代码，这时候就是装饰者模式大展雄威的时候了。这里还体现了一个原则：类应该对扩展开放，对修改关闭。
        */

        /**
         8
         */
        // Facade 外观模式 http://blog.csdn.net/lmj623565791/article/details/25837275
        /*
        *提供一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层的接口，让子系统更容易使用。其实就是为了方便客户的使用，把一群操作，封装成一个方法
        * */

        /**
         9
         */
        // TemplateMethod  模版方法模式  http://blog.csdn.net/lmj623565791/article/details/26276093
        /*
        *定义了一个算法的骨架，而将一些步骤延迟到子类中，模版方法使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
        * */


        /**
         10
         */
        // State  状态模式  http://blog.csdn.net/lmj623565791/article/details/26350617
        /*
        *允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。
        * */


        /**
         11
         */
        // Iterator   迭代器模式  http://blog.csdn.net/zhengzhb/article/details/7610745
        /*
        *迭代器模式的优点有：
           简化了遍历方式，对于对象集合的遍历，还是比较麻烦的，对于数组或者有序列表，我们尚可以通过游标来取得，
           但用户需要在对集合了解很清楚的前提下，自行遍历对象，但是对于hash表来说，用户遍历起来就比较麻烦了。
           而引入了迭代器方法后，用户用起来就简单的多了。
        * */



    }
}