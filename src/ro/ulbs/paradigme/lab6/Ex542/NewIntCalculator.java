package ro.ulbs.paradigme.lab6.Ex542;

public class NewIntCalculator extends ACalculator {
    private int state;

    public NewIntCalculator(int state) {
        this.state = state;
    }

    public NewIntCalculator add(int x) {
        state = state+x;
        return this;
    }
    public NewIntCalculator subtract(int x) {
        state = state-x;
        return this;
    }
    public NewIntCalculator multiply(int x) {
        state = state*x;
        return this;
    }

    @Override public void init() {
        state = 0;
    }
}
