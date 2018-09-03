package vCampus.server.biz;

import vCampus.server.dao.AdminDao;
import vCampus.server.dao.AdminDaoImpl;
import vCampus.vo.Admin;

public class AdminServiceDaoImpl implements AdminServiceDao{

	private AdminDao ad = new AdminDaoImpl();
	
	@Override
	public Admin register(String ID, String password) {
		// TODO Auto-generated method stub
		if(ad.insertAdmin(ID, password)) {
			return ad.selectAdmin(ID);
		}
		return null;
	}
	
	@Override
	public Admin login(String ID, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Admin update(Admin updatedAdmin) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
