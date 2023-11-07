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
        if(task == null || size == tasks.length || findTask(task.getId()) != null ){
            return false;

        }

        //task.setId(size);
        tasks[size] = task;
        //DONE  изменил конструктор

        size++;
        return true;
    }

    @Override
    public void seeAllPosts(Task[] tasks) {
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }
        Arrays.sort(tasks); // теориетически можно и убрать, но пусть будет

    }

    @Override
    public Task deleteEntry(int id) {
        for (int i = 0; i < size; i++) {
            if(tasks[i].getId() == id){
//                Task v = tasks[i]; // убрали найденный элемент в переменную
//                tasks[i] = tasks[size - 1]; //поставили на место найденного последний
//                tasks[size - 1] = null; // затерли
//                size --;
//                return v;
                System.arraycopy(tasks, i+1, tasks, i, size-1-i);
                tasks[--size] = null;
            } // сменил метод удаления (новый наползание массива) чтобы не сбивалась сортировка

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

    public void printTasks() {
        // for loop, print tasks
        for (int i = 0; i < size; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + size + " tasks.");
    }
}
