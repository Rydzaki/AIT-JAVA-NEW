package practice_1411;

public class AgeOfStudents {
    public static void main(String[] args) {
        int[] ageOfStudent = {30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34, 28, 22, 18};
        // мах элемент массива
        int max = ageOfStudent[0]; // считаем его максимальным
        int index = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] > max){ // когда текущий элемент массива будет больше чем макс
                max = ageOfStudent[i];     // взяли максимальный элемент
                index = i; // взяли индекс максимума
            }

        }
        System.out.println("Max ege: " + max + " " + index);

// ищем минимум

        int min = ageOfStudent[0]; // считаем его максимальным
        int indexMin = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] < min) { // когда текущий элемент массива будет больше чем макс
                min = ageOfStudent[i];     // взяли минимальный элемент
                indexMin = i; // взяли индекс максимума
            }

        }
        System.out.println("Min ege: " + min + " " + indexMin);

        // ищем дубликаты
        int dublikate = ageOfStudent[0];
        int dCiunt = 0; // счетчик
        int indexD = 0;
        System.out.println();

        for (int i = 0; i < ageOfStudent.length; i++) {
            int temp = i;

            for (int j = i+ 1; j < ageOfStudent.length; j++) { // начинается поиск дубликата
                if(ageOfStudent[i] == ageOfStudent[j]){
                    dublikate = ageOfStudent[temp];
                    indexD = temp;
                    dCiunt ++; // возможно index += j -проверить

                }
            }
        }
        System.out.println("Dublicate: "+ dublikate + " index: " + indexD);
        System.out.println("Quality of dublikate: "+ dCiunt);


        int dooble = ageOfStudent[0];
        int indexDooble = 0;
        int sumDoble = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if (ageOfStudent[i] == dooble);{
            dooble = ageOfStudent[i];
            indexDooble = i;
                        }
            for (int j = i + 1; j <ageOfStudent.length ; j++) {
                if (ageOfStudent[i] == ageOfStudent[j]){
                    sumDoble ++;
                }
            }
        }
        System.out.println(dooble+ " " + indexDooble + " " + sumDoble);

    }
    }
