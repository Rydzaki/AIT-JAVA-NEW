package practice.family_budget.model;

public enum Menu {
    BUDGET(1, "Budget"), LOAD(2, "Load data"), STORE(3, "Stores"), PERSONS(4, "Persons"), PERIOD(5, "Period"), CHECK(6, "Check budget"), EXIT(7, "Exit")
    ;

    // поля
    private int nemuItem;
    private String action;

    Menu(int nemuItem, String action) {
        this.nemuItem = nemuItem;
        this.action = action;
    }

    public static void perintMenu(){
        System.out.println("\n--------------------------------------------------------------------------------------------------");
        Menu[]menu = Menu.values(); // вытаскивает все значания в массив
        for (Menu menu1: menu) {
            System.out.print(menu1.nemuItem + " - "+"["+  menu1.action+ "] ");
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------");
    }
}
