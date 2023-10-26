package home_work_38.to_do_list.dao;

import home_work_38.to_do_list.Task;

import java.sql.Array;
import java.util.Arrays;

public class ToDoListImpl implements ToDoList {

    private Task[] tasks;
    private int size;
    public ToDoListImpl (int capacity){
        tasks = new Task[capacity]; // макс кол-во заданий
    }
    @Override
    public boolean addNote(Task task) {
        if(task == null || size == tasks.length || findTask(task.getId()) !=null ){

        }
        return false;
    }

    @Override
    public void seeAllPosts(Task[] tasks) {
        Arrays.sort(tasks);
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }

    }

    @Override
    public Task deleteEntry(int id) {
        for (int i = 0; i < size; i++) {
            if(tasks[i].getId() == id){
                Task v = tasks[i]; // убрали найденный элемент в переменную
                tasks[i] = tasks[size - 1]; //поставили на место найденного последний
                tasks[size - 1] = null; // затерли
                size --;

                Arrays.sort(tasks);
                return v;
            }

        }
        return null;
    }

    @Override
    public void goOut() {
        System.out.println("Bye!");
        System.exit(0);

    }

    private Task findTask(int id){
        for (int i = 0; i < size; i++) {
            if(tasks[i].getId() == id){
                return tasks[i];
            }
        }
        return null;
    }

    public int quantity() {
        return size;
    }
}
