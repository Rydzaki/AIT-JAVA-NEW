package prictice;

public class HomeWork_14 {

    public static void main(String[] args) {

        int[] array1 = HW_14_ArrMetod.randomArray10(-100, 100);

        HW_14_ArrMetod.split();

        System.out.println("Сортировка выбором от большего к меньшему: ");
        HW_14_ArrMetod.sortArrayMax(array1);
        HW_14_ArrMetod.printArray(array1);
        HW_14_ArrMetod.split();
        System.out.println("Сортировка выбором от меньшего к большему: ");
        HW_14_ArrMetod.sortArrayMin(array1);
        HW_14_ArrMetod.printArray(array1);
        HW_14_ArrMetod.split();
        System.out.println("Пузырьковая сортировка от меньшего к большему: ");
        HW_14_ArrMetod.bubbleSortMin(array1);
        HW_14_ArrMetod.printArray(array1);
        HW_14_ArrMetod.split();
        System.out.println("Пузырьковая сортировка от большего к меньшему: ");
        HW_14_ArrMetod.bubbleSortMax(array1);
        HW_14_ArrMetod.printArray(array1);
        HW_14_ArrMetod.split();
        HW_14_ArrMetod.split();


        int[] array2 = HW_14_ArrMetod.randomArray20(-100, 100);

        HW_14_ArrMetod.split();

        System.out.println("Сортировка выбором от большего к меньшему: ");
        HW_14_ArrMetod.sortArrayMax(array2);
        HW_14_ArrMetod.printArray(array2);
        HW_14_ArrMetod.split();
        System.out.println("Сортировка выбором от меньшего к большему: ");
        HW_14_ArrMetod.sortArrayMin(array2);
        HW_14_ArrMetod.printArray(array2);
        HW_14_ArrMetod.split();
        System.out.println("Пузырьковая сортировка от меньшего к большему: ");
        HW_14_ArrMetod.bubbleSortMin(array2);
        HW_14_ArrMetod.printArray(array2);
        HW_14_ArrMetod.split();
        System.out.println("Пузырьковая сортировка от большего к меньшему: ");
        HW_14_ArrMetod.bubbleSortMax(array2);
        HW_14_ArrMetod.printArray(array2);
        HW_14_ArrMetod.split();





    }
}
