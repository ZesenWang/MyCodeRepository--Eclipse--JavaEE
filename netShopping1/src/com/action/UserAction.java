package com.action;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.opensymphony.xwork2.ActionContext;
import com.po.User;
import com.service.UserService;

public class UserAction {
	//�����û��ύ������
	private String useName;
	private String pwd;
	//����ע��Ķ���
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

	//ʵ�ֵ�¼����
	public String login(){
		//��֤����:1)��
		
		//����User���󣬵���service���loginService�������ҵ����
		User user=new User();
		user.setUsername(this.useName);
		user.setPassword(this.pwd);
		
		String strMess=this.userService.loginService(user);
		if(strMess.equals("success")){
			//���û�������session
			ActionContext.getContext().getSession().put("userName", this.useName);
			return "loginSuccess";
		}
		return "loginError";
	}
	
}
