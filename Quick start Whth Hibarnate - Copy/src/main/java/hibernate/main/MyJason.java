package hibernate.main;

import hibernate.dao.TPhotoEntity;
import hibernate.dao.TSergEntity;
import hibernate.dao.TUserEntity;

import java.util.ArrayList;

/**
 * Created by Administrator on 18/01/17.
 */
public class MyJason {
    public static void main(String[] args) {
      //  Setter(28,"/45/1.jpg","Robert","Robertyan","6666");
        Getter();
       // Setter(18,"/4/5/5","Valodja","Hambarumjab","121212");

    }


    public static void Setter(int nUserId,String sPhotoLink,String sFname,String sLastName,String sPass)
    {
        TPhotoEntity tphoto=new TPhotoEntity();
        TUserEntity tuser=new TUserEntity();
        tuser.setlName(sLastName);
        tuser.setPassword(sPass);
        tuser.setfName(sFname);
        tphoto.setPhotolink(sPhotoLink);
        tphoto.setUserId(nUserId);
        ArrayList<Object> arOb= new ArrayList<Object>();
        arOb.add(tuser);
      //  arOb.add(tphoto);
        MyDbConnection mdbc= new MyDbConnection();
        if(mdbc.Setter(arOb)) System.out.println("Object Created");
        else System.out.println("Object creation FILED");
    }
    public static void Set(TSergEntity tt)
    {
        ArrayList<Object> arOb= new ArrayList<Object>();
        arOb.add(tt);

        MyDbConnection mdbc= new MyDbConnection();
        if(mdbc.Setter(arOb)) System.out.println("Object Created");
        else System.out.println("Object creation FILED");
    }
    private static void Getter()
    {
        MyDbConnection mdbc= new MyDbConnection();
        mdbc.GetIdByUser("e2e");
    }
}
