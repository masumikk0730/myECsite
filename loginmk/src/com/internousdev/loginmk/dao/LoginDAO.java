package com.internousdev.loginmk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.loginmk.dto.LoginDTO;
import com.internousdev.loginmk.util.DBConnector;

public class LoginDAO {

	public LoginDTO select(String name,String password) throws SQLException{
//		LoginDTO型を呼び出し元に渡すので↑戻り値にしたメソッド

		LoginDTO dto=new LoginDTO();
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select * from user where user_name=? and password=?";
//		sql文の定義、値は？を入れておく

		try{

			PreparedStatement ps=con.prepareStatement(sql);
//			↑DBまで運んでくれる箱のようなもの
			ps.setString(1, name);
//			１つ目の？にactionから送られたnameが入る

			ps.setString(2, password);
//			２つ目の？にactionから送られたpasswordが入る

			ResultSet rs=ps.executeQuery();
//			selectを実行するメソッドで戻り値はresultsetになる

			if(rs.next()){
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
//				select文でDBから取得した情報をstring型に変換してDTOに格納
			}
		}catch (SQLException e){
			e.printStackTrace();
//			↑処理中にSQL関連のエラーが発生した際に実行する処理

		}finally{
			con.close();
		}
		return dto;
	}

}
