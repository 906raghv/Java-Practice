package com.practice;

public class Opps extends Col{
	int name;
	static int m;
	//swappingtwo objects
	public static void swap(Opps p, Opps p1) {
		int temp;
		temp=p.m;
		p.name=p1.name;
		p1.name=temp;
		System.out.print(p1.str);
		
	}
	
	Opps(int name,int a,String str){
		super(a,str);
		this.name=name;
	}
	public static void main(String[] args) {
		Opps o1=new Opps(1,12,"raghvendra");
		Opps o2=new Opps(2,20,"tiwari");
		swap(o1,o2);
		    	
		    }

}
