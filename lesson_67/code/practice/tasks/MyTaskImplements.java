package practice.tasks;

public class MyTaskImplements implements Runnable {

        //fields

        String name; // имя задачи
        int max;// условия задачи

    public MyTaskImplements(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + " start"); // доклад о начале работы
        // считаем в цикле от 0 до мах
        for (int i = 0; i < max; i++) {
            System.out.println(name + " count "+ i); // докладывает на каждом шаге цикла
                        try {
                Thread.sleep(1); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " finished");
    }


}
