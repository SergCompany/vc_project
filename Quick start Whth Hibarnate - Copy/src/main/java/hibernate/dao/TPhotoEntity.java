package hibernate.dao;

import javax.persistence.*;

/**
 * Created by Administrator on 11/01/17.
 */
@Entity
@Table(name = "t_photo", schema = "wa1", catalog = "")
@IdClass(TPhotoEntityPK.class)
public class TPhotoEntity {
    private int photoId;
    private int userId;
    private String photolink;
    private TUserEntity tUserByUserId;

    @Id
    @Column(name = "photo_id", nullable = false)
    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "photolink", nullable = true, length = 255)
    public String getPhotolink() {
        return photolink;
    }

    public void setPhotolink(String photolink) {
        this.photolink = photolink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPhotoEntity that = (TPhotoEntity) o;

        if (photoId != that.photoId) return false;
        if (userId != that.userId) return false;
        return photolink != null ? photolink.equals(that.photolink) : that.photolink == null;
    }

    @Override
    public int hashCode() {
        int result = photoId;
        result = 31 * result + userId;
        result = 31 * result + (photolink != null ? photolink.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false,insertable = false, updatable = false)
    public TUserEntity gettUserByUserId() {
        return tUserByUserId;
    }

    public void settUserByUserId(TUserEntity tUserByUserId) {
        this.tUserByUserId = tUserByUserId;
    }
}
