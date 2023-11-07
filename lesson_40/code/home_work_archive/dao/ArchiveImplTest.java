package home_work_archive.dao;

import home_work_38.to_do_list.ToDoList;
import home_work_archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    Archive archive;
    LocalDate now = LocalDate.now();
    Document[] doc;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(7);
        doc = new Document[6];
        doc[0] = new Document(1, 1, "Report1", "www.report.com ", now.minusDays(2));
        doc[1] = new Document(1, 2, "Report2", "www.report.com ", now.minusDays(2));
        doc[2] = new Document(2, 1, "Report3", "www.report.com ", now.minusDays(3));
        doc[3] = new Document(2, 2, "Report4", "www.report.com ", now.minusDays(4));
        doc[4] = new Document(3, 1, "Report5", "www.report.com ", now.minusDays(5));
        doc[5] = new Document(3, 2, "Report6", "www.report.com ", now.minusDays(6));
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

        archive.addDocument(document1);
        printArr(doc);

        Document document2 = new Document(3, 4, "test1", "www.test.com", now);
        assertFalse(archive.addDocument(document2));

        //printArr(doc);
    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1, 1, "UPDATE URL"));
        assertNull(archive.getDocumentFromArchive(4, 1));
    }

    @Test
    void getDocumentFromArchive() {
        assertEquals(doc[5], archive.getDocumentFromArchive(3, 2));
        assertNull(archive.getDocumentFromArchive(4, 1)); // ищем не существующий
    }

    @Test
    void getAllDocumentsFromArchive() {
        Document[] ext = {doc[4], doc[5]};
        Document[] act = archive.getAllDocumentsFromArchive(3);
        Arrays.sort(act);

        assertArrayEquals(ext, act);

    }

    @Test
    void getDocBetweenDateTest() {
//        LocalDate ld = now.toLocalDate(); // оставляем только дату
//        Document[] actual = archive.getDocBetweenDate(ld.minusDays(6), ld.minusDays(1));
//        Arrays.sort(actual);
//        Document[] expected = {doc[0],doc[1],doc[2]};
//        assertArrayEquals(expected,actual);

    }

    @Test
    void size() {

        assertEquals(6, archive.size());
        printArr(doc);
    }

    private void printArr (Document[] o) {
        for (int i = 0; i <o.length ; i++) {
            System.out.println(o[i]);

        }
    }




}