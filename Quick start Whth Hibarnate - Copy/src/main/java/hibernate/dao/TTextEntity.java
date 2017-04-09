package hibernate.dao;

import javax.persistence.*;

/**
 * Created by Administrator on 05/04/17.
 */
@Entity
@Table(name = "t_text", schema = "wa1", catalog = "")
public class TTextEntity {
    private int id;
    private String test;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "test", nullable = true, length = 255)
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTextEntity that = (TTextEntity) o;

        if (id != that.id) return false;
        if (test != null ? !test.equals(that.test) : that.test != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (test != null ? test.hashCode() : 0);
        return result;
    }
}
