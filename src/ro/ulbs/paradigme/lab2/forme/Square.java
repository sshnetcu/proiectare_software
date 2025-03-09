package ro.ulbs.paradigme.lab2.forme;

public class Square extends Form {
    private float side;
    public Square() {
        this.side = 0;
    }
    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return this.side * this.side;
    }
    @Override
    public String toString() {
        return "This square has side " + side;
    }
}
