package practice.library.model;

import java.util.*;
import java.util.stream.Collectors;

public class LibAppl {
    public static void main(String[] args) {

        Library library = new Library();

        library.getBooks().forEach(System.out::println);
        System.out.println("================Reider=================");
        library.getReaders().forEach(System.out::println);

        System.out.println("==================Activities=====================");
        System.out.println("==================Books unsorted =====================");
        library.getBooks().forEach(System.out::println);
        List<Book> listBookByYearIssue = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear)) // сортируем по встроенному компаратору
                .toList();
        System.out.println();
        listBookByYearIssue.forEach(System.out::println);

        System.out.println("================== List email all users ====================");
//        ArrayList<Email> emailArrayList = new ArrayList<>(); //
//        for(Reader reader : library.getReaders()){// обращаемся к лайбрари и береи его метод
//            emailArrayList.add(new Email(reader.getEmail())); // передаем его метод
//        }
//        for (Email email : emailArrayList){
//            System.out.println(email);
//        }

        List<Email> addresses = library.getReaders().stream()
                .map(Reader::getEmail) // взяли в классе редер маилы
                .map(Email::new)
                .toList();
        addresses.forEach(System.out::println);

        System.out.println("================== Mailing List Subscribed users ====================");
//                List<Email> addressesSubscribed = new ArrayList<>();
//        for (Reader reader : library.getReaders()){
//            if (reader.getBooks().size() >= 1 && reader.isSubscriber())
//                addressesSubscribed.add(new Email(reader.getEmail()));
//        }
//        addressesSubscribed.forEach(System.out::println);
        List<Email>addressesSubscribed = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(r -> r.getBooks().size() >= 1) // проверяет что читатель взял одну книгу и более
                .map(Reader::getEmail)
                .map(Email::new)
                .toList();

        addressesSubscribed.forEach(System.out::println);

        System.out.println("================== List of books ====================");

//        Set <Book> rentList = new HashSet <>(); // List заменили на Set чтобы убрать дубликаты
//        for(Reader reader : library.getReaders()){
//            rentList.addAll(reader.getBooks());
//        }
//        rentList.forEach(System.out::println);
        List<Book> rentedBooks = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())// вытрушивает нужные элементы
                .distinct() // убирает дубликаты
                .collect(Collectors.toList()); // перегоняет в List
        rentedBooks.forEach(System.out::println);

        System.out.println("================== Часто одалживаемые книги ====================");
//        int max =0;
//        for (Reader reader : library.getReaders()){
//            if(reader.getBooks().size() > max){
//                max = reader.getBooks().size();
//            }
//        }
//        System.out.println(max);
        Integer res = library.getReaders().stream()
                .map(reader -> reader.getBooks().size()) // перегоняем значания из одного в другое
                .reduce(0, (max, size) -> size > max ? size : max);
        System.out.println(res);

        System.out.println("======Соберем всех пользователей, которые взяли более 2-х книг в группу \"TO_MUCH\", остальных=======================");
        Map<String, List<Email>> result = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isSubscriber()) {
                if (reader.getBooks().size() > 2) {// у кого взятых книг больше 2х то попадает в туматч
                    if (!result.containsKey("TOO_MUCH")) { // по этому ключу еще нет значений
                        result.put("TOO_MUCH", new ArrayList<>());
                    }
                    result.get("TOO_MUCH").add(new Email(reader.getEmail()));
                } else {
                    if (!result.containsKey("OK")) {
                        result.put("OK", new ArrayList<>());
                    }
                    result.get("OK").add(new Email(reader.getEmail()));
                }
            }
        }
        // Print keys and values - проход по всем ключам и их значениям
        for (String key : result.keySet()) {
            System.out.println("key: " + key + " value: " + result.get(key));
        }
        System.out.println("-------------------------");
        System.out.println(result.entrySet());
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        Map<String, List<Email>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        Collectors.mapping(r -> new Email(r.getEmail()), Collectors.toList())));
        System.out.println(map.entrySet());


        boolean checkBook = checkBook(library, "George Orwell"); // брали книгу или нет
        System.out.println(checkBook);

        System.out.println("===========Группировка другим способом=============");
        Map<Integer,String> readersMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(r -> r.getBooks().size(),
                        Collectors.mapping(Reader::getFio, Collectors.joining(", ", "{", "}"))));
        System.out.println(readersMap.entrySet());

    }// end of main

    private static boolean checkBook (Library library, String author){
        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> author.equals(book.getAuthor()));
        return match;
    }


} // end of klass
