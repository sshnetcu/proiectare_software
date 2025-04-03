package ro.ulbs.paradigme.lab6.Ex541;

public class IntCalculator {
    private int state;

    public IntCalculator(int state) {
        this.state = state;
    }

    public IntCalculator add(int x) {
        state = state+x;
        return this;
    }
    public IntCalculator subtract(int x) {
        state = state-x;
        return this;
    }
    public IntCalculator multiply(int x) {
        state = state*x;
        return this;
    }
    public int result() {
        return state;
    }
    public void clear() {
        state = 0;
    }
}
