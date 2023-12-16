package practice.tarakans;

import java.util.List;
import java.util.Random;

public class TarakansImpl implements Runnable {

    private int tarakanNumber;
    private int length;
    private List<Integer> winnerList;

    public TarakansImpl(int tarakanNumber, int length, List<Integer> winnerList) {
        this.tarakanNumber = tarakanNumber;
        this.length = length;
        this.winnerList = winnerList;
    }

    @Override
    public void run() {
        System.out.println("Tarakan #" + tarakanNumber + " started");

        for (int j = 1; j <= length; j++) {
            System.out.println("Tarakan #" + tarakanNumber + " went " + j + " meter");

            try {
                Thread.sleep(new Random().nextInt(5) + 2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Tarakan #" + tarakanNumber + " finished");
        winnerList.add(tarakanNumber);
    }
}