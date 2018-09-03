package vCampus.server.biz;

import vCampus.vo.Admin;

public interface AdminServiceDao {
	Admin register(String ID,String password);
	Admin login(String ID,String password);
	Admin update(Admin updatedAdmin);

}
