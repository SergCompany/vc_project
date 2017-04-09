package hibernate.dao;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 11/01/17.
 */
public class TPhotoEntityPK implements Serializable {
    private int photoId;
    private int userId;

    @Column(name = "photo_id", nullable = false)
    @Id
    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    @Column(name = "user_id", nullable = false)
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPhotoEntityPK that = (TPhotoEntityPK) o;

        if (photoId != that.photoId) return false;
        return userId == that.userId;
    }

    @Override
    public int hashCode() {
        int result = photoId;
        result = 31 * result + userId;
        return result;
    }
}
