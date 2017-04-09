package hibernate.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by Administrator on 06/04/17.
 */
public class ConverterOBJ {



  String ConverterOBJ(Object object) throws JsonProcessingException {
       ObjectMapper mapper=new ObjectMapper();
       String jsonObject = null;

           jsonObject = mapper.writeValueAsString(object);

       return jsonObject;
   }
    public  String objectToJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        String jsonObject = mapper.writeValueAsString(obj);
        return jsonObject;
    }

    public Object jsonToObject(String json) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        Object obj =  mapper.readValue(json, User.class);
        return obj;
    }
}
