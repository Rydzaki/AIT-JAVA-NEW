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
        archive = new ArchiveImpl(7);
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

        Document document = new Document(3, 3, "test", "www.test.com", now);
        assertTrue(archive.addDocument(document));

        assertEquals(7, archive.size());

        Document document1 = new Document(3, 4, "test1", "www.test.com", now);
        assertFalse(archive.addDocument(document1));
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
}