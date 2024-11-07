public class Main {
    public static void main(String[] args) {

        Car car = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);

        Truck truck = new Truck("track1", 6);
        Truck truck2 = new Truck("track2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Transport[] transports = {
                car, car2, truck, truck2, bicycle, bicycle2
        };


        ServiceStation station = new ServiceStation();

        for (
                Transport transport : transports) {
            station.check(transport);
            System.out.println();
        }
    }


}