package homeWork_29;

public class Circle extends Shape {


    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double area = Math.PI * Math.pow(side, 2);
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 2 * Math.PI * side;
        return perimeter;
    }
}
