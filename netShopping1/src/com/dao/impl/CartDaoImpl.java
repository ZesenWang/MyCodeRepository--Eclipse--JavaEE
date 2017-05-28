package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.CartDao;
import com.po.Cart;

public class CartDaoImpl implements CartDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Cart> getData(String hql) {
		// TODO Auto-generated method stub
		List<Cart> list=new ArrayList<Cart>();
		try{
			//从SessionFactory中获取Session对象
			Session session=this.sessionFactory.openSession();
			//执行
			list=session.createQuery(hql).list();
			//清缓存，关闭
			session.clear();
			session.close();
		}catch(Exception e){
			System.err.print(e);
		}
		return list;
	}

	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		boolean isSuccess=false;
		
		return isSuccess;
	}

	@Override
	public boolean delCart(Cart cart) {
		// TODO Auto-generated method stub
		boolean isSuccess=false;
		
		return isSuccess;
	}

	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		boolean isSuccess=false;
		
		return isSuccess;
	}

}
