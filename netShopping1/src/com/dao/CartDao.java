package com.dao;

import java.util.List;

import com.po.Cart;

public interface CartDao {
	List<Cart> getData(String hql);
	boolean addCart(Cart cart);
	boolean delCart(Cart cart);
	boolean updateCart(Cart cart);
}
