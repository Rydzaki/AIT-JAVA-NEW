package practice_1411;

public class HW {
    public static void main(String[] args) {

        int[] cub = new int[20];
        int a = 1;
        int b = 6; // начало и конец диапазона для бросания кубика

        // заполняем массив
        for (int i = 0; i < cub.length; i++) {
            cub[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        String[] вероятности = {"один", "два", "три", "четыре", "пять", "шесть"};

        печатьМассива(cub); // создаем метод для печати

        // Инициализируем массив для подсчета количества выпадений каждой цифры
        int[] подсчеты = new int[6];

        // Подсчитываем количество выпадений каждой цифры
        for (int i = 0; i < cub.length; i++) {
            подсчеты[cub[i] - 1]++;
        }

        // Выводим результаты
        for (int i = 0; i < вероятности.length; i++) {
            System.out.println(вероятности[i] + " = " + подсчеты[i]);
        }
    }

    public static void печатьМассива(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }
}
