package pattern.observer.withNoJDK;

/**
 * create by: WeanGuo
 * description: 读者(观察者)
 * create time: 2019/3/7 13:56
 */
public class Reader implements Observer {

    private String content;

    public Reader(Subject subject){

        //可能该读者订阅了很多家出版社,有报社,杂志社等等..
        if (subject instanceof OfficeSubject){
            // 为报社,初始化当前数据值
            this.content = ((OfficeSubject) subject).getContent();
            subject.addObserver(this);
        }
        //...其他出版社
    }

    public void update(Subject subject, Object obj) {

        if (subject instanceof OfficeSubject){
            this.content = obj.toString();
            System.out.println("今天的阅读内容是: " + content);
        }
        // ...如果是其他杂志社

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}