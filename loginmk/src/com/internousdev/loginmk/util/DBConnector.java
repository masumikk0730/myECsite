package com.internousdev.loginmk.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static String driverName="com.mysql.jdbc.Driver";
//	ドライバーの名前をdriverNameに代入
//	ドライバーはjavaとデータベースを繋げる工具箱のようなもの

	private static String url="jdbc:mysql://localhost/logindb_masumin";
//	接続先のデータベースを指定

	private static String user="root";
	private static String password="mysql";

	public Connection getConnection(){
//		接続状態にする
		Connection con=null;
//		一度状態を初期化にする

		try{
//			try～catchは例外処理の構文
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
//			ドライバーがロードされ使える状態にしている
		}catch(ClassNotFoundException e){
//			クラスが見つからない場合の例外
			e.printStackTrace();
		}catch(SQLException e){
//			データベース処理に関する例外
			e.printStackTrace();
		}
		return con;
//		MySQLサーバーに接続した結果をメソッドの呼び出し元に渡す
	}


}
