package com.dats.structure;

public class Item {

	int itemCode;
	String itemName;
	String itemDescription;
	
	Item(int itemcode,String itemName,String itemDescription){
		this.itemCode = itemcode;
		this.itemDescription = itemDescription;
		this.itemName = itemName;
	}
	
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", itemDescription=" + itemDescription + "]";
	}

	
	
}
