package home_work_archive.dao;

import home_work_archive.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive {

    // компоратор позволяет сортировать объекты типа Документ по дате потом по id документа
    static Comparator<Document>comparator = (d1, d2) -> {
        int res = d1.getDateDoc().compareTo(d2.getDateDoc());
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };

    private Document[] documents; // хранение документов в массиве
    private int size; // кол-во документов

    // конструктор
    public ArchiveImpl(int capacity){
        documents = new Document[capacity];
      //  this.size = 0;
    }

    @Override
    public boolean addDocument(Document document) {
        if (document == null || size == documents.length || getDocumentFromArchive(document.getFolderId(), document.getDocumentId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        index = index >= 0 ? index : -index - 1; // если отсутствует меняем знак индекса и отнимаем один, чтобы поставить на нужное место

        System.arraycopy(documents, index, documents, index+1, size - index);
        documents[index] = document;
        size++;


        return true;
    }

    @Override
    public boolean updateDocument(int folderId, int documentId, String url) {
        Document document = getDocumentFromArchive((folderId), (documentId));
        if(document == null){
            return false;
            }
        document.setUrl(url);
        return true;
    }

    @Override
    public Document getDocumentFromArchive(int folderId, int documentId) {
        Document pattern = new Document((folderId), (documentId), null, null, null);
        for (int i = 0; i < size; i++) {
            if(pattern.equals(documents[i])){
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocumentsFromArchive(int folderId) {
        return findByPredicate((p -> folderId == p.getFolderId()));
    } //p.getFolderID() == folderId

    private Document[] findByPredicate (Predicate<Document> predicate){ // возвращаем массив найденых объектов
        Document[]res = new Document[size]; // объявили массив избыточной длинны
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(documents[i])){
                res[j++] = documents[i];

            }
        }
        return Arrays.copyOf(res, j); // скопировал массив на сам себя

    }

    @Override
    public Document[] getDocumentsBetweenDate(LocalDate dateFrom, LocalDate dateTo) { // TODO дописать метод
//        Document pattern = new Document(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());
//        //ввели объектную переменную, шаблон
//        int from = -Arrays.binarySearch(documents, 0, size, pattern, comparator) - 1;//находим индекс начального фото левый
//        // край from = from>=0 ? from : -from-1;
//        pattern = new Document(0, Integer.MAX_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));// находим правый край
//        int to = -Arrays.binarySearch(documents, 0, size, pattern, comparator) - 1;
        // to = to >=0 ? to : -to-1;
        return null;
                // Arrays.copyOfRange(documents, from, to);// диапазон, создаем новый массив с нужными документами
    }

    @Override
    public int size() {
        return size;
    }
//    @Override
////    public Document findDocument(int documentId, int folderId) {
//////        Document res = null;
////        for (int i = 0; i < size; i++) {
////            if (documents[i].getDocumentId() == documentId && documents[i].getFolderId() == folderId) {
////                return documents[i];
////            }
////        }
////        return null;
////    }



}
