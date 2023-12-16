package practice;

import java.io.*;

public class ConsoleIOAppl {
    public static void main(String[] args) throws IOException {

        // сценарий
        // спросим имя файла, затем будем сохранять то что она напишет в файле

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name: ");
        String str = br.readLine(); // читает построчно (пользователь ввел правильное имя файла)
        System.out.println(str);

        PrintWriter pw = new PrintWriter(new FileWriter(str, true)); // поставили флаг - добавление это true(позволяет дополнять, а не перезаписывать файл) / создаем поток символов в файл
        System.out.println("Type the text here ");
        str = br.readLine();
        while (!"stop".equalsIgnoreCase(str)){ // пока строка не равна STOP будем продолжать цикл
            pw.println(str);
            System.out.println("Type the text here ");
            str = br.readLine();
        }
        pw.flush();// отправление из буфера в поток => файл
        pw.close(); // закрываем файл



    }
}
