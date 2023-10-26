package home_work_38.to_do_list;

import home_work_38.to_do_list.dao.ToDoListImpl;

import java.util.Scanner;

public class ToDoListAppl {

    public static void main(String[] args) {

        System.out.println("Welcome user to the Tasks App");
        Scanner scanner = new Scanner(System.in);

        ToDoListImpl toDoList = new ToDoListImpl(4);

        while (true){
            ToDoList.printMenu(ToDoList.values());
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 : {
                    System.out.print("Enter the task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the name of the task: ");
                    String task = scanner.nextLine();
                    System.out.println("Enter the task number: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();

                    Task task1 = new Task(id, task, taskNumber);
                    toDoList.addNote(task1); // добавили в библиотеку
                    break;
                }
                case 2 : {
                    Task[] tasksAll = new Task[toDoList.quantity()];
                    System.arraycopy(toDoList, 0, tasksAll, 0, toDoList.quantity());
                    toDoList.seeAllPosts(tasksAll);
                    break;
                    // TODO не выводит все задачи
                }
                case 3 :{
                    System.out.println("Enter the task ID to delete: ");
                    int idDel = scanner.nextInt();
                    Task delTask = toDoList.deleteEntry(idDel);
                   break;
                }
                case 4 : {
                    toDoList.goOut();
                    break;
                }
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }


    }
}
