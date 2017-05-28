package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.dao.UserDao;
import com.po.Doctor;
import com.po.Mhs;
import com.po.Patient;

public class UserDaoImpl implements UserDao{
	
	private SessionFactory sessionFactory;//����ע��sessionFactory����
	private ApplicationContext ctx;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public ApplicationContext getCtx() {
		return ctx;
	}

	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}

	
	@Override
	public List<Doctor> getData(String hql) {
		// TODO Auto-generated method stub
		
		List<Doctor> list = new ArrayList<Doctor>();

		try {
			
			//ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			//sessionFactory=ctx.getBean("sessionFactory", SessionFactory.class);
			Session session=sessionFactory.openSession();
			list = session.createQuery(hql).list();
			session.clear();
			session.close();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
		
	
	}
	
	public List<Patient> getData1(String hql) {
		// TODO Auto-generated method stub
		
		List<Patient> list = new ArrayList<Patient>();

		try {
			
			//ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			//sessionFactory=ctx.getBean("sessionFactory", SessionFactory.class);
			Session session=sessionFactory.openSession();
			list = session.createQuery(hql).list();
			session.clear();
			session.close();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
		
	
	}

	public List<Mhs> getData2(String hql) {
		// TODO Auto-generated method stub
		
		List<Mhs> list = new ArrayList<Mhs>();

		try {
			
			//ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			//sessionFactory=ctx.getBean("sessionFactory", SessionFactory.class);
			Session session=sessionFactory.openSession();
			list = session.createQuery(hql).list();
			session.clear();
			session.close();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
		
	
	}
	@Override
	public boolean addUser(Mhs user) {
		// TODO Auto-generated method stub
		boolean isSuccess = false;

		try {
			//ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			//sessionFactory=ctx.getBean("sessionFactory", SessionFactory.class);
			Session session=sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(user);
			// 事务的提�?
			transaction.commit();
			isSuccess = true;
			// 清空关闭会话
			// 先晴�?后关�?
			session.clear();
			session.close();

		} catch (Exception e) {
			System.err.print(e);
		}

		return isSuccess;

	}

	

	@Override
	public boolean updateUser(Mhs user) {
		// TODO Auto-generated method stub
		boolean isSuccess = false;

		try {
			// 加载配置文件
			//ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			//sessionFactory=ctx.getBean("sessionFactory", SessionFactory.class);
			Session session=sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(user);
			
			// 事务的提�?
			transaction.commit();
			isSuccess = true;
			// 清空关闭会话
			// 先晴�?后关�?
			session.clear();
			session.close();

		} catch (Exception e) {
			System.err.print(e);
		}

		return isSuccess;
	}

	
}
