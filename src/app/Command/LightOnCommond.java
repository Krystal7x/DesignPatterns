package app.Command;

/**
 * 打开电灯的命令
 *
 */
public class LightOnCommond implements Command
{
    private Light light ;

    public LightOnCommond(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.on();
    }

}
