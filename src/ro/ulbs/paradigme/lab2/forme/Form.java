package ro.ulbs.paradigme.lab2.forme;

public class Form {
    private String color;
    public Form() {
        this.color = "white";
    }
    public Form(String color) {
        this.color = color;
    }
    public float getArea() {
        return 0;
    }
    public String toString(){
        return "This form has the color" + color;
    }
}
