package com.action;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.opensymphony.xwork2.ActionContext;
import com.po.User;
import com.service.UserService;

public class UserAction {
	//接收用户提交的数据
	private String useName;
	private String pwd;
	//接收注入的对象
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	//实现登录功能
	public String login(){
		//验证数据:1)空
		
		//创建User对象，调用service层的loginService方法完成业务处理
		User user=new User();
		user.setUsername(this.useName);
		user.setPassword(this.pwd);
		
		String strMess=this.userService.loginService(user);
		if(strMess.equals("success")){
			//将用户名存入session
			ActionContext.getContext().getSession().put("userName", this.useName);
			return "loginSuccess";
		}
		return "loginError";
	}
	
}
