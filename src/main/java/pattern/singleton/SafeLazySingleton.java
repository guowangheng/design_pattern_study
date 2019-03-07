package pattern.singleton;

/**
 * create by: WeanGuo
 * description: 懒汉模式(双重检查锁机制)
 * create time: 2019/3/7 16:35
 */
public class SafeLazySingleton {

    private volatile static SafeLazySingleton safeLazySingleton;

    public static SafeLazySingleton getSafeLazySingleton(){

        if (safeLazySingleton == null){
            synchronized (SafeLazySingleton.class){
                if (safeLazySingleton == null){
                    safeLazySingleton = new SafeLazySingleton();
                }
            }
        }
        return safeLazySingleton;
    }

}
