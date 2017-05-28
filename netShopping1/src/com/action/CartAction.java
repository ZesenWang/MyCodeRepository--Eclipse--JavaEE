package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.po.Cart;
import com.service.CartService;

public class CartAction {
	private CartService cartService;

	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	
	public String showCartByUserName(){
		//从Session中获得用户名，若用户名为null,跳转到登录页面，否则显示该用户的购物车信息
		String userName=(String)ActionContext.getContext().getSession().get("userName");
		if(userName==null){
			return "login";
		}
		List<Cart> list=this.cartService.getCartByUserName(userName);
		ActionContext.getContext().put("cart", list);
		return "showCartSuccess";
	}
}
