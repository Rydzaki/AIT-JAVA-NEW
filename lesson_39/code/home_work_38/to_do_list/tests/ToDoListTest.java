package home_work_38.to_do_list.tests;

import home_work_38.to_do_list.ToDoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoListTest {

    ToDoList[] toDoLists;


    @BeforeEach
    void setUp() {
        toDoLists = ToDoList.values();
    }
    private void printArr(ToDoList[] toDoLists){
        System.out.println("MENU");
        for (int i = 0; i < toDoLists.length; i++) {
            System.out.println(toDoLists[i].getNumber() + " - " + toDoLists[i].getAction());
        }
    }

    @Test
    void printMenu() {
        printArr(toDoLists);

    }



}