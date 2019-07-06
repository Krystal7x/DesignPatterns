package app.Adapter;

/**
 * Created by tt on 2017/12/13.
 */
public class Test
{
    public static void main(String[] args)
    {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power()) ;
        mobile.inputPower(v5Power);
    }
}
