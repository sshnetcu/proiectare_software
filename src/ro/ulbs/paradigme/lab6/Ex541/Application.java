package ro.ulbs.paradigme.lab6.Ex541;

public class Application {
    public static void main(String[] args) {
        IntCalculator x = new IntCalculator(5);
        int res = x.add(2).subtract(4).multiply(3).result();
        System.out.println(res);
    }
}
