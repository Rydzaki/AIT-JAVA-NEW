package home_work_archive.dao;

import home_work_archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    Archive archive;
    LocalDate now = LocalDate.now();
    Document[] doc;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(8);
        doc = new Document[7];
        doc[0] = new Document(1, 1, "Report1", "www.report.com ", now);
        doc[1] = new Document(1, 2, "Report2", "www.report.com ", now);
        doc[2] = new Document(2, 1, "Report3", "www.report.com ", now);
        doc[3] = new Document(2, 2, "Report4", "www.report.com ", now);
        doc[4] = new Document(3, 1, "Report5", "www.report.com ", now);
        doc[5] = new Document(3, 2, "Report6", "www.report.com ", now);
        for (int i = 0; i < doc.length; i++) {
            archive.addDocument(doc[i]);
        }
    }

    @Test
    void addDocumentTest() {

        assertFalse(archive.addDocument(null));
        assertFalse(archive.addDocument(doc[1]));

        Document document1 = new Document(4, 1, "test", "www.test.com", now);
        //Document document1 = null;
        assertTrue(archive.addDocument(document1));

        assertEquals(7, archive.size());

        Document document2 = new Document(3, 4, "test1", "www.test.com", now);
        assertFalse(archive.addDocument(document2));

        printArr(doc);
    }

    @Test
    void updateDocument() {
    }

    @Test
    void getDocumentFromArchive() {
    }

    @Test
    void getAllDocumentsFromArchive() {

    }

    @Test
    void getDocumentsBetweenDate() {
    }

    @Test
    void size() {

        assertEquals(6, archive.size());
    }

    private void printArr (Object[] o) {
        for (int i = 0; i <o.length ; i++) {
            System.out.println(o[i]);

        }
    }

    @Test
    void findBook(){
        assertEquals(doc[1], archive.findDocument(2, 1));
        assertNull(archive.findDocument(4, 4));

    }
}