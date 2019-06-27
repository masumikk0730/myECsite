package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;


public class UserListDeleteCompleteDAO {

	DBConnector db=new DBConnector();
	Connection con=db.getConnection();

	public int deleteUserList() throws SQLException{

		String sql="DELETE FROM login_user_transaction where user_flg=0";

		PreparedStatement ps;
		int result=0;

		try{
			ps=con.prepareStatement(sql);
			result=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

}
