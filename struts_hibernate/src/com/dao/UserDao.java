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

	// 查询用户
	public List<Usr> getData(String strSQL) {
		List<Usr> list = new ArrayList<Usr>();

		try {
			// 加载hibernate.cfg.xml
			SessionFactory sf = new Configuration().configure()
					.buildSessionFactory();
			Session session1 = sf.openSession();// 创建会话
			list = session1.createQuery(strSQL).list();
			session1.clear();
			session1.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 删除用户
	public boolean delUser(Usr usr) {
		boolean isSuccess = false;

		try {
			// 加载配置文件
			SessionFactory sfc = new Configuration().configure()
					.buildSessionFactory();
			// 创建会话
			Session session = sfc.openSession();
			// 执行删除数据 /session.beginTransaction();启动�?��事务
			// 若修改数据则�?��是用事务
			Transaction transaction = session.beginTransaction();
			session.delete(usr);
			
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

	// 添加用户
	public boolean addUser(Usr usr) {
		boolean isSuccess = false;

		try {
			// 加载配置文件
			SessionFactory sfc = new Configuration().configure()
					.buildSessionFactory();
			// 创建会话
			Session session = sfc.openSession();
			// 执行添加数据 启动�?��事务
			// 若修改数据则�?��是用事务
			Transaction transaction = session.beginTransaction();
			session.save(usr);
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

	// 修改更新用户
	public boolean updateUser(Usr usr) {
		boolean isSuccess = false;

		try {
			// 加载配置文件
			SessionFactory sfc = new Configuration().configure()
					.buildSessionFactory();
			// 创建会话
			Session session = sfc.openSession();
			// 执行添加数据 启动�?��事务
			// 若修改数据则�?��是用事务
			Transaction transaction = session.beginTransaction();
			session.update(usr);
			
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
