package practice_1411.data_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class TimeAppl1 {
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

        printArr("", "DateTimeFormatter");
        DateTimeFormatter df  = DateTimeFormatter.ISO_DATE;
        System.out.println(gagarin.format(df));
        df = DateTimeFormatter.ofPattern("dd.MMMM.yy", Locale.ENGLISH); // задается формат в виде строки (4 большие буквы звменью на месяц словом)
        printArr(gagarin.format(df), "Задали другой формат отображения");

        printArr("", "Parsing date from String");

        String str = "01.11 2023";
        System.out.println(str);

        LocalDate date1 = dateParse(str); // делаем метод для конвертации строки в дату
        System.out.println(date1);

        str = "01.11.2023";
        date1 = dateParse(str);
        System.out.println(date1);
        System.out.println(date1.getDayOfWeek());




    }

    public static void printArr(Object o, String str){
        System.out.println("=============" + str + "==============");
        System.out.println(o);

    }

    private static LocalDate dateParse(String date){ // строка на входе
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyy][dd MM yyyy][dd.MM yyyy]");// перечисляем форматы даты для конвертации в iso

        //df = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return LocalDate.parse(date, df); // преобразовать в формат даты типа ISO

    }

}
