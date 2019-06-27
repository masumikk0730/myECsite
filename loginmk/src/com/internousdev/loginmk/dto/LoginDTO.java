package com.internousdev.loginmk.dto;

public class LoginDTO {

	private int id;
	private String name;
	private String password;

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
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

//DTOクラスはDAOクラスでSELECTされた値を格納するクラス
//フィールドで格納する値を宣言
//
//getter→Actionクラスから呼び出されActionへ値を渡す
//setter→DAOクラスから呼び出されテーブルの値をDTOのフィールドに格納