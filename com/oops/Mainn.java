package com.oops;

import jdk.tools.jaotc.Main;

public class Mainn extends Collect implements Intera{
	
	Mainn(){
		
		super.another();
		
	}
	Mainn(int a){
		super(10);
	}
	public void m1() {
		
   	 System.out.println("I am in child class");
    }
	
	public String m2() {
		System.out.println("Please enter valid");
		//this keyword is optional
		this.m1();
		//super is mantodry in case of same name
//		super.m1();
//		another();
//		menu();
//		alpha();
//		CountLetter();
//		pattern();
//		issue();
//		leapYear();
//		alphabet();
		fact();
		
   	 return "";
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mainn m=new Mainn();
        m.m1();
        m.menu();
        Intera.fresh();
        int vv=Intera.a;
	}
	

}
