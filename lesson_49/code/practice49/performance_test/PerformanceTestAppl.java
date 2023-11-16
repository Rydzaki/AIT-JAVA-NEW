package practice49.performance_test;

import java.util.*;

public class PerformanceTestAppl {
    
    // определим константы
    private static final int N_NUMBERS = 100000;
    private static final int MIN = 10;
    private static final int MAX = 100;
    
    private static Random random = new Random();
    
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        
        fillList(list); // заполнить лист методом
        System.out.println("=========================== for each =======================");
        long t1 = System.currentTimeMillis(); // отсечка времени
        int sum = 0;
        // сложим все элементы листа
        for (Integer n: list) {
            sum += n;

        }
        long t2 = System.currentTimeMillis(); // отсечка времени
        System.out.println("Sum: "+ sum);
        System.out.println("Duration of sum: "+  (t2-t1));

        System.out.println("====================Iterator обход листа==================");
        t1 = System.currentTimeMillis(); // отсечка времени
        sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        t2 = System.currentTimeMillis();
        System.out.println("Duration of iteration: "+  (t2-t1));

        System.out.println("====================FOR loop==================");
        t1 = System.currentTimeMillis(); // отсечка времени
        sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Duration of for loop: "+  (t2-t1));
        
    }

    private static void fillList(List<Integer> list) {
        long t1 = System.currentTimeMillis(); // отсечка времени
        for (int i = 0; i < N_NUMBERS ; i++) {
            list.add(MIN + random.nextInt(MAX - MIN));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Duration of filling the list: "+  (t2-t1));
        
    }

    
}

//Duration of filling the list: 17
//=========================== for each =======================
//Sum: 54464243
//Duration of sum: 8
//====================Iterator обход листа==================
//Duration of iteration: 5
//====================FOR loop==================
//Duration of for loop: 4
