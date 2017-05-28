package com.service.impl;

import java.util.List;

import com.dao.CartDao;
import com.po.Cart;
import com.service.CartService;

public class CartServiceImpl implements CartService {
	private CartDao cartDao;

	public CartDao getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}

	@Override
	public List<Cart> getCartByUserName(String userName) {
		// TODO Auto-generated method stub
		String hql="select new Cart(c.id,p.id,p.name,p.price,c.count,p.price*c.count) from Cart c, Product p where c.productid=p.id and c.userName='"+userName+"'";
		List<Cart> list=this.cartDao.getData(hql);
		return list;
	}

	@Override
	public boolean addItemToCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateItemOnCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteItemFromCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

}
