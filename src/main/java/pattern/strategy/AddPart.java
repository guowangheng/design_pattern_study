package pattern.strategy;

/**
 * create by: WeanGuo
 * description: 加法计算(具体角色1)
 * create time: 2019/3/6 14:01
 */
public class AddPart implements CalculatePart{

    public int calculate(int num) {
        return ++num;
    }
}
