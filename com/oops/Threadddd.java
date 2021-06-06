package com.oops;

import java.util.ArrayList;

public class Threadddd implements Runnable{
	public void run() {
		System.out.println("I am run method");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadddd t=new Threadddd();
		
		System.out.println(Thread.currentThread().getClass());
		int[] a= {6,8,9};
		 ArrayList<Integer> ar=new ArrayList();
		   ar.add(a[0]);
		   ar.add(a[2]);
		   ar.set(1,a[1]);
		   ar.remove(0);
		   System.out.println("I am run method"+ar);
		   

	}

}
