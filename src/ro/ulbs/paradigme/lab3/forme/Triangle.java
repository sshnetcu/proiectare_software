package ro.ulbs.paradigme.lab3.forme;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        this.height = 0;
        this.base = 0;
    }
    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return this.height * this.base / 2;
    }
    @Override
    public String toString() {
        return "This triangle has height " + height + " and base " + base;
    }

    public boolean equals(Triangle tri) {
        return (this.height == tri.height) && (this.base == tri.base);
    }
}
