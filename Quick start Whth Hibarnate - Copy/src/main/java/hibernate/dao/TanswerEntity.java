package hibernate.dao;

/**
 * Created by Administrator on 09/04/17.
 */
public class TanswerEntity {
    private int id;
    private String text;

    public TanswerEntity(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public TanswerEntity(String text) {
        this.text = text;
    }

    public TanswerEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TanswerEntity that = (TanswerEntity) o;

        if (id != that.id) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}
