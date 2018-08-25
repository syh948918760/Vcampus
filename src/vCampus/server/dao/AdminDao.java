package vCampus.server.dao;

import java.sql.ResultSet;


import java.sql.SQLException;

import vCampus.vo.Admin;

import java.sql.PreparedStatement;

public class AdminDao {	
	
	private DBConnection DBC=new DBConnection();
	private PreparedStatement stmt=null;
	private ResultSet rs=null;
	
	/**提取数据库中某管理员的信息
	 * 
	 * @param adminID
	 * @return admin
	 */
	public Admin selectAdmin(String adminID){
		Admin admin=new Admin();
		String sql="SELECT * FROM vcampus.admin WHERE adminID=?";
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
	 * 
	 * @param 
	 * @return NONE
	 */
	public void insertAdmin(String ID,String password){
		String sql="INSERT INTO vcampus.admin(adminID,password) VALUES (?,?)";
		try {
			stmt=DBC.con.prepareStatement(sql);
			stmt.setString(1,ID);
			stmt.setString(2,password);
			stmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}	 	
	
	/**修改数据库中某管理员密码
	 * 
	 * @param 
	 * @return NONE
	 */
	public void updatePassword(String password,String adminID){
		try{
			String sql="UPDATE vcampus.admin SET password=? WHERE adminID=?";
			stmt=DBC.con.prepareStatement(sql);
			stmt.setString(1, password);
			stmt.setString(2, adminID);
			stmt.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}


