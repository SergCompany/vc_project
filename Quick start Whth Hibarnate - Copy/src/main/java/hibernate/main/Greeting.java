package hibernate.main;

/**
 * Created by Administrator on 14/02/17.
 */
public class Greeting {
    private  Long id;
    private  String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }
    public Greeting() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id=id;
    }
    public void setContent(String content) {
        this.content=content;
    }
    public String getcontent() {
        return content;
    }
}
