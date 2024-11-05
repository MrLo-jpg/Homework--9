public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void servis() {
        super.servis();
        checkTrailer();
    }
}
