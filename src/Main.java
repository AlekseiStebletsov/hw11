public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        Car truck = new Truck();
        Car sportCar = new SportCar();
        Truck tractor = new TruckTractor();
        Truck boardTruck = new BoardTruck();
        SportCar bolid = new Bolid();

        truck.drive();
        ((SportCar) sportCar).competition();
        ((TruckTractor) tractor).coupling();
        truck.transmission();
        bolid.brake();
        truck.getTypeEngine();

        sportCar.equals(car);
        System.out.println(boardTruck.hashCode());
        System.out.println(truck.hashCode());


    }
}
