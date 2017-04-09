package hibernate.main;

/**
 * Created by Administrator on 06/04/17.
 */
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {

    private final static String baseFile = "user.json";

    public static void main(String[] args) throws IOException {
        User user=new User();
        user.setId(5);user.setLevel("Level5");user.setName("Art");user.setPhone("262378");
        toJSON(user);
    }
    public static void toJSON(User user) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), user);
        System.out.println("json created!");
    }

    public static User toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(baseFile), User.class);
    }

}