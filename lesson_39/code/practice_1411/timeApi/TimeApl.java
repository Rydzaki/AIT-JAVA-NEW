package practice_1411.timeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeApl {
    public static void main(String[] args) {

        //        **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//
//          **Получение интервала времени**
//
//          **Сортировка массива по времени**
//
//         **Date Formatter**
//
//          **Парсинг даты из строки**

        ;

        LocalDate currentDay = LocalDate.now();
        printArr(currentDay, "Local Date");

        LocalTime currentTime = LocalTime.now();
        printArr(currentTime, "Local Time");

        LocalDateTime localDateTime = LocalDateTime.now(); // покаживает текущую дату и время

        printArr(localDateTime, "Date and Time");

        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        printArr(gagarin, "Set date");

        printArr(gagarin.getYear(), "Get year");

        printArr(gagarin.getDayOfYear(), "Day of year");

        printArr(gagarin.getDayOfWeek(), "Start Gagarin day of weak");

        printArr(gagarin.isBefore(currentDay), "ожидаем что было раньше (TRUE)");

        printArr(gagarin.isAfter(currentDay), "ожидаем что было раньше (FALSE)");
        printArr("", "Traveling in Time");

        LocalDate newDate = currentDay.plusDays(50);

        printArr(newDate, "Прибавили 50 дней");

        newDate = currentDay.plusWeeks(12);
        printArr(newDate, "Plus N weeks");

        newDate = currentDay.minusMonths(2);
        printArr(newDate, "Minus 2 mouth");

        printArr("",  "Operations with chomounits");
        printArr(localDateTime.plus(9, ChronoUnit.HALF_DAYS), "Half of days (4 c половиной дней");

        newDate = currentDay.plus(2, ChronoUnit.CENTURIES);

        printArr( newDate, "In to 2 centuries");

        printArr(newDate.getDayOfWeek(), "It will be day of week");


        LocalDate ein   = LocalDate.of(1879, 3, 14);
        long res = ChronoUnit.YEARS.between(ein, gagarin);
        printArr(res, "лет между рождением Энштейна и полетом Гагарина");

        printArr(ein.compareTo(gagarin), "Compare dates Сравнение дат");

        LocalDate yesterday   = LocalDate.of(2023, 10, 30);

        printArr(currentDay.compareTo(yesterday), "сравление дней");

        LocalDate[] dates = {yesterday, ein, gagarin, currentDay};
        printArr( Arrays.toString(dates), "Sorting time");

        Arrays.sort(dates);

        printArr(Arrays.toString(dates), "Отсортированные даты в массива");

        // printArr(Date.from(), "Seconds");

    }

    public static void printArr(Object o, String str){
        System.out.println("=============" + str + "==============");
        System.out.println(o);

    }
}
