package ro.ulbs.paradigme.lab2.forme;


public class Circle extends Form{
    private float radius;

    public Circle() {
        this.radius = 0;
    }
    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }
    @Override
    public String toString() {
        return "This circle has radius " + radius;
    }
}
