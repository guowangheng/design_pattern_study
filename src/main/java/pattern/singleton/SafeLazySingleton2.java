package pattern.singleton;

/**
 * create by: WeanGuo
 * description: 懒汉模式(静态内部类方式)
 * create time: 2019/3/7 16:35
 */
public class SafeLazySingleton2 {

    public static SafeLazySingleton getSafeLazySingleton(){
            return SafeLazySingleton.safeLazySingleton;
        }

    private static class SafeLazySingleton{
        private static SafeLazySingleton safeLazySingleton = new SafeLazySingleton();
    }

}
