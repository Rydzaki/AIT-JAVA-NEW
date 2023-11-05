package home_work_archive.dao;

import home_work_archive.model.Document;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive {


    static Comparator<Document>comparator = (d1, d2) -> {
        int res = d1.getDateDoc().compareTo(d2.getDateDoc());
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };

    private Document[] documents;
    private int size;

    public ArchiveImpl(int capacity){
        documents = new Document[capacity];
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
    }

    private Document[] findByPredicate (Predicate<Document> predicate){
        Document[]res = new Document[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(documents[i])){
                res[j++] = documents[i];

            }
        }
        return Arrays.copyOf(res, j);

    }

    @Override
    public Document[] getDocumentsBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Document[0];
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
