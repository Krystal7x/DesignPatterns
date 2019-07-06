package app.Observer;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by tt on 2017/12/12.
 */

public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    /**
     * 3D彩票的号码
     */
    private String msg;

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        int index = observers.indexOf(observer);
        if (index >= 0)
        {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(msg);
        }
    }

    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg;

        notifyObservers();
    }


}

