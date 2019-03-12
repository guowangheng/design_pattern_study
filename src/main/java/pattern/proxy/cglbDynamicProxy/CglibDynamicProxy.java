package pattern.proxy.cglbDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * create by: WeanGuo
 * description: cglib动态代理
 * create time: 2019/3/12 10:17
 */
public class CglibDynamicProxy implements MethodInterceptor {

    public <T> T getInstence(T obj){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return (T)enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib增强前..");
        // 注意: 是invokeSuper不是invoke
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib增强后..");
        return invoke;
    }

    public static void main(String[] args) {
        Study study = new Study();
        CglibDynamicProxy proxy = new CglibDynamicProxy();
        Study proxyStudy = proxy.getInstence(study);
        proxyStudy.can("张三");
    }

}
