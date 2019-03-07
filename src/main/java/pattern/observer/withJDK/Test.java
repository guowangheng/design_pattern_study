package pattern.observer.withJDK;

public class Test {

    public static void main(String[] args) {
        OfficeSubject officeSubject = new OfficeSubject();
        new Reader(officeSubject);
        officeSubject.changeContent("女神节,张凯丽谈劣迹艺人,孙悟空的三个锦囊,巴黎时装周现5cm迷你包,女足点球不敌荷兰!");

    }

}
