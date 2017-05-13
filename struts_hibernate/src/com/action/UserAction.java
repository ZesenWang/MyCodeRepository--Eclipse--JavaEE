package com.action;

import java.util.List;

import com.dao.UserDao;
import com.opensymphony.xwork2.ActionContext;
import com.po.Usr;

public class UserAction {
	private String userName;
	private String pwd;
	private String pwd1;
	private String sex;
	private String[] interest;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String[] getInterest() {
		return interest;
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}


	public String execute(){
		return "loginSuccess";
	}
	
	public String reg(){
		//��֤����
		if(this.userName==null || this.userName.equals("") 
				|| this.pwd==null || this.pwd.equals("") 
				|| this.pwd1==null || this.pwd1.equals("")
				|| this.sex==null || this.sex.equals("")){
			ActionContext.getContext().put("mess", "����Ϊ��");
			return "regError";
		}
		if(!this.pwd.equals(this.pwd1)){
			ActionContext.getContext().put("mess", "���벻һ�£�");
			return "regError";
		}

		String hql="from Usr where userName='"+this.userName+"'";
		UserDao userDao=new UserDao();
		List<Usr> list=userDao.getData(hql);
		
		if(list.size()>0){
			ActionContext.getContext().put("mess", "�û����Ѿ����ڣ�");
			return "regError";
		}
		
		//String[]->String
		String strInterest="";
		for(int i=0;i<this.interest.length;i++){
			strInterest=strInterest+",";
		}
		if(strInterest.length()>0){
			strInterest=strInterest.substring(0,strInterest.length()-1);
		}
		Usr usr=new Usr();
		usr.setUserName(this.userName);
		usr.setPassword(this.pwd);
		usr.setSex(this.sex);
		usr.setInterest(strInterest);
		
		if(!userDao.addUser(usr)){
			ActionContext.getContext().put("mess", "ע��ʧ�ܣ�����ϵ����Ա");
			return "regError";
		}
		return "regSuccess";
	}
}
