package homeWork_28.HW_28_2;

public class RendomArr {

    public int[] randomArray(int a, int b, int x) {
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        // напечатаем полученный массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
        return arr;
    }
    public int positiveNum(int[] arr) {
        int x = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                x++;
            }
        }
        System.out.println("положительных чисел; " + x);
        return x;
    }
    public int negativeNum(int[] arr) {
        int x = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                x++;
            }
        }
        System.out.println("отрицательных чисел; " + x);
        return x;
    }
    public int evenNum(int[] arr) {
        int x = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                x++;
            }
        }
        System.out.println("четных чисел; " + x);
        return x;
    }
    public int zeroArr(int[] arr) {
        int x = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                x++;
            }
        }
        System.out.println("нулей; " + x);
        return x;
    }

}

