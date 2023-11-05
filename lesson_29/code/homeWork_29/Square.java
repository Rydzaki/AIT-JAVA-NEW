package homeWork_29;

public class Square extends Shape {

    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double area = Math.pow(side, 2);
        return area;
    }

    @Override
    public double calcPerimeter() {
        double perimeter = side * 4;
        return perimeter;
    }
}
