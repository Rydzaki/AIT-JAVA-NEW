package home_work_archive.dao;

import home_work_archive.model.Document;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

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
        if (document == null || size == documents.length || (findDocument(document.getDocumentId(), document.getFolderId()) != null)) {
            return false;
//        }
//        for (int i = 0; i < size; i++) {
//            Document v = documents[i];
//            if(v.getFolderId() == document.getFolderId() && v.getDocumentId() == document.getDocumentId()){
//                return false;
//            }
        }
        documents[size] = document;
        size++;
        Arrays.sort(documents, 0, size, comparator);
        return true;
    }

    @Override
    public boolean updateDocument(int folderId, int documentId, String url) {
        return false;
    }

    @Override
    public Document getDocumentFromArchive(int folderId, int documentId) {
        return null;
    }

    @Override
    public Document[] getAllDocumentsFromArchive(int folderId) {
        return new Document[0];
    }

    @Override
    public Document[] getDocumentsBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Document[0];
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public Document findDocument(int documentId, int folderId) {
//        Document res = null;
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId && documents[i].getFolderId() == folderId) {
                return documents[i];
            }
        }
        return null;
    }


}
