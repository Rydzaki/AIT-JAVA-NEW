package prictice;

public class WrapperClassAppl {
    public static void main(String[] args) {
        //колличество цифр в числе версия 2 (делим на 10 до получения 0 цикл while)
        Integer x = 1111954321; // объект класса типа Integer
        String st = x.toString(); // преобразовал в строку
        st.length(); // узнал длинну строки
        int l = st.length();
        //System.out.println("Number of digits " + x + " = "+ l);
        System.out.println(x.MAX_VALUE); // узнали максимальное значение такого для такого типа

        Double y =32456.78;
        String st1 = y.toString();
        System.out.println("Number of digits in " + y + " = " + st1.length());

        // присвоение и вычисление
        System.out.println("================================");
        int n = 20;
        Integer m = 10;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("================================");
        m = m + n; // автораспаковка и автоупаковка m

        System.out.println("m + n = " + m);
        System.out.println("================================");

        Double pi = 3.14;
        double cirkleLenght = 2 * pi * 10;
        System.out.println("Circle length  = " + cirkleLenght);
        System.out.println("--------- Constanta of Wrapper Classes----------");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Long MIN " + Long.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);
        System.out.println("--------- ============================----------");
        // обработка деления на ноль
        System.out.println("--------- Not-aNumber(NaN)----------");
        double a = 20.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)){ // или если бесконечное число или не существующее число
            System.out.println("Wrong operation or wrong result. ");
        } else {
            System.out.println(a);
        }
        System.out.println();
        // перевод String to Number
        System.out.println("--------- Parsing String to number ----------");
        String str = "0987654321";
        int num = Integer.parseInt(str);
        System.out.println("String = " + str + " = " + num );
        System.out.println();
        String str1 = "2.7118281828";
        double exp = Double.parseDouble(str1);
        System.out.println("String = " + str1 + " | Exp = " + exp);
    }
}
