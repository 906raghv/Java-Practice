package com.practice;

import java.util.Scanner;

public class Bmc {
	static int b,h,area;
	static {
		     @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
		    System.out.print("Enter the Height");
		    b=sc.nextInt();
		    System.out.print("Breath");
		    h=sc.nextInt();
		    if(h<1  || b<1){
		        String s="java.lang.Exception: Breadth and height must be positive";
		        System.out.println(s);
		    }else {
		    	area=h*b;
		    	System.out.println("area is"+area);
		    }
	    arr();
	}
	public static void arr() {
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number");
        int n=sc.nextInt();
         int[] num=new int[n];
         int i=0;
    for(i=0; i<n;i++){
        num[i]=sc.nextInt();
        System.out.print("Enter the number"+num[i]);
        sc.close();
    }
    System.out.print("Enter the number"+num[i]);
	}
}
