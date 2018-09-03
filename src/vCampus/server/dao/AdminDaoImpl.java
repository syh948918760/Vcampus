package vCampus.server.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import vCampus.vo.Admin;
import vCampus.vo.Student;

import java.sql.PreparedStatement;
import vCampus.server.exception.RecordNotFoundException;
import vCampus.server.exception.WrongPasswordException;

public class AdminDaoImpl implements AdminDao{
	
	private DBConnection DBC=new DBConnection();
	private PreparedStatement stmt=null;
	private ResultSet rs=null;
	
	/**提取数据库中某管理员的信息
	 * @param adminID
	 * 
	 * @return admin
	 */
	public Admin selectAdmin(String adminID){
		Admin admin=new Admin();
		String sql="SELECT * FROM tbl_admin WHERE adminID=?";
		try {
			stmt=DBC.con.prepareStatement(sql);
			stmt.setString(1,adminID);
			rs = stmt.executeQuery();
			if(rs.next()){
				admin.setAdminID(rs.getString("adminID"));
				admin.setPassword(rs.getString("password"));
			}
			else
				admin=null;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return admin;
	} 	
	
	/**在数据库中添加某管理员的信息
	 * @param adminID
	 * @param password
	 * @return NONE
	 */
	public boolean insertAdmin(String adminID,String password){
		Admin admin=selectAdmin(adminID);
		if(admin!=null)return false;
		
		try {
			String sql="INSERT INTO tbl_admin (adminID,password) VALUES (?,?)";
			stmt=DBC.con.prepareStatement(sql);
			stmt.setString(1,adminID);
			stmt.setString(2,password);
			stmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}	 	
	
	/**修改数据库中某管理员密码
	 * @param adminID
	 * @param password
	 * 
	 * @return NONE
	 */
	public boolean updatePassword(String adminID,String password){
		try{
			String sql="UPDATE tbl_admin SET password=? WHERE adminID=?";
			stmt=DBC.con.prepareStatement(sql);
			stmt.setString(1, password);
			stmt.setString(2, adminID);
			stmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
}
