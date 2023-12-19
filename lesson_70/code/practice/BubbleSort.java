package practice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] массив = {64, 34, 25, 12, 22, 11, 90};

        пузырьковаяСортировка(массив);

        System.out.println("Отсортированный массив:");
        for (int значение : массив) {
            System.out.print(значение + " ");
        }
    }

    static void пузырьковаяСортировка(int[] массив) {
        int размер = массив.length;

        for (int i = 0; i < размер - 1; i++) {
            for (int j = 0; j < размер - i - 1; j++) {
                if (массив[j] > массив[j + 1]) {
                    // Поменять элементы местами, если они стоят в неправильном порядке
                    int временнаяПеременная = массив[j];
                    массив[j] = массив[j + 1];
                    массив[j + 1] = временнаяПеременная;
                }
            }
        }
    }

    public static void main1(String[] args) {
        System.out.println("------------");
        for (int i = 0; i < 10; i++) {

        }
    }








}