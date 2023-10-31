package home_work_38.to_do_list;

public enum ToDoList {

    ADD(1, "Add a note"), SEE(2, "See all posts"), DEL(3, "Delete entry"), OUT(4, "Go out");

    // поля
    private int number;
    private String action;

    ToDoList(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public static void printMenu(ToDoList[] toDoLists){
        System.out.println("MENU");
        for (int i = 0; i < toDoLists.length; i++) {
            System.out.println(toDoLists[i].getNumber() + " - " + toDoLists[i].getAction());
        }

        // todo заменить на фор ич 34 строку
    }
}
