package pattern.observer.withJDK;

import java.util.Observable;

public class OfficeSubject extends Observable {

    private String content;

    public void changeContent(String content){
        this.setChanged();
        this.content = content;
        this.notifyObservers(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
