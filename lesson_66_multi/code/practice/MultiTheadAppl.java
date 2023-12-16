package practice;

public class MultiTheadAppl {
    private static final int MAX = 10;

    public static void main(String[] args) {
        System.out.println("Main thread started"); // это первый тред


//        MyTaskImplements task = new MyTaskImplements("Parallel task", MAX); // вызываем конструктор
//        task.run(); // это запуск второго треда

        MyTaskImplements task = new MyTaskImplements("Parallel task", MAX); // создали задачу на базе конструктора который имплемитирует ранбл
        Thread thread = new Thread(task); // создали новый поток и передали ему эту задачу

        thread.start(); // запустили поток

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count = "+ i);
                        try {
                Thread.sleep(1); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Main thread finished");
    }
}
