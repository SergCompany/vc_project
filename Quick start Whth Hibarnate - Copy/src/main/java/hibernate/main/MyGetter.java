package hibernate.main;

import hibernate.dao.TSergEntity;
import hibernate.dao.TUserEntity;
import hibernate.utils.HibernateSessionFactory;
import org.hibernate.Session;

/**
 * Created by Administrator on 09/01/17.
 */

public class MyGetter {
    public TUserEntity GetLogin(int nUserid) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        TUserEntity user = session.load(TUserEntity.class, nUserid);
        user = session.get(TUserEntity.class, nUserid);
        String str=user.getPassword();
        session.close();
        System.out.println(user.getPassword());
        return user;
    }
    public TUserEntity GetPhotoByuserId(int nid) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        TUserEntity user = session.get(TUserEntity.class,nid);
        session.close();
        return user;
    }
    public Object GetInfo(int nid) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        TSergEntity user = session.get(TSergEntity.class,nid);
        session.close();
        return user;
    }
    public TSergEntity GetLogin1(int nSergid) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
       // TSergEntity user = session.load(TSergEntity.class, nSergid);
       // Serializable serializable = new Serializable();

        TSergEntity user = session.get(TSergEntity.class,nSergid);
        System.out.println(user.getSergtext());
        System.out.println(String.valueOf(user.getSergId()));
        session.close();
     //   System.out.println(user.getSergtext());
        return user;
    }
   public TSergEntity GetSerg(int nUserid) {
       Session session = HibernateSessionFactory.getSessionFactory().openSession();
       TSergEntity user = session.load(TSergEntity.class, nUserid);//get
       String str=user.getSergtext();
       System.out.println(user.getSergtext());
       session.close();
      // System.out.println(String.valueOf(nUserid));
       return user;
   }
    public String GetLogin(String nUserid) {
       /* SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria userCriteria = session.createCriteria(LoginEntity.class);
        userCriteria.add(Restrictions.eq("login", login));
        LoginEntity user = (LoginEntity) userCriteria.uniqueResult();
        session.close();*/


        return "";
    }

}