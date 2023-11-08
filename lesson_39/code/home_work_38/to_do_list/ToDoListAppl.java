package home_work_38.to_do_list;

import home_work_38.to_do_list.dao.ToDoListImpl;

import java.util.Scanner;

public class ToDoListAppl {

    public static void main(String[] args) {

        System.out.println("Welcome user to the Tasks App");
        Scanner scanner = new Scanner(System.in);

        ToDoListImpl toDoList = new ToDoListImpl(4);

        while (true) {
            int choice;
            try {

                ToDoList.printMenu(ToDoList.values());
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input error. Please repeat");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1: {
//                   System.out.print("Enter the task ID: ");
//                   int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the name of the task: ");
                    String task = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter the task number: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();
                        //TODO не работает вывод сообщения (меню перескакивает)
                    Task task1 = new Task(task, taskNumber);
                    toDoList.addNote(task1); // добавили в библиотint taskNumber;
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.printTasks();


//                    Task[] tasksAll = new Task[toDoList.quantity()];
//                    System.arraycopy(toDoList, 0, tasksAll, 0, toDoList.quantity());
//                    toDoList.seeAllPosts(tasksAll);
                    break;
                    //DONE TODO не выводит все задачи
                }
                case 3: {
                    int idDel;
                    try {
                    System.out.println("Enter the task ID to delete: ");
                        idDel = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Input error ID. Please repeat");
                        continue;
                    }
                    toDoList.deleteEntry(idDel);
                    break;
                }
                case 4: {
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
