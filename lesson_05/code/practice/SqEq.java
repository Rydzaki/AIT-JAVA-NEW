package practice;
// (-b + Math.sqrt(d))/(2a), x2 = (-b - Math.sqrt(d))/(2a)
public class SqEq {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 0;

        double d = dis(a, b, c);
        
        if (d < 0){
            System.out.println("There are no roots");
        } else if (d == 0) {
            double x = -b / (2*a);
            System.out.println("one root: " + x);
            
        }else {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Root 1 = " + x1);
            System.out.println("Root 2 = " + x2);
        }

    }

    public static double dis(double a, double b, double c){
        return b * b - 4*a*c;
        
    }
}
