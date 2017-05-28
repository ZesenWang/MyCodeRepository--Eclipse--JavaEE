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
		//��Session�л���û��������û���Ϊnull,��ת����¼ҳ�棬������ʾ���û��Ĺ��ﳵ��Ϣ
		String userName=(String)ActionContext.getContext().getSession().get("userName");
		if(userName==null){
			return "login";
		}
		List<Cart> list=this.cartService.getCartByUserName(userName);
		ActionContext.getContext().put("cart", list);
		return "showCartSuccess";
	}
}
