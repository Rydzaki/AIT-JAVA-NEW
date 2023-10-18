import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HW_25_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");

        String str = scanner.nextLine();
        // String str = "qwer asdf zxcv poiu"; // проверка

        String[] words = str.split(" "); //делаем массив по пробелам

        int space = 0;                                  // вычитаем пробелы
        int word = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '–' || str.charAt(i) == ';' || str.charAt(i) == '-') {
                space++;
            } else word ++;
        }
        System.out.println("Слов в Вашей строке: " + words.length);
        System.out.println("Букв в Вашей строке: " + (word) + " + " + space + " знаков" );

        String[] revers = new String[words.length]; //создаем новый массив для разворота
        for (int i = 0; i < words.length; i++) {
            revers[i] = words[words.length - i - 1]; // заполняем масиив из родительского в обратном порядке
        }
        System.out.println("Ваша строка задом наперед: "+ Arrays.toString(revers));
    }
}

