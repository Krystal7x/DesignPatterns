package app.TemplateMethod;

/**
 * Created by k on 2017/12/14.
 */
public class ManagerWorker extends Worker
{

    public ManagerWorker(String name)
    {
        super(name);
    }

    @Override
    public void work()
    {
        System.out.println(name + "打dota...");
    }

}
