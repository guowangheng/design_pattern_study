package pattern.strategy;

/**
 * create by: WeanGuo
 * description: 减法计算(具体角色2)
 * create time: 2019/3/6 14:01
 */
public class SubPart implements CalculatePart{

    public int calculate(int num) {
        return --num;
    }
}
