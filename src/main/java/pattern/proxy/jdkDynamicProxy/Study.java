package pattern.proxy.jdkDynamicProxy;


/**
 * create by: WeanGuo
 * description: 被代理类
 * create time: 2019/3/11 16:56
 */
public class Study implements Skill{

    public void can(String name){
        System.out.println(name + "在看数学..");
    }

}
