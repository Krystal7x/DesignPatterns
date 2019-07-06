package app.Observer;

/**
 * Created by k on 2017/12/12.
 */
public class ConcreteObserver2 implements Observer
{
    private Subject subject ;

    public ConcreteObserver2(Subject subject)
    {
        this.subject = subject  ;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg)
    {
        System.out.println("observer2 得到 信息 -->" + msg);
    }



}