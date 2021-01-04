package com.toyproject.server;

public class MemberDTO {

	private int mseq;
	private String id;
	private String pass;
	private String email;
	private String address_1;
	private String address_2;
	private String phone_number;
	
	public MemberDTO(int mseq, String id, String pass, String email, String address_1, String address_2, String phone_number) {
		this.mseq = mseq;
		this.id = id;
		this.pass = pass;
		this.email = email;
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.phone_number = phone_number;
	}
	
	public int getMseq() {
		return mseq;
	}
	public void setMseq(int mseq) {
		this.mseq = mseq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
}
