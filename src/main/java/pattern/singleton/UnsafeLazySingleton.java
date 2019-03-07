package pattern.singleton;

/**
 * create by: WeanGuo
 * description: 懒汉式(线程不安全)
 * create time: 2019/3/7 16:28
 */
public class UnsafeLazySingleton {

    public static UnsafeLazySingleton lazySingleton;

    public static UnsafeLazySingleton getLazySingleton(){
        if (lazySingleton == null){
            lazySingleton = new UnsafeLazySingleton();
            return lazySingleton;
        }else{
            return lazySingleton;
        }
    }

}
