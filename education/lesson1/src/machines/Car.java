package machines;

public abstract class Car {

    private Accumulator accumulator;
    private Engine      engine;
    private int countWheels;

    abstract String getName();

    public Accumulator getAccumulator() {
        return accumulator;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }
}
