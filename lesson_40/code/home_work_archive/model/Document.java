package home_work_archive.model;

import java.time.LocalDate;
import java.util.Objects;

public class Document implements Comparable<Document> {
    private int folderId;
    private int documentId;
    private String nameDoc;
    private String url;
    private LocalDate dateDoc;

    public Document(int folderId, int documentId, String nameDoc, String url, LocalDate dateDoc) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.nameDoc = nameDoc;
        this.url = url;
        this.dateDoc = dateDoc;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getDateDoc() {
        return dateDoc;
    }

    public void setDateDoc(LocalDate dateDoc) {
        this.dateDoc = dateDoc;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", nameDoc='" + nameDoc + '\'' +
                ", dateDoc=" + dateDoc +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Document documents = (Document) object;
        return folderId == documents.folderId && documentId == documents.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, documentId);
    }

    @Override
    public int compareTo(Document o) {

        int res = Integer.compare(folderId, o.folderId);
        return res != 0 ? res : Integer.compare(documentId, o.documentId);
    }
}
