package hibernate.dao;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Administrator on 11/01/17.
 */
@Entity
@Table(name = "t_user", schema = "wa1", catalog = "")
public class TUserEntity {
    private int userId;
    private String username;
    private String password;
    private String fName;
    private String pName;
    private String email;
    private String lName;
    private Collection<TPhotoEntity> tPhotosByUserId;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "f_name", nullable = true, length = 255)
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Basic
    @Column(name = "p_name", nullable = true, length = 255)
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "l_name", nullable = true, length = 255)
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserEntity that = (TUserEntity) o;

        if (userId != that.userId) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (fName != null ? !fName.equals(that.fName) : that.fName != null) return false;
        if (pName != null ? !pName.equals(that.pName) : that.pName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return lName != null ? lName.equals(that.lName) : that.lName == null;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + (pName != null ? pName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tUserByUserId")
    public Collection<TPhotoEntity> gettPhotosByUserId() {
        return tPhotosByUserId;
    }

    public void settPhotosByUserId(Collection<TPhotoEntity> tPhotosByUserId) {
        this.tPhotosByUserId = tPhotosByUserId;
    }
}
