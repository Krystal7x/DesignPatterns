package app.Decorator;

/**
 * 红宝石装饰品 每颗攻击力+15
 *
 * @author zhy
 *
 */
public class RedGemDecorator implements IEquipDecorator
{
    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public RedGemDecorator(IEquip equip)
    {
        this.equip = equip;
    }

    @Override
    public int caculateAttack()
    {
        return 15 + equip.caculateAttack();
    }

    @Override
    public String description()
    {
        return equip.description() + "+ 红宝石";
    }

}
