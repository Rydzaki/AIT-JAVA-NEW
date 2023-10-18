package homeWork_29_2;

public class ArrayRem {

    public static void main(String[] args) {

        int [] arr = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};

        System.out.println(averageEven(arr));
    }

    public static double averageEven (int [] arr){
        double count = 0;
        int score = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] % 2 == 0) {
                count += arr[i];
                score ++;
            }
        }
        return count / score;
    }

}
