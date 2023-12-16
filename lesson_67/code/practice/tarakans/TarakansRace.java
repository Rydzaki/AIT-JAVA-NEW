package practice.tarakans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TarakansRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите количество участников забега: ");
        int countRacers = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Укажите расстояние забега в метрах: ");
        int lengthMeters = scanner.nextInt();

        List<Integer> winnerList = new ArrayList<>();
        System.out.println("Main tarakan started");

        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= countRacers; i++) {
            TarakansImpl tarakans = new TarakansImpl(i, lengthMeters, winnerList);
            Thread thread = new Thread(tarakans);
            threads.add(thread);
            thread.start();

            try {
                Thread.sleep(new Random().nextInt(5) + 2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Congratulations to the tarakan #" + winnerList.get(0) + " winner");
       // winnerList.forEach(System.out::println);
    }

}