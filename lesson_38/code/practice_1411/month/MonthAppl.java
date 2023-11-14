package practice_1411.month;

public class MonthAppl {
    public static void main(String[] args) {
        Month   month = Month.FEB;
        System.out.println(month);
        System.out.println(month.plusMonth(2)); // джем APR
        System.out.println(month.plusMonth(13).getName()); //


    }
}
