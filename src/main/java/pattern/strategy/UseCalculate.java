package pattern.strategy;

/**
 * create by: WeanGuo
 * description: 用户进行计算
 * create time: 2019/3/6 14:00
 */
public class UseCalculate {

    public static void main(String[] args) {
        calculate(new AddPart(),10);
    }

    public static void calculate(CalculatePart part,int num){
        int result = part.calculate(num);
        System.out.println(result);
    }

}
