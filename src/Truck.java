public class Truck extends Car {

    @Override
    public String getTypeEngine() {
        System.out.println("Diesel");
        return null;
    }

    @Override
    public void drive()
    {
        System.out.println("Невысокая скорость движения");
    }

    public void tonage() {
        System.out.println("Большая грузоподьемность");

    }
}
