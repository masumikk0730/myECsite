package com.internousdev.loginmk.action;

import java.sql.SQLException;

import com.internousdev.loginmk.dao.LoginDAO;
import com.internousdev.loginmk.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String name;
	private String password;


	public String execute()throws SQLException{
//		メソッド名はexecute

		String ret=ERROR;
//		メソッドの戻り値retを定義し初期値にerrorを代入

		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();

		dto=dao.select(name, password);
//		jspから送られてきたnameとpasswordを引数として
//		LoginDAOクラスのselectメソッドを呼び出す→結果をDTOに代入

		if(name.equals(dto.getName())){
//			入力したnameとDTOの値が一致するか
			if(password.equals(dto.getPassword())){
				ret=SUCCESS;
//				↑if文の条件を満たしたときretがSUCCESSになる
			}
		}
		return ret;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}

}

//setName,setPasswordを定義することでjspでユーザーが入力した
//nameとpasswordの値がそれぞれのフィールド変数に格納
//
//getは使わないが次の画面に値を引き渡すサイトの場合は必要