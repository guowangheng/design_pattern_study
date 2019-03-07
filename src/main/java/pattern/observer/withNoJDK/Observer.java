package pattern.observer.withNoJDK;

/**
 * create by: WeanGuo
 * description: 观察者接口
 * create time: 2019/3/7 13:54
 */
public interface Observer {

    public void update(Subject subject,Object obj);

}
