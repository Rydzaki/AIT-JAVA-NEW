package practice_1411.tryCatch;

import java.util.Scanner;

public class TryCatchAppl {

    public static void main(String[] args) {
        /*
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("input first number");
            int a = scanner.nextInt();
            System.out.println("input second number");
            int b = scanner.nextInt();

            int division = a/b;

            System.out.println("division "+ a + "/" +b+ " = "+division);
        } catch (Exception e ) {
            System.out.println(e.getMessage()); // причина
        }
        */
        /*
        int[] arr = {73, -17, 99, 26, -45, 34, -83};
        int l = arr.length;
        System.out.println(l);
        try{
            arr[9] = 157;
        } catch (Exception e){
            System.out.println(e.getMessage() + ", "+ e.toString());
        }
        */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("input number");
            int n = scanner.nextInt();
            System.out.println("your input: " + n);
        }catch (Exception e){
            System.out.println(e.toString() + " | "+ e.getMessage()+ " | "+ e.getCause()+ " | wrong inpit");
        }









    }
}
//package home_work_38.to_do_list;
//
//        import home_work_38.to_do_list.dao.ToDoListImpl;
//
//        import java.util.Scanner;
//
//public class ToDoListAppl {
//
//    public static void main(String[] args) {
//
//        System.out.println("Welcome user to the Tasks App");
//        Scanner scanner = new Scanner(System.in);
//
//        ToDoListImpl toDoList = new ToDoListImpl(4);
//        try {
//            while (true) {
//                ToDoList.printMenu(ToDoList.values());
//                int choice = scanner.nextInt();
//                scanner.nextLine();
//
//                switch (choice) {
//                    case 1: {
////                   System.out.print("Enter the task ID: ");
////                   int id = scanner.nextInt();
////                   scanner.nextLine();
//                        System.out.println("Enter the name of the task: ");
//                        String task = scanner.nextLine();
//                        System.out.println("Enter the task number: ");
//                        int taskNumber = scanner.nextInt();
//                        scanner.nextLine();
//
//                        Task task1 = new Task(task, taskNumber);
//                        toDoList.addNote(task1); // добавили в библиотеку
//                        break;
//                    }
//                    case 2: {
//                        System.out.println("Your tasks: ");
//                        toDoList.printTasks();
//
//
////                    Task[] tasksAll = new Task[toDoList.quantity()];
////                    System.arraycopy(toDoList, 0, tasksAll, 0, toDoList.quantity());
////                    toDoList.seeAllPosts(tasksAll);
//                        break;
//                        //DONE TODO не выводит все задачи
//                    }
//                    case 3: {
//                        System.out.println("Enter the task ID to delete: ");
//                        int idDel = scanner.nextInt();
//                        toDoList.deleteEntry(idDel);
//                        break;
//                    }
//                    case 4: {
//                        toDoList.goOut();
//                        break;
//                    }
//                    default:
//                        System.out.println("Invalid input");
//                        break;
//                }
//            }
//        } catch (Exception exception){
//            System.out.println("Input error. Please repeat");
//        }
//
//
//    }
//}

