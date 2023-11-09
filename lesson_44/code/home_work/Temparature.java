package home_work;

import java.util.Arrays;

public class Temparature {

    public static void main(String[] args) {

        double[] okt = {12.0, 9.5, 10.2, 10.0, 11.1, 9.0, 9.8};
        double[] nov = {8.0, 7.5, 7.2, 9.0, 9.3, 8.7, 8.6};
        double[] res = new double[okt.length + nov.length];

        int index = 0;
        for (int i = 0; i < okt.length; i++) {
            res[index++] = okt[i];
        }
        for (int i = 0; i < nov.length; i++) {
            res[index++] = nov[i];
        }
        double sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
        }
        System.out.println((sum/ res.length));

        System.out.println(Arrays.toString(res));

    }
}
