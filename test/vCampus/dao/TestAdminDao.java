package vCampus.dao;

import java.sql.SQLException;
import vCampus.server.dao.AdminDao;
import vCampus.server.dao.AdminDaoImpl;
import vCampus.vo.*;

/**
 * @author YangHangyuan
 *
 */
public class TestAdminDao {
	
	private static void selectAdmin(String adminID)throws Exception {
		AdminDao adminImpl=new AdminDaoImpl();
		Admin admin=adminImpl.selectAdmin(adminID);
		System.out.println(admin.getAdminID()+"  "+admin.getPassword());
	}

	private static boolean insertAdmin(String adminID,String password)throws Exception {
		AdminDao adminImpl=new AdminDaoImpl();
		return adminImpl.insertAdmin(adminID,password);
		
	}
	
	private static boolean updatePassword(String adminID,String password)throws Exception {
		AdminDao adminImpl=new AdminDaoImpl();
		return adminImpl.updatePassword(adminID,password);
	}
	
	public static void main(String args[]) {
		try {
			selectAdmin("1");
			if(insertAdmin("3","QWQ")) {
				selectAdmin("3");
			}else System.out.println("Error!");
			if(updatePassword("2","QAQ")) {
				selectAdmin("2");
			}else System.out.println("Error!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
