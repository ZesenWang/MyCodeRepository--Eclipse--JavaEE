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
			//��SessionFactory�л�ȡSession����
			Session session=this.sessionFactory.openSession();
			//ִ��
			list=session.createQuery(hql).list();
			//�建�棬�ر�
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
