package pattern.proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by: WeanGuo
 * description: 基于jdk实现动态代理
 * create time: 2019/3/11 17:00
 */
public class JdkDynamicProxy implements InvocationHandler {

    private Object object;

    public JdkDynamicProxy(final Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在看片.." + method.getName());
        Object obj = method.invoke(object, args);
        System.out.println("吃饭了..");
        return obj;
    }

    public static void main(String[] args) {
        Skill sk = new Study();
        Skill skill = (Skill)Proxy.newProxyInstance(Skill.class.getClassLoader(), new Class[]{Skill.class}, new JdkDynamicProxy(sk));
        skill.can("小明");

    }
}
