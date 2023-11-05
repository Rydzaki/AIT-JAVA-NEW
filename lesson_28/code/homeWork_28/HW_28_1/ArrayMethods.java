package homeWork_28.HW_28_1;

import java.lang.module.FindException;
import java.lang.reflect.Array;

public class ArrayMethods {

    public int sumArray (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public int searchArray (int [] arr, int x){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == x) {
                index = i;
            }
        }
        return index;
    }

}
