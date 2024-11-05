public abstract class WheeledTransport implements Transport {

    private final String modelName;

    private final int wheelCount;

    public WheeledTransport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void updateTyre() {
        System.out.println("Миняем шину " + getModelName());
    }

    @Override
    public void servis() {
        for (int i = 0; i < wheelCount; i++) {
            updateTyre();

        }
    }
}
