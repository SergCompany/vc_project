package spring.hello;

/**
 * Created by Administrator on 14/02/17.
 */
public class Greeting {
    private  Long id;
    private  String content;
    private Long sessionid;
    private Long sesssionkey;
    private String username;
    private String password;
    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }
    public Greeting(Long sessionid,Long sesssionkey, String username,String password) {
        this.sessionid=sessionid;
        this.sesssionkey=sesssionkey;
        this.username=username;
        this.password=password;
    }
    public Greeting() {
    }
    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Long getSessionid() {
        return sessionid;
    }

    public Long getSesssionkey() {
        return sesssionkey;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /* public void setId(String id) {
            this.id=id;
        }
        public void setContent(String content) {
            this.content=content;
        }*/
    public String getcontent() {
        return content;
    }
}
