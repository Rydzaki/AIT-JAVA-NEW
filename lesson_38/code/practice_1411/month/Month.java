package practice_1411.month;

public enum Month {
    JAN("January",31), FEB("February", 28), MAR("March", 31), APR("April", 30), MAY("May", 31), JUN("June", 30), JUL("July", 31), AUG("August", 31), SEP("September", 30), OCT("October", 31), NOV("November", 30), DEC("December", 31);


    private String name;
    private int day;

    Month(String name, int day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }
    public Month plusMonth(int quntity){
        int index = ordinal(); // текущий номер месяца
        index = index + quntity;
        Month[] months = values(); // все константы вносим в масиив типа Month
        int res = index % months.length; // вычисляем номер месяца после прибавления quantity
        return months[res]; // возвращаем объект типа Month index которого = % 12



    }

}
