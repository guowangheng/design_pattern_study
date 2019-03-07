package pattern.observer.withNoJDK;

import java.util.ArrayList;
import java.util.List;

/**
 * create by: WeanGuo
 * description: 模拟报社
 * create time: 2019/3/7 14:16
 */
public class OfficeSubject implements Subject {

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 14:16
     * @description：订阅者要获取的资源
     */
    private String content;

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 14:17
     * @description：订阅者集合,便于统一发布消息
     */
    private List<Observer> subjectList;

    public OfficeSubject() {
        subjectList = new ArrayList<>();
    }

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 14:17
     * @description：添加观察者
     */
    public void addObserver(Observer observer) {
        subjectList.add(observer);
    }

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 14:18
     * @description：删除观察者
     */
    public void delObserver(Observer observer) {
        subjectList.remove(observer);
    }

    /**
     * @author     ：WeanGuo
     * @date       ：Created in 2019/3/7 14:18
     * @description：通知观察者
     */
    public void notifyObserver(Object obj) {

        this.content = obj.toString();
        System.out.println("开始通知观察者...");
        subjectList.forEach(a -> a.update(this, obj.toString()));

    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void changeContent(String content) {
        notifyObserver(content);
    }
}
