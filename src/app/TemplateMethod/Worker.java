package app.TemplateMethod;

import java.util.Date;

/**
 * 定义了一个上班（算法）的骨架，包含以下步骤：
 a、进入公司
 b、打开电脑
 c、上班情况
 d、关闭电脑
 e、离开公司
 可以看到，a、b、d、e我们在超类中已经实现，子类仅实现work这个抽象方法，记录每天的上班情况。
 */
public abstract class Worker
{
    protected String name;

    public Worker(String name)
    {
        this.name = name;
    }

    /**
     * 记录一天的工作
     */
    public final void workOneDay()
    {

        System.out.println("-----------------work start ---------------");
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
        System.out.println("-----------------work end ---------------");

    }

    /**
     * 工作
     */
    public abstract void work();

    /**
     * 关闭电脑
     */
    private void computerOff()
    {
        System.out.println(name + "关闭电脑");
    }

    /**
     * 打开电脑
     */
    private void computerOn()
    {
        System.out.println(name + "打开电脑");
    }

    /**
     * 进入公司
     */
    public void enterCompany()
    {
        System.out.println(name + "进入公司");
    }

    /**
     * 离开公司
     */
    public void exitCompany()
    {
        if (isNeedPrintDate())
        {
            System.out.print(new Date().toLocaleString()+"-->");
        }
        System.out.println(name + "离开公司");
    }
    /**
     * 模版方式里面也可以可选的设置钩子
     */
    public boolean isNeedPrintDate()
    {
        return false;
    }

}

