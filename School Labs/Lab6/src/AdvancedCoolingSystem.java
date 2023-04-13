public class AdvancedCoolingSystem extends CoolingSystem {
    private Stopwatch stopwatch;
    private float powerRating;

    public AdvancedCoolingSystem(int size, float powerRating) {
        super(size);
        this.powerRating = powerRating;
        this.stopwatch = new Stopwatch();
    }

    public double getRunningTimeInHours() {
        return stopwatch.read() / 1000.0 / 60.0 / 60.0;
    }

    public float getPowerRating() {
        return powerRating;
    }

    public double getPowerConsumption() {
        return getRunningTimeInHours() * powerRating;
    }

    public boolean resetTimer() {
        if (!isOn()) {
            stopwatch.reset();
            return true;
        }
        return false;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        stopwatch.start();
    }

    @Override
    public void turnOff() {
        super.turnOff();
        stopwatch.stop();
    }
}