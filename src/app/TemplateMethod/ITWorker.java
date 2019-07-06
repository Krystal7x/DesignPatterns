package app.TemplateMethod;

/**
 * Created by tt on 2017/12/14.
 */
public class ITWorker extends Worker
{

    public ITWorker(String name)
    {
        super(name);
    }

    @Override
    public void work()
    {
        System.out.println(name + "写程序-测bug-fix bug");
    }
    /**
     * 复写钩子挑选执行的方法
     */
    @Override
    public boolean isNeedPrintDate()
    {
        return true;
    }

}
