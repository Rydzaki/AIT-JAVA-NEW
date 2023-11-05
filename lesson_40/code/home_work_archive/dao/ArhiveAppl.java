package home_work_archive.dao;

import home_work_archive.model.Document;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class ArhiveAppl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your archive");

        ArchiveImpl archive = new ArchiveImpl(7);

        while (true){
            Menu.printMenu(Menu.values());
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 : {
                    System.out.println("Enter the ID of folder");
                    int idFolder = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the ID of document");
                    int idDocument = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter name of the document");
                    String nameDoc = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter URL of document");
                    String urlDoc = scanner.nextLine();
                    scanner.nextLine();
                    LocalDate dateSet = LocalDate.now();

                    Document docNew = new Document(idFolder, idDocument, (nameDoc), (urlDoc), dateSet);
                    archive.addDocument(docNew);
                    break;
                }
                case 2 : {
                    System.out.println("Enter the ID of folder");
                    int idFolder = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the ID of document");
                    int idDocument = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new URL");
                    String urlNew = scanner.nextLine();
                    scanner.nextLine();

                    archive.updateDocument(idFolder, idDocument, urlNew);
                    System.out.println(archive.getDocumentFromArchive(idFolder, idDocument));
                    break;
                }
                case 3 : {
                    System.out.println("Enter the ID of folder");
                    int idFolder = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the ID of document");
                    int idDocument = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(archive.getDocumentFromArchive(idFolder, idDocument));
                    break;
                }
                case 4 : {
                    System.out.println("Enter the ID of folder");
                    int idFolder = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(Arrays.toString(archive.getAllDocumentsFromArchive(idFolder)));
                    break;
                }
                case 5 : {
                    // todo getDocumentsBetweenDate
                    break;
                }
                case 6 : {
                    System.out.println("Size of archive = " + archive.size());
                }
            }
        }
    }
}
