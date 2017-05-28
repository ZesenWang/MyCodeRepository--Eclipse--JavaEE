package com.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.po.Doctor;
import com.po.Mhs;
import com.po.Patient;
import com.service.UserService;

public class UserAction {
	//�����û��ύ������
	private String doctorid;
	private String password;
	private String patientid;
	private String no;
	private String mh;
	private String datetime;
	private String statment;
	
	public String getStatment() {
		return statment;
	}

	public void setStatment(String statment) {
		this.statment = statment;
	}

	public String getMh() {
		return mh;
	}

	public void setMh(String mh) {
		this.mh = mh;
	}

	
	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getPatientid() {
		return patientid;
	}

	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	//����ע��Ķ���
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	

	

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
		System.out.print(doctorid);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//ʵ�ֵ�¼����
	public String login(){
		
		//��֤����:1)��
		if(this.doctorid.equals("")||this.password.equals("")){
			
			return "error";
		}
		
		//����User���󣬵���service���loginService�������ҵ����
		Doctor user=new Doctor();
		user.setDoctorid(Integer.parseInt(doctorid));
		user.setPassword(this.password);
		
		String strMess=this.userService.loginService(user);
		if(strMess.equals("success")){
			//���û�������session
			ActionContext.getContext().getSession().put("doctorid", this.doctorid);
			return "success";
		}
		return "error";
	}
	
	public String query(){
		List<Patient> list=this.userService.queryService();
		ActionContext.getContext().put("patientInfo", list);
		return "success";
	}
	
	public String queryById(){
		
		Mhs mhs=new Mhs();
		mhs.setPatientid(Integer.parseInt(patientid));
		List<Mhs> list=this.userService.queryByIdService(mhs);
		ActionContext.getContext().put("mhsInfo", list);
		return "success";
	}
	
	public String queryByNo(){
	
		Mhs mhs=new Mhs();
		mhs.setNo(Integer.parseInt(no));
		List<Mhs> list=this.userService.queryByNoService(mhs);
		ActionContext.getContext().put("mhsInfo", list);
		return "success";
	}
	
	public String add(){
		
		Mhs mhs=new Mhs();
		mhs.setDoctorid(Integer.parseInt(doctorid));
		mhs.setPatientid(Integer.parseInt(patientid));
		mhs.setMh(this.mh);
		Date date =new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		datetime=format.format(date);
		mhs.setDatetime(datetime);
		mhs.setStatment("����");
		String strMess=this.userService.addService(mhs);
	
		return strMess;
	}
	
public String update(){
		
	Mhs mhs=new Mhs();
	mhs.setNo(Integer.parseInt(this.no));
	List<Mhs> list=this.userService.queryByNoService(mhs);
	String str=list.get(0).getMh()+";"+this.mh;
	list.get(0).setMh(str);
	list.get(0).setStatment("�޸�");
	String stress=this.userService.updateService(list.get(0));
	
		return stress;
	}
	
	public String feichu(){
	
		Mhs mhs=new Mhs();
		mhs.setNo(Integer.parseInt(this.no));
		List<Mhs> list=this.userService.queryByNoService(mhs);
		
		list.get(0).setStatment("�ϳ�");
		String stress=this.userService.updateService(list.get(0));
	
		return stress;
	}
	
}
