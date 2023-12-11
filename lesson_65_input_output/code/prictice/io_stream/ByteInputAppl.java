package prictice.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputAppl {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fin = new FileInputStream("./dest/data.txt");

        try {
//            System.out.println("Available: "+ fin.available()); // выясняем сколько доступно байт для чтения
//            int a = fin.read(); // считали
//            System.out.println(a); // код символа
//            System.out.println("Available: "+ fin.available());
//            // каждое чтение из байта перемещает курсор (внутрений) на одну позицию

            // как считать все из файла
            // Option 1
//            int a = fin.read();
//            while ( a != -1){
//                System.out.print(a + " | ");
//                a = fin.read(); // если есть значениe больше 256, то все закольцовано и покажет следующее значение по кругу (257-256 = 1)
//            }
            // option 2
//            int length = fin.available(); // сколько байт доступно для чтения
//            for (int i = 0; i < length; i++) {
//                int a = fin.read();
//                System.out.print(a + " | ");
//            }

            // option 3
            int length = fin.available(); // сколько байт доступно для чтения
            byte[] arr = new byte[length];
            fin.read(arr);
            for (byte b : arr){
                System.out.println(b);
            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
