package com.internousdev.ecsite.dto;

public class BuyItemDTO {
	public int id;

	public String itemName;
	public String itemPrice;
	/*iteminfotransactionのテーブルカラムに対応*/

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

}
