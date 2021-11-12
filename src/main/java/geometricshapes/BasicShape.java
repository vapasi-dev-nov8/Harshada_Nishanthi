package geometricshapes;

public class BasicShape {
    double length;
    double breadth;

    public BasicShape(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea() {

        return this.length * this.breadth;
    }
    public double calculatePerimeter() {
        return (this.length + this.breadth) * 2;
    }
}
