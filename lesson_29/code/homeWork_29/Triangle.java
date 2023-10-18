package homeWork_29;

public class Triangle extends Shape {


    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double area = (Math.pow(side, 2) * Math.sqrt(3))/4;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = 3 * side;
        return perimeter;
    }
}
