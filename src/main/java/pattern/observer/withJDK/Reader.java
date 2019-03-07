package pattern.observer.withJDK;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {

    private String content;

    public Reader(Observable observable){
        if (observable instanceof OfficeSubject){
            this.content = ((OfficeSubject) observable).getContent();
            observable.addObserver(this);
        }
        //...其他出版社
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof OfficeSubject){
            this.content = arg.toString();
            System.out.println("今天的阅读内容是: " + content);
        }
        // ...其他出版社
    }
}
