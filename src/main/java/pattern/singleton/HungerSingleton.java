package pattern.singleton;

/**
 * create by: WeanGuo
 * description: 饿汉模式(线程安全)
 * create time: 2019/3/7 16:33
 */
public class HungerSingleton {

    private static HungerSingleton hungerSingleton = new HungerSingleton();

    public static HungerSingleton getHungerSingleton(){
        return hungerSingleton;
    }

}
