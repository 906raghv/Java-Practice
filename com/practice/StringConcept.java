package com.practice;

public class StringConcept extends Pract_1 {
	String name;
	String fname;
	static String address;
	static int  p;
	StringConcept(){
		super();
	}
	StringConcept(StringConcept s){
		s.name=s.name;
		s.fname=s.fname;
		System.out.print(fname+""+name);
	}
   public void m1() {
	  super.m1();
	  m2();
	   System.out.println("m1");
   }
   public int m1(int a) {
	   return 1;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcept s1=new StringConcept();
		        s1.m1();
		    s1.fname="raghvendra";
		    s1.name="tiwari";
		StringConcept s2=new StringConcept(s1);
		str();
	}
  public static void str() {
	  String s="hello";
	  String s1=new String("hello");
	  StringBuilder sb=new StringBuilder(s1);
	  if(s.equals(sb)) {
		  StringConcept p=new StringConcept();
		  System.out.println("my name is"+p.fname+""+p.name);
	  }else {
		  System.out.println("my name");
	  }
	  }
}
