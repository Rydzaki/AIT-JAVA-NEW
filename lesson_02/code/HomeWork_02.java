public class HomeWork_02 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() {
        System.out.println("Антивирус запущен");
        System.out.println("_________________________________");
    }

    public static void method2() {
        virus1();
        virus2();
        antivirus();
    }

    public static void method3() {
        System.out.println("Вирусы удалены, антивирус остановлен");

    }

    public static void virus1() {
        System.out.println("Я страшный вирус, я украду твои деньги");
    }

    public static void virus2() {
        System.out.println("Я тоже страшный вирус, я сломаю твою компьтер");
    }

    public static void antivirus() {
        anti1();
        anti2();
        System.out.println("_________________________________");
    }

    public static void anti1() {
        System.out.println("Don't worry! денег все ровно нет");
    }

    public static void anti2() {
        System.out.println("Don't worry! что мертво умереть не может");
    }
}
