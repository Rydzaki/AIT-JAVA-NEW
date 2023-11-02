package home_work_archive.dao;

import home_work_archive.model.Document;

import java.time.LocalDate;

public interface Archive {

    boolean addDocument(Document document);
    boolean updateDocument(int folderId, int documentId, String url);
    Document getDocumentFromArchive (int folderId, int documentId);
    Document[] getAllDocumentsFromArchive (int folderId);
    Document[] getDocumentsBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();

}
