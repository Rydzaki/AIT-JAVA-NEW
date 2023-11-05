package home_work_39;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {


    public static int getAge(String birthDate) {
        Integer[] ege = new Integer[3];
        String[] dateArr = birthDate.split("[/\\-.]");
        for (int i = 0; i < dateArr.length; i++) {
            String year = null;
            String moun = null;
            String day = null;

            if(dateArr[0].length() == 4){
                year = dateArr[0];
                moun = dateArr[1];
                day = dateArr [2];
            }
            if(dateArr[2].length() == 4 ){
                year = dateArr[2];
                moun = dateArr[1];
                day = dateArr [0];
            }
            ege[0] = Integer.parseInt(day);
            ege[1] = Integer.parseInt(moun);
            ege[2] = Integer.parseInt(year);
        }

        LocalDate date = LocalDate.of(ege[2], ege[1], ege[0]);
        //LocalDate date = LocalDate.parse();
        System.out.println(date);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        long age = ChronoUnit.YEARS.between(date, currentDate);
        System.out.println(age);
        int res = (int) age;
        return res;
    }

    public static String[] sortStringDates(String[] dates) {
        //TODO
        String[] originalDates = Arrays.copyOf(dates, dates.length);
        LocalDate[] dateInt = new LocalDate[dates.length];
        Integer[] ege = new Integer[3];
        for (int i = 0; i < dates.length; i++) {
            String[] dateArr = dates[i].split("[/\\-.]");
            for (int j = 0; j < dateArr.length; j++) {
                String year = null;
                String moun = null;
                String day = null;

                if (dateArr[0].length() == 4) {
                    year = dateArr[0].trim();
                    moun = dateArr[1].trim();
                    day = dateArr[2].trim();
                }
                if (dateArr[2].length() == 4) {
                    year = dateArr[2].trim();
                    moun = dateArr[1].trim();
                    day = dateArr[0].trim();
                }
                ege[0] = Integer.parseInt(day);
                ege[1] = Integer.parseInt(moun);
                ege[2] = Integer.parseInt(year);
            }
            LocalDate date = LocalDate.of(ege[2], ege[1], ege[0]);

            //LocalDate[] dateInt = new LocalDate[dates.length];
            dateInt[i] = date;
        }

        Arrays.sort(dateInt);

        for (int i = 0; i < dates.length; i++) {
            dates[i] = String.valueOf(dateInt[i]);
            }
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        return dates;

//        Arrays.sort(dates);
//        System.out.println(Arrays.toString(dates));
//        return dates;
    }

}