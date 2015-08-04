package com.method;

public class mainClass {
	
	static int firstNum = 10;
	static int seconNum = 20;
	static int thirdNum = 0;
	
	public void method1() {
		System.out.println("THis is method 1");
	}
	
	public void method2 (int angka1, int angka2) {
		int total = angka1 + angka2;
		System.out.println("Total : " + total);
	}
	
	public String method3(String message) {
		message = message.substring(0, 5);
		return message;
	}
	
	public void setThirdNum() {
		this.thirdNum = 1000;
	}
	
	public static void main (String[] args) {
		mainClass ob = new mainClass();
		//ob.method1();
		
		//ob.method2(firstNum, seconNum);
		
		/*
		String pesan = "Hello Andre";
		
		String pesanYangDidapet = ob.method3(pesan);
		
		System.out.println(pesanYangDidapet);
		*/
		
		System.out.println("Sebelum : "+thirdNum);
		ob.setThirdNum();
		System.out.println("Sesudah : "+thirdNum);
	}
}
