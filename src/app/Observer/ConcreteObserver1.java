package app.Observer;

/**
 * Created by tt on 2017/12/12.
 */
public class ConcreteObserver1 implements Observer{
    private Subject subject;

    public ConcreteObserver1(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg)
    {
        System.out.println("observer1 得到 信息 -->" + msg);
    }
}
