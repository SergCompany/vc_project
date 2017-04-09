package spring.hello;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Administrator on 14/02/17.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


     @RequestMapping("/api/s/user/login")
   public String PrintKhcho(@RequestParam(value="login", defaultValue="Guest") String login,@RequestParam(value="pass", defaultValue="pass") String pass)
    {
        String userstatus=login+" "+ pass;
        if(login.equals("Serg") && pass.equals("262378"))
        {
            userstatus="Your user "+login+" & pass "+pass+" is VALID";
        }
        else userstatus="Your user "+login+" & pass "+pass+" is NOT VALID";
        return userstatus;
    }

    @RequestMapping(value= "/api/user/login.json", method = RequestMethod.POST)
    @ResponseBody
    public int PrintKhcho(@RequestBody Greeting[] test) {
        String userstatus;
     /*   if(test[1].getId()==23 && test[1].getcontent().equals("98765"))
        {
            userstatus="Your userID "+test[1].getId()+" & pass "+test[1].getcontent()+" is VALID";
        }
        else userstatus="Your userID "+test[1].getId()+" & pass "+test[1].getcontent()+" is NOT VALID";*/
      //  return test;
        userstatus=test[0].getUsername();
        int id=1;
        return id;
    }
}