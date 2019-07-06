package app.Strategy;

/**
 * Created by k on 2017/12/13.
 */
public class Test
{
    public static void main(String[] args)
    {

        Role roleA = new RoleA("A");

        roleA.setAttackBehavior(new CAttack1())//
                .setDefendBehavior(new CDefend1())//
                .setDisplayBehavior(new CDisplay1())//
                .setRunBehavior(new CRun1());
        System.out.println(roleA.name + ":");
        roleA.run();
        roleA.attack();
        roleA.defend();
        roleA.display();
    }
}
