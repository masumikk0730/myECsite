package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object> session;
	private String errorMessage;


	public String execute(){
		String result=SUCCESS;

		if(!(loginUserId.equals(""))
				&& !(loginPassword.equals(""))
				&& !(userName.equals(""))){
//			空白でなければ情報を取得↓

			UserCreateConfirmDAO userCreateConfirmDAO=new UserCreateConfirmDAO();
            if(!userCreateConfirmDAO.isExistUser(loginUserId)){
//            もし空白でなくて更にuserCreateConfirmDAOに存在しないユーザーであれば

			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
//			確認画面で表示したい値を格納


		}else{
			setErrorMessage("すでに登録されているログインIDです。");
			result=ERROR;
//			↑データベースに存在するユーザーはこのエラー

		}
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
//			空白でない場合のそれ以外は空白になる
		}
		return result;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	@Override

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage){
		this.errorMessage=errorMessage;
	}

}
