package app.Command;

public class Test
{
    public static void main(String[] args)
    {
        /**
         * 三个家电
         */
        Light light = new Light();
        Computer computer = new Computer();
        /**
         * 一个控制器，假设是我们的app主界面
         */
        ControlPanel controlPanel = new ControlPanel();
        // 为每个按钮设置功能
        controlPanel.setCommand(0, new LightOnCommond(light));
        controlPanel.setCommand(1, new LightOffCommond(light));
        controlPanel.setCommand(2, new ComputerOnCommond(computer));
        controlPanel.setCommand(3, new ComputerOffCommond(computer));

        // 模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(8);// 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳



    }
}
