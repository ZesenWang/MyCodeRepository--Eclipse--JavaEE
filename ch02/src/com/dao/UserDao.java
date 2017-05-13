package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.po.Usr;


public class UserDao {

	public List<Usr> getData(String strSQL){
		List<Usr> list=new ArrayList<Usr>();
	
		try {
			//����hibernate.cfg.xml
			SessionFactory sf= new Configuration().configure().buildSessionFactory();
			Session session1=sf.openSession();//�����Ự
			list=session1.createQuery(strSQL).list();
			session1.clear();
			session1.close();					
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean regUser(Usr usr){
		boolean isSuccess=false;
		try{
			//����hibernate.cfg.xml
			@SuppressWarnings("deprecation")
			SessionFactory sf= new Configuration().configure().buildSessionFactory();
			Session session1=sf.openSession();//�����Ự
			Transaction transaction=session1.beginTransaction();
			session1.save(usr);
			transaction.commit();
			isSuccess=true;
			session1.clear();
			session1.close();			
		}catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return isSuccess;		
	}
	public boolean dltUser(Usr usr){
		boolean isSuccess = false;
		try{
			@SuppressWarnings("deprecation")
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session1 = sf.openSession();
			Transaction t = session1.beginTransaction();
			session1.delete(usr);
			t.commit();
			isSuccess = true;
			session1.clear();
			session1.close();
		}catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return isSuccess;
	}
}
