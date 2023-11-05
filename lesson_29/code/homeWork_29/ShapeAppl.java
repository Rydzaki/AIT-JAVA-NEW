package homeWork_29;

import javax.sound.midi.Soundbank;

public class ShapeAppl {

    public static void main(String[] args) {
        Shape [] shape = new Shape[3];

        shape[0] = new Circle(10);
        shape[1] = new Triangle(10);
        shape[2] = new Square(10);

        double totalAr = totalArea(shape);
        System.out.println("The sum of the areas of all figures = " + totalAr);

    }
    private static double totalArea (Shape[]shape){
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            if(shape[i] != null){
                sum += shape[i].calcArea();
            }

        }
        return sum;
    }
}
