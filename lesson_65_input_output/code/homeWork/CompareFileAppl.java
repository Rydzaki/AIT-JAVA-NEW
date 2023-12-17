package homeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompareFileAppl {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of arguments.");
            return;
        }

        try (FileInputStream file1 = new FileInputStream(args[0]);
             FileInputStream file2 = new FileInputStream(args[1])) {

            int length1 = file1.available(); // длина первого файла
            int length2 = file2.available(); // длина второго файла

            int a = file1.read(); //читаю первый
            int b = file2.read(); // читаю второй

            if (length1 == length2) {
                while (a != -1 && b != -1) { // пока а и б не выйдут за границы выполняю цикл
                    if (a != b) { // если а не равно б выходим из цикла
                        System.out.println("Файлы разные");
                    }
                    a = file1.read(); // каждую итерацию читаем по одному следующему байту из файла
                    b = file2.read();
                }

                System.out.println("Файлы одинаковые");
            } else {
                System.out.println("Длины файлов различны");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String arg: args) {

        }

        }
}

