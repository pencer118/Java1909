package com.lec.java.inherit07;

public class BusinessPerson extends Person {
	// 멤버변수 추가
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	// 메소드 오버라이딩 (Overriding)
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("회사: " + company);
	}
	
	// 메소드 오버로딩 (Overloading)
	public void showInfo(int id) {
		System.out.println("id : " + id);
		this.showInfo();
	}

	// final 메소드는 더이상 오버라이딩 불가
//	@Override
//	public void whoAreYou() {
//		super.whoAreYou();
//	}
	
	@Override
	public String toString() {
		return "BusinessPerson] name = " + getName() + ", company = " + company;
	}
	
	
	
	
	
	
	
	
}





