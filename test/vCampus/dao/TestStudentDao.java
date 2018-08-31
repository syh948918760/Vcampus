/**
 * 
 */
package vCampus.dao;

import java.sql.Connection;
import java.sql.SQLException;

import vCampus.server.dao.*;
import vCampus.vo.*;

/**
 * @author YangHangyuan, SongZixing
 *
 * @version 0.1
 * 
 */
public class TestStudentDao {
	
	private static void findByName(String userName)throws Exception {
		StudentDao stdImpl=new StudentDaoImpl();
		Student std=stdImpl.findByName(userName);
		System.out.println(std.getUserName()+" "+std.getPassword());
	}
	
	private static boolean insertByUserNameAndPassword(String userName,String password)throws Exception {
		StudentDao stdImpl=new StudentDaoImpl();
		return stdImpl.insertByUserNameAndPassword(userName,password);
	}
	
	private static boolean updatePassword(String userName,String password)throws Exception {
		StudentDao stdImpl=new StudentDaoImpl();
		return stdImpl.updatePassword(userName, password);
	}
	
	private static boolean updateSelfInformation(Student std)throws Exception {
		StudentDao stdImpl=new StudentDaoImpl();
		return stdImpl.updateSelfInformation(std);
	}
	
	public static void main(String[] args) {
		try {
			findByName("213160821");
			if(insertByUserNameAndPassword("213161268","gg")) {
				findByName("213161268");
			}else System.out.println("Error!");
			if(updatePassword("213161268","gga")) {
				findByName("213161268");
			}else System.out.println("Error!");
			//if(insertByUserNameAndPassword("213161268","gg")) {
			//	findByName("213161268");
			//}else System.out.println("Error!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
