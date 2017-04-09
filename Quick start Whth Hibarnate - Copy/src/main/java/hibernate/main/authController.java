package hibernate.main;

/**
 * Created by Khachatur Nazaretyan on 2/15/17.
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import hibernate.dao.TSergEntity;
import hibernate.dao.TanswerEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class authController {

    private final AtomicLong counter = new AtomicLong();

  /*  @RequestMapping("/api/login.json")
    public String Login(@RequestParam(value="name", defaultValue="admin") String name,@RequestParam(value="pwd", defaultValue="tstpass1") String pwd) {
        User user= new User(0,name,pwd);
        return user.getPassword();
    }*/

   /* @RequestMapping(value= "/api/login.json", method = RequestMethod.POST)
    @ResponseBody
    public String PrintKhcho(@RequestBody TSergEntity[] test) {

        MyJason myJason=new MyJason();
     //   myJason.Setter(30,"/45/1.jpg","Robert","Robertyan","6666");
      //  myJason.Set(test[0]);
        MyGetter myGetter=new MyGetter();
        TSergEntity tSergEntity[]=new TSergEntity[test.length];
        tSergEntity[0]=myGetter.GetLogin1(4);
        System.out.println(tSergEntity[0].getSergtext());
        System.out.println(tSergEntity[0].getSergId());
        test[0].setSergId(tSergEntity[0].getSergId());
        test[0].setSergtext(tSergEntity[0].getSergtext());
       // TSergEntity tSerg[]=new TSergEntity[10];
       // GetSerg(4);
      //  test=tSerg;
        return tSergEntity[0].toString();
    }*/
   @RequestMapping(value= "/api/delserginfobyid.json", method = RequestMethod.POST)
   @ResponseBody
   public TSergEntity DelSergInfoById(@RequestBody TSergEntity[] uID) throws JsonProcessingException {

      // MyGetter myGetter=new MyGetter();
     //  TSergEntity tSergEntity=myGetter.GetInfo(tsID[0].getSergId());

       return uID[0];
   }

   @RequestMapping(value= "/api/getserginfobyid.json", method = RequestMethod.POST)
   @ResponseBody
   public Object GetSergInfoById(@RequestBody TSergEntity[] tsID){

       MyGetter myGetter=new MyGetter();
       TSergEntity  tSergEntity=new TSergEntity();
       Object object=myGetter.GetInfo(tsID[0].getSergId());
      // ConverterOBJ converterOBJ=new ConverterOBJ();
    //   String str= converterOBJ.objectToJson(object);

       return object;
   }
   @RequestMapping(value= "/api/login.json", method = RequestMethod.POST)
   @ResponseBody
   public String PrintKhcho(@RequestBody TSergEntity[] test) throws JsonProcessingException {

       MyGetter myGetter=new MyGetter();
       TSergEntity  tSergEntity=new TSergEntity();
        tSergEntity=myGetter.GetLogin1(test[0].getSergId());
      // System.out.println(tSergEntity.getSergtext());
       //System.out.println(tSergEntity.getSergId());
      // test[0].setSergId(tSergEntity[0].getSergId());
     //  test[0].setSergtext(tSergEntity[0].getSergtext());
       //x=test[0];
     //  tSergEntity.setSergId(5);
       //tSergEntity.setSergtext("21212");
       ConverterOBJ converterOBJ=new ConverterOBJ();
      String str= converterOBJ.objectToJson(tSergEntity);

       return str;
   }//Session Ssession=HibernateSessionFactory.getSessionFactory().openSession();TSergEntity Uuser;public int N=0;
    @RequestMapping(value= "/api/updateserg.json", method = RequestMethod.POST)
    @ResponseBody
    public Object UpdateSerg(@RequestBody TSergEntity[] test){

        ArrayList<Object> arOb= new ArrayList<Object>();

        for (int i=0;i<test.length;i++)
        {
            arOb.add(test[i]);
        }

        MyDbConnection mdbc= new MyDbConnection();
        if(mdbc.Update(arOb)) System.out.println("Object Update");
        else System.out.println("Object creation FILED");

        TanswerEntity tanswerEntity=new TanswerEntity("Object Updated");
        return tanswerEntity;

        ///  TanswerEntity tanswerEntity=new TanswerEntity("Object Created");
        //   return user;
    }
    @RequestMapping(value= "/api/delserg.json", method = RequestMethod.POST)
    @ResponseBody
    public Object DelSerg(@RequestBody TSergEntity[] test){

        ArrayList<Object> arOb= new ArrayList<Object>();

        for (int i=0;i<test.length;i++)
        {
            arOb.add(test[i]);
        }
        MyDbConnection mdbc= new MyDbConnection();
        if(mdbc.Delete(arOb)) System.out.println("Object Deleted");
        else System.out.println("Object creation FILED");
        TanswerEntity tanswerEntity=new TanswerEntity("Object Created");
        return tanswerEntity;

      ///  TanswerEntity tanswerEntity=new TanswerEntity("Object Created");
     //   return user;
    }
    @RequestMapping(value= "/api/getserg.json", method = RequestMethod.POST)
    @ResponseBody
    public Object GetSerg(@RequestBody TSergEntity[] test){

        ArrayList<Object> arOb= new ArrayList<Object>();
        arOb.add(test[0]);

        MyDbConnection mdbc= new MyDbConnection();
        Object object =mdbc.Getter(test[0].getSergId());

        TanswerEntity tanswerEntity=new TanswerEntity("Object Created");
        return object;
    }
    @RequestMapping(value= "/api/setserg.json", method = RequestMethod.POST)
    @ResponseBody
    public TanswerEntity SetSerg(@RequestBody TSergEntity[] test){

        ArrayList<Object> arOb= new ArrayList<Object>();
        arOb.add(test[0]);

        MyDbConnection mdbc= new MyDbConnection();
        if(mdbc.Setter(arOb)) System.out.println("Object Created");
        else System.out.println("Object creation FILED");
        TanswerEntity tanswerEntity=new TanswerEntity("Object Created");
        return tanswerEntity;
    }

    /*@RequestMapping("/api/UserInfo")
    public User GetUserObj(@RequestParam(value="name", defaultValue="admin1") String name,@RequestParam(value="pwd", defaultValue="tstpass") String pwd) {
        return new User(counter.incrementAndGet(), name, pwd);
    }*/
    @RequestMapping("/api")
    public String apirootmap() {
        return new String("WELCOME TO API");
    }

}
