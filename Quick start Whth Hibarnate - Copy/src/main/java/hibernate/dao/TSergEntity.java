package hibernate.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

/**
 * Created by Administrator on 06/04/17.
 */
@Entity
@Table(name = "t_serg", schema = "wa1", catalog = "")
public class TSergEntity {
    @JsonProperty("sergId")
    private int sergId;
    @JsonProperty("sergtext")
    private String sergtext;

    public TSergEntity()
    {

    }
    public TSergEntity(int sergId,String sergtext)
    {
        this.sergId=sergId;
        this.sergtext=sergtext;
    }

    @Id
    @Column(name = "serg_id", nullable = false)
    public int getSergId() {
        return sergId;
    }

    public void setSergId(int sergId) {
        this.sergId = sergId;
    }

    @Basic
    @Column(name = "sergtext", nullable = true, length = 255)
    public String getSergtext() {
        return sergtext;
    }

    public void setSergtext(String sergtext) {
        this.sergtext = sergtext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSergEntity that = (TSergEntity) o;

        if (sergId != that.sergId) return false;
        if (sergtext != null ? !sergtext.equals(that.sergtext) : that.sergtext != null) return false;

        return true;
    }
    @Override
    public String toString() {
        return "User[sergId:" + sergId + ", sergtext: " + sergtext + "]";
    }
    @Override
    public int hashCode() {
        int result = sergId;
        result = 31 * result + (sergtext != null ? sergtext.hashCode() : 0);
        return result;
    }

}
