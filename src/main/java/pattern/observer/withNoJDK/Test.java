package pattern.observer.withNoJDK;

public class Test {

    public static void main(String[] args) {
        OfficeSubject officeSubject = new OfficeSubject();
        officeSubject.changeContent("鹿晗发民国表情包;杨超越杯编程大赛;男女薪酬差异;曝阿Sa年底结婚;养老金足额发放!");
        // 添加观察者
        Reader reader = new Reader(officeSubject);
        System.out.println("当前内容: " + reader.getContent());
    }

}
