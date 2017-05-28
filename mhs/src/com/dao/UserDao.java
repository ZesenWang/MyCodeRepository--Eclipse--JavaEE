package com.dao;

import java.util.List;

import com.po.Doctor;
import com.po.Mhs;
import com.po.Patient;

public interface UserDao {
	//²éÑ¯£¬Ìí¼Ó£¬É¾³ý£¬ÐÞ¸Ä
	public List<Doctor> getData(String hql);
	public boolean addUser(Mhs user);
	
	public boolean updateUser(Mhs user);
	public List<Patient> getData1(String hql);
	public List<Mhs> getData2(String hql); 

}
