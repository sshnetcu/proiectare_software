package ro.ulbs.paradigme.lab7;

public class DoubleCalculator extends ACalculator {
    private double state;

    public DoubleCalculator(double state) {
        this.state = state;
    }

    public DoubleCalculator add(double x) {
        state = state + x;
        return this;
    }
    public DoubleCalculator subtract(double x) {
        state = state-x;
        return this;
    }
    public DoubleCalculator multiply(double x) {
        state = state*x;
        return this;
    }

    @Override
    public void init() {
        state = 0;
    }
}
