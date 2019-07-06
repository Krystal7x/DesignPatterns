package app.Observer;
public class Test
{
    public static void main(String[] args)
    {
        //模拟一个服务号
        ConcreteSubject concretesubject = new ConcreteSubject();
        //客户1
        Observer observer1 = new ConcreteObserver1(concretesubject);
        Observer observer2 = new ConcreteObserver2(concretesubject);

        concretesubject.setMsg("密码：127" );
        concretesubject.setMsg("密码：333" );

    }
}
