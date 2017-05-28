package com.service;

import java.util.List;

import com.po.Doctor;
import com.po.Mhs;
import com.po.Patient;


public interface UserService {
	public String loginService(Doctor user); 	//��¼
	public List<Patient> queryService();   //����ҳ��
	public List<Mhs> queryByIdService(Mhs user);
	public List<Mhs> queryByNoService(Mhs user);
	public String addService(Mhs user);
	public String updateService(Mhs user);
	public String feichuService(Mhs user);

}
