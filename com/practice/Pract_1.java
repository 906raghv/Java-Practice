package com.practice;

import java.util.Scanner;

public class Pract_1 {
	public void m1() {
		System.out.println("m1 parent");
	}
	public void m2() {
		System.out.println("m2 parent");
	}
	int a,b;
	Pract_1(){
		
	}
Pract_1(int x,int y){
		a=x;
		b=y;
	}
	public void rev() {
		int[] a= {1,2,3,4,5,6,7};
		int low=0;
		int high=a.length-1;
		while(low<high) {
			
			int temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
		for(int num1:a) {
			System.out.println(num1);
		}
	}
	//fibbo
	public void fibbo() {
	int n1=0,n2=1,n3=0,i=0,count=10;
	System.out.println(n1+""+n2);
	for(i=2;i<=10;++i) {
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		   
	}
	}
	//
	public void arrr() {
		String s="12";
		int a=Integer.parseInt(s);
		int[] num1= {1,4,5,6,7,3,3,7,8,8};
		for(int i=0; i<num1.length; i++) {
			for(int j=i+1;  j<num1.length; j++) {
				if(num1[i]==num1[j]) {
				System.out.println("number"+num1[j]);
				
			}
		}
	}

	}
  public String res(String s) {
	  if(s==null || s.length()<=1) {
		  return s;
	  }
	  return res(s.substring(1))+s.charAt(0);
	 
  }
  public void swap() {
	  int a=10;
	  int b=20;
	  b=b+a;
	  a=b-a;
	  b=b-a;
	  System.out.println(a+"number"+b);
	  String m="    Raghvendra is not";
		m=m.strip();
		System.out.println(m);
  }
  public void prr(int y) {
	  y=a+b;
	  System.out.println(y);
  }
  public void game() {
	  int[] a= {1,9,5,1,6,2,1,3,4,3};
	  int loc=3;
	  for(int i=a.length-1; i>loc ; i--) {
		  a[i]=a[i-1];
		  System.out.println(a[i]);
		  
	  }
  }
  public void voice() {
	  //inserting value dyanmic
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Value");
	  int n=sc.nextInt();
	  int[] a=new int[n];
//	  System.out.println(a.length);
	  for(int i=0; i<n; i++) {
		  a[i]=sc.nextInt();
		  
	  }
//find 1st dublicate values
	  for(int i=0; i<n; i++) {
		  for(int j=0; j<i; j++) {
			  if(a[i]==a[j]) {
				  System.out.println(a[i]);
			  }
				  
			  
		  }
	  }
	  System.out.println("-1"); 
      int[] p=new int[n];
      for(int i=a.length-1; i>=0; i++){
          p[i]=i;
      }
      for(int c:p) {
    	  System.out.println(c); 
    	  }
    	  
  }
  public void sss() {
	  int[] a= {1,2,2,5,6,3};
	  int n=a.length-1;
	  int temp=a[0];
	  int[] b=new int[4];
	  for(int i=1; i<a.length-1; i++) {
		  System.out.println(a[i]); 
		  a[i]=a[i+1];
		  temp=a[n];
		  System.out.println("valueThis is "+a[i]); 
	  }
//	  for(int y:a) {
//		  System.out.println(y);   
//	  }
  }
}
