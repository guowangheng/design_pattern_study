package pattern.proxy.staticProxy;

/**
 * create by: WeanGuo
 * description: 静态代理(和装饰者模式代码基本一致,只是思想上会有区别,装饰者是为了起到装饰作用,
 *                      所以是不会干预原目标方法执行的,但静态代理可能会覆盖原方法的执行)
 * create time: 2019/3/11 16:53
 */
public class StaticProxy implements Skill{

    private Skill skill;

    public StaticProxy(Skill skill){
        this.skill = skill;
    }

    @Override
    public void can() {
        // 可能不执行原先的方法了
        System.out.println("我不想做事了...");
    }
}
