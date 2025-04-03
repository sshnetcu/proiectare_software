package ro.ulbs.paradigme.lab6.Ex542;

public class Application {
    public static void main(String[] args) {
        NewIntCalculator x = new NewIntCalculator(10);
        int res = (Integer) x.add(5).subtract(3).multiply(2).result();
        System.out.println("5.4.2 a) " + res);

        DoubleCalculator y = new DoubleCalculator(10);
        double res2 = (Double) y.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("5.4.2 b) "+ res2);
    }
}
