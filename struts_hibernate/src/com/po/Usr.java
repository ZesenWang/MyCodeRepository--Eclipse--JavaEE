package com.po;

public class Usr {

	private Integer id;
	private String userName;
	private String password;
	private String sex;
	private String interest;
	
	public Usr() {
		super();
	}

	public Usr(Integer id,String userName, String password) {
		super();
		this.id=id;
		this.userName = userName;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	
	
}
