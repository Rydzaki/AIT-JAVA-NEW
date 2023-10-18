package prictice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAppl {
    public static void main(String[] args) {
        System.out.println("=====================");
        String str = "Hello";
        char[] chars = {32, 'w', 'o', 'r', 'l', 'd'}; //32 это код пробела
        String str1 = new String(chars); // не обязательные строки
        System.out.println(chars);
        str = str + str1;
        System.out.println(str);
        str = str.concat(str1); // аналогичная операция и добавил слово world
        System.out.println(str);
        int l = str.length(); // выясняем длинну строки
        System.out.println("Length of string "+ str + ": "+ l);

        char c = str.charAt(str.length() - 1); // определяем последний символ в строке
        System.out.println("Last synbol of strint: "+ c);
        System.out.println("=====================");

        System.out.println("Print by letters");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " | "); // метод кторый вытаскивает по буквам из из строки

        }
        System.out.println();
        System.out.println("=====================");
        String str2 = " World"; // будем сравнивать с str1 = "world"
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2)); // игнор регистра
        String str3 = str1.toUpperCase(); // верхний регистра
        System.out.println(str3);
        System.out.println(str3.toLowerCase());
        System.out.println();
        System.out.println("=====================");
        // index - позиция символа в строке
        System.out.println(str);
        int index = str.indexOf('l');// найдет первый попавшийся символ
        System.out.println("Index of l = "+ (index+1));
        index = str.indexOf("world"); // с какого индекса начинается подстрока "or"
        System.out.println(index);
        index = str.indexOf('l', 4); // ищем l начиная с 4 индексаив строке
        System.out.println(index);
        index = str.lastIndexOf('l'); // индекс последнего нахождения l
        System.out.println(index); // индекс последнего нахождения l
        // System.out.println(index - str.length()); // индекс последнего нахождения l (индекс с конца)
        index = str.indexOf('A'); // индекс не сущевутвующей буквы
        System.out.println(index); // получаем -1 (отсутвует буква)
        System.out.println();
        System.out.println("=====================");
        System.out.println(str.substring(4)); // убирается подстрока начиная с 0-3 индекс
        System.out.println(str.substring(1, 8));
        System.out.println(str.replace("o", "o-o-o") );
        System.out.println();
        System.out.println("=====================");
        String str4 = "             Bill           ";
        System.out.println(str4);
        str4 = str4.trim(); // отрезает пробелы первые и последние
        System.out.println(str4);
        System.out.println("=====================");
        String str5 = "I love string in Java!";
        String[] words = str5.split(" "); //разделяет по пробелу
        System.out.println("Qventity of words in string: "+ words.length); //длинна массива
        System.out.println(Arrays.toString(words)); // массив по словам
        System.out.println("=====================");
        String str6 = "Я помню чудное мгновение...";
        String[] leters = str6.split(""); // разделитель отсутствует (разделить по буквам)
        System.out.println("Я помню чудное мгновение: " + leters.length); // показывает длинну массива (колличество элементов массива)
        System.out.println(Arrays.toString(leters)); // печатаем массив по буквам (по разделителю)




    }
}
