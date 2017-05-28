package com.service.impl;

import java.util.List;

import com.dao.UserDao;
import com.po.Doctor;
import com.po.Mhs;
import com.po.Patient;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public String loginService(Doctor user) {
		// TODO Auto-generated method stub
		
		String hql="from Doctor where doctorid="+user.getDoctorid()+" and password='"+user.getPassword()+"'";
		System.out.print(hql);
		List<Doctor> list=this.userDao.getData(hql);
		if(list.size()>0){
			return "success";
		}else
			return "error";
	}

	public List<Patient> queryService() {
		// TODO Auto-generated method stub
		
		String hql="from Patient";
		
		List<Patient> list=this.userDao.getData1(hql);
		if(list.size()>0){
			return list;
		}else
			return null;
	}
	
	public List<Mhs> queryByNoService(Mhs user) {
		// TODO Auto-generated method stub
		
		String hql="from Mhs where no="+user.getNo();
		
		List<Mhs> list=this.userDao.getData2(hql);
		if(list.size()>0){
			return list;
		}else
			return null;
	}
	
	public List<Mhs> queryByIdService(Mhs user) {
		// TODO Auto-generated method stub
		
		String hql="from Mhs where patientid="+user.getPatientid();
		
		List<Mhs> list=this.userDao.getData2(hql);
		if(list.size()>0){
			return list;
		}else
			return null;
	}
	
	public String addService(Mhs user) {
		// TODO Auto-generated method stub
		
		boolean flag=this.userDao.addUser(user);
		if(flag)
			return "success";
		else
			return "error";
	}
	
	public String updateService(Mhs user) {
		// TODO Auto-generated method stub
		
		boolean flag=this.userDao.updateUser(user);
		if(flag)
			return "success";
		else
			return "error";
	}
	
	public String feichuService(Mhs user) {
		// TODO Auto-generated method stub
		
		boolean flag=this.userDao.updateUser(user);
		if(flag)
			return "success";
		else
			return "error";
	}
	

}
