package prictice;

public class Task2 {

    public static void main(String[] args) {

        int n = 31;
        int f = faktorial(n);
        System.out.println("Faktorial " + n + " = " + f);


    }

    public static int faktorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            if (f > 0) {
                f = f * i;


            }

        }
        return f;
    }
}
