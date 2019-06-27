package com.internousdev.ecsite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//MySQL接続に必要な情報 自分のデータベース名確認
public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost/ecsitekikuchi2";

	private static String user="root";
	private static String password="mysql";

	public Connection getConnection(){
		Connection con=null;

	try{
		Class.forName(driverName);
		con=(Connection) DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;

}
}

