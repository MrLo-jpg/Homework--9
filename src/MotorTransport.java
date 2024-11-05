public abstract class MotorTransport extends WheeledTransport {

    public MotorTransport(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель " + getModelName());
    }

    public void servis() {
        super.servis();
        checkEngine();
    }
}
