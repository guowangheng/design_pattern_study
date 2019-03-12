package pattern.proxy.staticProxy;

import pattern.decorator.Skill;

/**
 * create by: WeanGuo
 * description: 被代理类
 * create time: 2019/3/11 16:56
 */
public class Study implements Skill{

    public void can(){
        System.out.println("小明在看数学..");
    }

}
