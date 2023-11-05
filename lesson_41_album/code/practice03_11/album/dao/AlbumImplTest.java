package practice03_11.album.dao;

import home_work_archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice03_11.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    LocalDateTime now = LocalDateTime.now(); // текущее время

   Photo[] ph;
    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        ph = new Photo[6];
        ph[0] = new Photo(1, 1, "t1", "www.t1", now.minusDays(2));
        ph[1] = new Photo(1, 2, "t2", "www.t1", now.minusDays(3));
        ph[2] = new Photo(1, 3, "t3", "www.t1", now.minusDays(5));
        ph[3] = new Photo(2, 1, "t1", "www.t1", now.minusDays(7));
        ph[4] = new Photo(2, 2, "t2", "www.t1", now.minusDays(7));
        ph[5] = new Photo(2, 3, "t3", "www.t1", now.minusDays(7));

        for (int i = 0; i < ph.length; i++) {
            album.addPhoto(ph[i]);
        }

    }
    // не забыть положить ph  в альбом методом addPhoto

    @Test
    void addPhoto() {
        // нельзя добавить null,  нельзя добавить имеющийся

        assertFalse(album.addPhoto(null));
        assertFalse(album.addPhoto(ph[1]));

        // проверить возможность добавления
        Photo photo = new Photo(3, 1, "t", "URL", now);
        assertTrue(album.addPhoto(photo));



        // проверить ожидаемое кол-во после добавления
        assertEquals(7, album.size());

        album.addPhoto(photo);
        printArr(ph);

        //нельзя привысить capacity,
        photo = new Photo(3, 1, "t", "URL", now);
        assertFalse(album.addPhoto(photo));
    }

    @Test
    void removePhotoTest() {
        // удаление

        assertTrue(album.removePhoto(3,1)); // удалили ph[2]

        // удаление отсутствующего фото

        assertFalse(album.removePhoto(5, 1)); // удаление фото которого нет в альбоме

        //проверка количества элементов фото

        assertEquals(5, album.size()); // сравниваем фозможное с поличаемым результатом

        //не найдем удаленное
        assertNull(album.getPhotoFromAlbum(3,1));



    }

    @Test
    void updatePhoto() {

        assertTrue(album.updatePhoto(1, 1, "new URL"));
        assertEquals("new URL", album.getPhotoFromAlbum(1,1).getUrl()); // обновили, проверили
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(ph[0], album.getPhotoFromAlbum(1, 1)); // проверяем нахожждение фото по ID
        assertNull(album.getPhotoFromAlbum(1, 3)); // ищем не существующее фото
    }

    @Test
    void getAllPhotoFromAlbum() {
        // метод возвращает массив фото
        Photo[] exp = {ph[3], ph[4], ph[5]};
        Photo[] act = album.getAllPhotoFromAlbum(2); // выбрали 2 альбом для вывода фото из него

        Arrays.sort(act); // сортируем искомый массив

        assertArrayEquals(exp, act);

    }

    @Test
    void getPhotoBetweenDate() {

        LocalDate ld = now.toLocalDate(); // оставляем только дату

        Photo[] actual = album.getPhotoBetweenDate(ld.minusDays(1), ld.minusDays(6));

        Arrays.sort(actual);
        Photo[] expected = {ph[0], ph[1], ph[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sizeTest() {

        assertEquals(6, album.size());
    }

    private void printArr (Photo[] o) {
        for (int i = 0; i <o.length ; i++) {
            System.out.println(o[i]);

        }
    }

}