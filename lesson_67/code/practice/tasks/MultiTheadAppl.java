package practice.tasks;

public class MultiTheadAppl {
    private static final int MAX = 10;
    private static final int SIZE = 3;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started"); // это первый тред


//        MyTaskImplements task = new MyTaskImplements("Parallel task", MAX); // вызываем конструктор
//        task.run(); // это запуск второго треда

        MyTaskImplements task1 = new MyTaskImplements("Parallel task 1", MAX); // создали задачу на базе конструктора который имплемитирует ранбл
        MyTasksExtends task2 = new MyTasksExtends("Parallel task 2", MAX);

        Thread thread1 = new Thread(task1); // создали новый поток и передали ему эту задачу
        Thread thread2 = new Thread(task2); // создали еще один параллельный поток и предали задачу

        thread1.start(); // запустили поток
        thread2.start();

// создали на базе класса с интерфейсом Runble
        MyTaskImplements[] tasks = new  MyTaskImplements[SIZE]; // создаем массив параллельных задачь, которые вложим в потоки
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new MyTaskImplements("Name# "+ i , MAX);
        }
        Thread[] threads = new Thread[SIZE];// массив потоков
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks[i]);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start(); // старт потоков
            threads[i].join(); // получается из параллельноо делает опять в линейные
        }

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count = "+ i);
                        try {
                Thread.sleep(1); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        thread1.join(); // присоединение к идущему процессам
        thread2.join();
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();

        }

        System.out.println("Main thread finished");
    }
}
