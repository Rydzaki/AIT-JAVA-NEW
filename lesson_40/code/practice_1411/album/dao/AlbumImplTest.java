package practice_1411.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_1411.album.model.Photo;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;
    LocalDateTime now = LocalDateTime.now(); // текущее время

   Photo[] ph;
    @BeforeEach
    void setUp() {
        album = new AlbumImpl(7);
        ph = new Photo[6];
        ph[0] = new Photo(1, 1, "t1", "www.t1", now.minusDays(7));
        ph[1] = new Photo(1, 2, "t2", "www.t1", now.minusDays(7));
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

        //нельзя привысить capacity,
        photo = new Photo(3, 1, "t", "URL", now);
        assertFalse(album.addPhoto(photo));
    }

    @Test
    void removePhoto() {
    }

    @Test
    void updatePhoto() {
    }

    @Test
    void getPhotoFromAlbum() {
    }

    @Test
    void getAllPhotoFromAlbum() {
    }

    @Test
    void getPhotoBetweenDate() {
    }

    @Test
    void sizeTest() {

        assertEquals(6, album.size());
    }
}