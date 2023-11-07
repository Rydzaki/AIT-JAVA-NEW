package practice.tryCatch;

import java.util.Scanner;

public class TryCatchAppl {

    public static void main(String[] args) {
        /*
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("input first number");
            int a = scanner.nextInt();
            System.out.println("input second number");
            int b = scanner.nextInt();

            int division = a/b;

            System.out.println("division "+ a + "/" +b+ " = "+division);
        } catch (Exception e ) {
            System.out.println(e.getMessage()); // причина
        }
        */
        /*
        int[] arr = {73, -17, 99, 26, -45, 34, -83};
        int l = arr.length;
        System.out.println(l);
        try{
            arr[9] = 157;
        } catch (Exception e){
            System.out.println(e.getMessage() + ", "+ e.toString());
        }
        */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("input number");
            int n = scanner.nextInt();
            System.out.println("your input: " + n);
        }catch (Exception e){
            System.out.println(e.toString() + " | "+ e.getMessage()+ " | "+ e.getCause()+ " | wrong inpit");
        }









    }
}
