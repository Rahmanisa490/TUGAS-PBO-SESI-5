public class Triangle extends Shape {

    protected Double side1;
    protected Double side2;
    protected Double side3;

    public Triangle() {
        this.side1 = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }

    public Triangle(String name, Double side1, Double side2, Double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}