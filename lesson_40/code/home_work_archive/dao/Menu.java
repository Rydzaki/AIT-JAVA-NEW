package home_work_archive.dao;

import javax.swing.*;

public enum Menu {

    ADD(1, "Add a document"), UP(2, "Update a document"), GETDOC(3, "Get document from archive"), GETALL(4, "Get all documents from archive"), DATE(5, "Get documents between date"), SIZE(6, "Size of all archive")    ;

    private int number;

    private String action;

    Menu(int number, String action) {
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

    public static void printMenu(Menu[] menu){
        System.out.println("MENU: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].getNumber()+ " - "+menu[i].getAction());
        }
    }
}
