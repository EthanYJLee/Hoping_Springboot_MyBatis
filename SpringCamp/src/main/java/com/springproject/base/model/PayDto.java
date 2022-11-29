package com.springproject.base.model;

public class PayDto {
	
	String cid;
	int partner_order_id;
	String partner_user_id;
	String item_name;
	int quantity;
	int total_amount;
	int tax_free_amount;
	int room_roSeq;
	int room_regcamp_regSeq;
	int room_regcamp_host_hSeq;
	String client_cId;
	
	public PayDto() {
		// TODO Auto-generated constructor stub
	}

	public PayDto(String cid, int partner_order_id, String partner_user_id, String item_name, int quantity,
			int total_amount, int tax_free_amount, int room_roSeq, int room_regcamp_regSeq, int room_regcamp_host_hSeq,
			String client_cId) {
		super();
		this.cid = cid;
		this.partner_order_id = partner_order_id;
		this.partner_user_id = partner_user_id;
		this.item_name = item_name;
		this.quantity = quantity;
		this.total_amount = total_amount;
		this.tax_free_amount = tax_free_amount;
		this.room_roSeq = room_roSeq;
		this.room_regcamp_regSeq = room_regcamp_regSeq;
		this.room_regcamp_host_hSeq = room_regcamp_host_hSeq;
		this.client_cId = client_cId;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public int getPartner_order_id() {
		return partner_order_id;
	}

	public void setPartner_order_id(int partner_order_id) {
		this.partner_order_id = partner_order_id;
	}

	public String getPartner_user_id() {
		return partner_user_id;
	}

	public void setPartner_user_id(String partner_user_id) {
		this.partner_user_id = partner_user_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}

	public int getTax_free_amount() {
		return tax_free_amount;
	}

	public void setTax_free_amount(int tax_free_amount) {
		this.tax_free_amount = tax_free_amount;
	}

	public int getRoom_roSeq() {
		return room_roSeq;
	}

	public void setRoom_roSeq(int room_roSeq) {
		this.room_roSeq = room_roSeq;
	}

	public int getRoom_regcamp_regSeq() {
		return room_regcamp_regSeq;
	}

	public void setRoom_regcamp_regSeq(int room_regcamp_regSeq) {
		this.room_regcamp_regSeq = room_regcamp_regSeq;
	}

	public int getRoom_regcamp_host_hSeq() {
		return room_regcamp_host_hSeq;
	}

	public void setRoom_regcamp_host_hSeq(int room_regcamp_host_hSeq) {
		this.room_regcamp_host_hSeq = room_regcamp_host_hSeq;
	}

	public String getClient_cId() {
		return client_cId;
	}

	public void setClient_cId(String client_cId) {
		this.client_cId = client_cId;
	}
	
	
	
	

}
