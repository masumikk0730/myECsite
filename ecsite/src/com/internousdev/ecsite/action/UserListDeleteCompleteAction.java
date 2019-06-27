package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport {

	private String message;

	public String execute() throws SQLException{
		String result=ERROR;

		UserListDeleteCompleteDAO uldcDAO=new UserListDeleteCompleteDAO();
		int res=uldcDAO.deleteUserList();

		if(res>0){
			setMessage("正しくユーザー情報が削除されました");
		}else{
			setMessage("ユーザー情報の削除に失敗しました");
		}
		result=SUCCESS;
		return result;
	}

	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}

}
