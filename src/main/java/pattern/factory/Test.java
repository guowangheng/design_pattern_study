package pattern.factory;

public class Test {

    public static void main(String[] args) {
        Car car = CarFactory.getCar("GEELY");
        car.run();
    }

}
