package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/*sessinaware→セッション属性をMAP<String.Object>で取得する*/

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;

	public String execute(){
		String result="login";
		/*変数名は"login*/
		if(session.containsKey("login_user_id")){
			BuyItemDAO buyItemDAO=new BuyItemDAO();
			BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo();
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
		/*もしloginuseridが存在するなら containskey→keyが存在するか確認*/
	    /*session put→key=valueを追加する*/
			result=SUCCESS;
		}
		return result;
		/*ログイン状態ならsuccess、ログインしてない場合はlogin*/
	}


@Override
public void setSession(Map<String,Object> session){
	this.session=session;
}
public Map<String,Object> getSession(){
	return this.session;
}
}

/*override再定義*/