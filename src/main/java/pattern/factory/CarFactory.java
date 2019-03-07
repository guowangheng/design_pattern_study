package pattern.factory;

public class CarFactory {

    public static Car getCar(String type){
        if ("GEELY".equals(type)){
            return new GeelyCar();
        }
        // ...其他型号车
        return null;
    }

}
