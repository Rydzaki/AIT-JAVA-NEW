package prictice.todolist_file;

//import java.util.Scanner;
//import practice.todolist_appl.dao.ToDoListImpl;
//import practice.todolist_appl.model.Menu;
//import practice.todolist_appl.model.Task;

import prictice.todolist_file.dao.ToDoListImpl;
import prictice.todolist_file.model.Menu;
import prictice.todolist_file.model.Task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> origin/master
import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task newTask = new Task(toDoList.quantity(), task);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber);
                    if(!(removedTask == null)){
                        System.out.println(removedTask + " is removed.");
                    }
                    break;
                }
                case 4:{
                    System.out.println("Saving");
                    // todo
<<<<<<< HEAD
                    List<Task> tasks = toDoList.gerAllTasks();
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./dest/todoList.dat"))) {
                        oos.writeObject(tasks); // отправили весь хешсет в файл
=======
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./dest/todoList.dat"))) {
                        oos.writeObject(toDoList); // отправили весь хешсет в файл
>>>>>>> origin/master

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
<<<<<<< HEAD
                    break;
=======
>>>>>>> origin/master
                }

                case 5:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
