package practice03_11.album.dao;

import practice03_11.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {

    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate()); // date field
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId()); // photoId field
    };

//fields
    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity){
        photos = new Photo[capacity];
    }


    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {

            return false;
        }
        // ищем индекс куда вставить

        int index = Arrays.binarySearch(photos, 0, size, photo, comparator); // где идем, индексы от куда до куда, что ищем (фото)


        // обработка индекса

        index = index >= 0 ? index : -index -1;
        // раздвигаем массив с места (Index) на одно место вправо
        System.arraycopy(photos, index, photos, index+1, size - index);

        photos[index] = photo;
        size++;


        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        // ищем фото потом надвинем массив на найденную позицию

        for (int i = 0; i < size; i++) {
            if(photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId){
                System.arraycopy(photos, i+1, photos, i, size-1-i);
                size--;
                photos[size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId); // нашли фото в альбоме
        if(photo == null){
            return false;
        }
        photo.setUrl(url); // обновили url
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null); // объект с которым сравниваем
        for (int i = 0; i < size; i++) {
            if(pattern.equals(photos[i])){
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findByPredicate(p ->albumId == p.getAlbumId());
    }

    private Photo[] findByPredicate(Predicate<Photo> predicate){
        Photo[] res = new Photo[size];
        int j = 0; // счетчик найденых фото
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])){
                res[j] = photos[i];
                j++;
            }

        }
        // заполнили массив но в нем после индекса j идут null

        return Arrays.copyOf(res, j); // вернули обрезанный массив без null
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }
}
