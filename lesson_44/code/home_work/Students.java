package home_work;

import java.util.Arrays;

public class Students {
    public static void main(String[] args) {
        String[] students = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5", "Student 6", "Student 7", "Student 8", "Student 9"};

        System.out.println(Arrays.toString(students));

        int[] randomLen = new int[2]; // определил массив из двух частей массива Студенты
        int min = students.length / 2; // если будет не четное число элементов массива - это будет минимум, если четное - то все ровно
        int max = students.length - min;
        randomLen[0] = (int) (Math.random() * (max - min + 1) + min); // рендомно определяю длинны двух массивов
        randomLen[1] = students.length - randomLen[0];

        int[] randomIndexArr = new int[students.length]; // новый массив индексов

        String[] stud1 = new String[randomLen[0]];
        String[] stud2 = new String[randomLen[1]];

        for (int i = 0; i < students.length; i++) {
            int randomIndex = (int) (Math.random() * (students.length - i) + i); // переменная хранящая рендомныый индекс в диапазоне чисел(i и len-i)
            randomIndexArr[i] = randomIndex;

            if (i < randomLen[0]) { // заполяю первый массив пока I меньше рендомной длинны
                stud1[i] = students[randomIndex];
            } else {
                stud2[i - randomLen[0]] = students[randomIndex];
            }

            // происходит замена текущего элемента (I) массива Студенты с элементом того же масссива с индексом Рендом, чтобы исключить задваивание
            String temp = students[randomIndex];
            students[randomIndex] = students[i];
            students[i] = temp;

        }


        System.out.println("============= after sort ===============");
        System.out.println(Arrays.toString(students));

        System.out.println("Random Indices: " + Arrays.toString(randomIndexArr));
        System.out.println("Group 1: " + Arrays.toString(stud1));
        System.out.println("Group 2: " + Arrays.toString(stud2));
    }
}
