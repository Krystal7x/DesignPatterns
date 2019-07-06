package app.TemplateMethod;

/**
 * Created by k on 2017/12/14.
 */
public class HRWorker extends Worker
{

    public HRWorker(String name)
    {
        super(name);
    }

    @Override
    public void work()
    {
        System.out.println(name + "看简历-打电话-接电话");
    }

}