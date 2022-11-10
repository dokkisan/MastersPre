package week2.mission2.problem1;

public class Factory {
    private static Factory factory = new Factory();
    private Factory() {};
    private static int serialNum = 1000;


    public static Car createCar() {
        Car car = new Car();
        car.carNumber = serialNum++;
        return car;
    }

    public static Factory getFactory() {
        return factory;
    }

}
