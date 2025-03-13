package ro.ulbs.paradigme.lab3;

import ro.ulbs.paradigme.lab3.forme.Circle;
import ro.ulbs.paradigme.lab3.forme.Form;
import ro.ulbs.paradigme.lab3.forme.Square;
import ro.ulbs.paradigme.lab3.forme.Triangle;
import ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class Application {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        System.out.println(Form.getCounter());
        Circle c = new Circle(1.5F, "yellow");
        System.out.println(Form.getCounter());
        Square sq = new Square(1.2F, "blue");
        System.out.println(Form.getCounter());

        System.out.println("Area = " + tri.getArea()+" details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));

        Triangle tri3 = new Triangle(1.2F, 2.2F, "brown");
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));

        PasswordMaker pm = new PasswordMaker("pilat");
        System.out.println(pm.getPassword());
    }
}
