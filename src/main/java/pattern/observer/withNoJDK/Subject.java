package pattern.observer.withNoJDK;

import java.util.Observable;

/**
 * create by: WeanGuo
 * description: 主题接口
 * create time: 2019/3/7 13:51
 */
public interface Subject{

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 13:52
     * @description：添加观察者(订阅者)
     */
    public void addObserver(Observer observer);

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 13:53
     * @description：移除观察者(订阅者)
     */
    public void delObserver(Observer observer);

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 13:53
     * @description：通知观察者
     */
    public void notifyObserver(Object obj);


}
