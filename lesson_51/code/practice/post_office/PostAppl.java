package practice.post_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PostAppl {

    //**Задача:** Написать приложение, которое позволит понять,
    // из каких мест на данную почту приходят письма.
    public static void main(String[] args) {

        // оператот будет вводить индексы, будем заносить в HashSet

        // в конце смены распечатать это HashSat

        Set<String> postCode = new HashSet<>();
        do {
            System.out.println("Welcome to Past office.");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input Past code: ");
            String newPostCode = scanner.nextLine();
            if(postCode.add(newPostCode)){
                System.out.println("Post code added");

            }else{
                System.out.println("Post code already exists");
            }
            System.out.println("Continue? Press S to stop");
            String  choise = scanner.nextLine();
            if(choise.equalsIgnoreCase("s")){
                break;
            }

        } while (true);

        System.out.println("Post codes: ");
        System.out.println(postCode);



    }
}
