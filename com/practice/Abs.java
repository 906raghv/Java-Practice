package com.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public abstract class Abs {
	@SuppressWarnings("unlikely-arg-type")
	public static void pp() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        String s=sc.nextLine();
        Stack<String> st=new Stack<String>();
        for(int i=0; i<s.length();i++) {
        	if(!st.contains(s.charAt(i))) {
        		st.push(s);
        		System.out.println("Enter"+st);
        	}
        		
        			
        	}
        char z='z';
        int ascii=z;
        System.out.println("Ascii"+ascii);
        for(int j=1; j<10; j+=2) {
        	System.out.println("odd"+j);	
        }
        String p="my name is rad na";
        for(int k=0; k<p.length(); k++) {
        String up=Character.toUpperCase(p.charAt(k)) + p.substring(1) + " "; 
        System.out.println("odd"+up);
        }
        int prime=30;
        //inert new string within a string
        String r="Rajk col";
        String word="Engi";
        String result=r.substring(0,5)+word+r.substring(8);
        System.out.println("string is"+result);
        StringBuffer b=new StringBuffer();
          
        }
	   public static void sq() {
		   int[] arr1= {10,20,3,5};
		   int[] arr2= {2,5,4,6,7};
		     Arrays.toString(arr1);
		     Arrays.toString(arr2);
		     //both length is same
		   for(int i=0; i<arr1.length;i++) {
			   int num1=arr1[i];
			   int num2=arr2[i];
			   int[] result= {num1*num2};
			   System.out.println(Arrays.toString(result));
		   }
		   String st="Raghvendra";
		   String sp=st.substring(7);
		   System.out.println(sp);
		   int a=20;
		   System.out.println((a & 1) == 0 ?  "EVEN" : "ODD" );
		   
	   }
	   
	   public static void con() {
		   double d=0.0;
		   boolean r=false;
		   if(d>0) {
		    r=true;
		    System.out.println(r);
	   }else if(d<0) {
		   r=false;
		   System.out.println(r);
	   }else {
		   System.out.println("zero");
	   }
		  
				   
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter"); 
		   int k=1;
		   int s=sc.nextInt();
		   for(int i=0; i<=s;i++) {
			 for(int j=0; j<=i; j++) {
				 System.out.print(k++);	
			 }
			 System.out.println(""); 
		   }
		   
	   }
	   

}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	



