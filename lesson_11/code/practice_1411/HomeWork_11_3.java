package practice_1411;

public class HomeWork_11_3 {
    public static void main(String[] args) {

        int[] randomInt = new int[10];
        int a = -10;
        int b = 10;

        //int[] revers = new int[10];

        for (int i = 0; i < randomInt.length; i++) { // создаем рандомный массив
            randomInt[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        for (int i = 0; i < randomInt.length; i++) { // печатаем созданный массив
            System.out.print(randomInt[i] + " | ");
        }
        System.out.println();

//        for (int i = 0; i < randomInt.length; i++) {
//            revers[i] = randomInt[randomInt.length - i - 1];
//
//            //System.out.print(randomInt[randomInt.length -4]); можно обратиться по индексу в как в пиноте с конца
//
//                System.out.print(revers[i] + " | ");


        for(int i = 0; i<randomInt.length/2;i++) {
            int temp = randomInt[i]; // создаем временную переменную
            randomInt[i] = randomInt[randomInt.length - i - 1];
            randomInt[randomInt.length - i - 1] = temp; } // обратный порядок

        for (int i = 0; i < randomInt.length; i++) { // печатаем созданный массив
            System.out.print(randomInt[i] + " | ");
        }
        System.out.println();
    }

}

