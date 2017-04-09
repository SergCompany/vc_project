package hibernate.main;

import hibernate.dao.TPhotoEntity;
import hibernate.dao.TSergEntity;
import hibernate.dao.TUserEntity;
import hibernate.utils.HibernateSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 18/01/17.
 */
public class MyDbConnection {
    ArrayList arPhoto;
  public boolean Setter(ArrayList arrayList)
    {
        try {
            int index=arrayList.size();
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            for(int i=0 ; i<index ; i++)
            {
                session.save(arrayList.get(i));
            }
            session.getTransaction().commit();
            session.close();
            System.out.println("Set has been done");
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    public Object Getter(int nSergid)
    {
        try {
               Session session = HibernateSessionFactory.getSessionFactory().openSession();
        TSergEntity user = session.get(TSergEntity.class,nSergid);
        session.close();
            return user;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Update(ArrayList arrayList)
    {
        try {
            int index=arrayList.size();
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            for(int i=0 ; i<index ; i++)
            {
                session.update(arrayList.get(i));
            }
            session.getTransaction().commit();
            session.close();
            System.out.println("Delete has been done");
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean Delete(ArrayList arrayList)
    {
        try {
            int index=arrayList.size();
            Session session = HibernateSessionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            for(int i=0 ; i<index ; i++)
            {
                session.delete(arrayList.get(i));
            }
            session.getTransaction().commit();
            session.close();
            System.out.println("Delete has been done");
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    public List GetIdByUser(String sUser)
    {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(TUserEntity.class)
                .add(Restrictions.gt("userId", 0))
                .add(Restrictions.le("userId", 10));

        List<TUserEntity> rows = criteria.list();
        for(int i=0;i<rows.size();i++) {
            TUserEntity t = rows.get(i);
            int n = t.getUserId();
            System.out.println(String.valueOf(n));
        }

        session.close();

        return  rows;
    }
    public ArrayList PhotoByUserId(int id)
    {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        List<TPhotoEntity> users = session.createCriteria(TPhotoEntity.class)
                .setMaxResults(4)
                .list();
        session.getTransaction().commit();
        TPhotoEntity user=users.get(0);
        arPhoto.add(user);
        System.out.println(user.getPhotoId());
        return arPhoto;
    }
}
