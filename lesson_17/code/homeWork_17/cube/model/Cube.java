package homeWork_17.cube.model;

public class Cube {

    // поля класса
    double edge1;

    // геттеры и сеттеры
    public double getEdge1() {
        return edge1;
    }
    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }
    // конструктор
    public Cube(double edge1) {
        this.edge1 = edge1;
    }

//    public void display(){
//        System.out.println("Lenght "+ edge1 + " Perimetr " + this.p + " Sum of areas " + this.s + " Valume "+ this.v);
//    }
        public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    // методы класса заложенные в капсулу класса
    public double perimetr (double a){
        return a * 12;
    }
    public double area (Double a){
        return (a * a) * 6;
    }
    public double volume (double a){
        return a*a*a;
    }
    public void display(){
        System.out.println("Length "+ this.edge1+ " Perimetr " + perimetr(this.edge1) + " Sum of areas " + area(this.edge1) + " Volume "+ volume(this.edge1));
    }


}
