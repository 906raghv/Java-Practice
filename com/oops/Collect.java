package com.oops;

import java.util.Scanner;

public class Collect extends Student{
	int a;
	  Collect(){
		 super(); 
	  }
     Collect(int a){
    	 this.a=a; 
    	 System.out.println("Arguments are define the parent"+a); 
	  }
     public void m1() {
    	 System.out.println("I am in Parent class");
     }
     public void m1(int c) {
    	 System.out.println("I am Overlader");
     }
     public String m11() {
    	 System.out.println("I am in Parent class");
    	 return "";
     }
     public void another() {
    	 System.out.println("I am in antother parent method");
     }
     public String menuu() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enetr");
			int day=sc.nextInt();
      
			if(day<=0) {
				System.out.println("Please enter valid"); 	
			}
			String dayname="";
			switch(day) {
			case 1:
				dayname="Monday";
				break;
			case 2:
				dayname="Tuesday";
				break;
			case 3:
				dayname="Wedsnesday";
				break;
			case 4:
				dayname="Friday";
				break;
			case 5:
				dayname="Saturday";
				break;
			case 6:
				dayname="Sunday";
				break;
			}
			System.out.println(dayname);
			return dayname;
		}
     }
     public void alpha() {
    	 for(char c='A'; c<='Z'; c++) {
    		 String s=String.valueOf(c);
    		 if(s.equals("A")) {
    		 System.out.println("Character is"+c); 
    		 break;
    		 }
    		 System.out.println(s);
    	 }
     }
    
     public void CountLetter() {
    	  @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
          System.out.println("Enetr Character");
          String input=sc.next().toLowerCase();
          boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
          boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
          boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                  || input.equals("o") || input.equals("u");
    	 //TestCase1
          if(input.length()>1) {
        	  System.out.println("Not a single Character");  
          }else if(!(uppercase || lowercase)) {
        	  System.out.println("Not a number is consider");
          }else if(vowels) {
        	  System.out.println("Inputs is vowels");
          }else {
        	  System.out.println("Constatnt Character");
          }
     }
     public void pattern() {
    	  @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
          System.out.println("Enetr Number of row");
          int input=sc.nextInt();
          System.out.println("Enetr Pattern");
          String s=sc.next();
          for(int i=0; i<=input; i++) {
        	  for(int j=0; j<=i; j++) {
        		  System.out.print(s);
        		  
        		  
        	  }
        	  System.out.println("");  
          }
     }
     public void leapYear() {
   	  @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
      System.out.println("Enetr Number of Year");
      int input=sc.nextInt();
      if(input%4==0) {
    	  if(input%100==0) {
    		  if(input%400==0)
    			  System.out.println("Yes this is laep year");
    		  else
    			  System.out.println("Not a leap year");
    	  }else {
    		  System.out.println("Yes this is leap year");
    	  }
      }else {
    	  System.out.println("This is not a leap year"); 
      }
     }
     public void alphabet() {
      	  Scanner sc=new Scanner(System.in);
          System.out.println("Enetr alpabet");
          @SuppressWarnings("unused")
		char c=sc.next().charAt(0);
          if(!(c>='a' && c<='z' || c>='A' && c<='Z')) {
        	  System.out.println(c+" "+" is an valid character"); 
          }
          else if(c>='a' && c<='z' || c>='A' && c<='Z') {
        	  System.out.println(c+" "+" is an alphabet");  
          }else {
        	  System.out.println(c+" "+" is not an alphabet"); 
          }
        
          }
     
       public void fact() {
    	   int fact=1;
 	  Scanner sc=new Scanner(System.in);
    System.out.println("Enetr Number");
       int num=sc.nextInt(); 
       if(num<=0 || num==1) {
    	   System.out.println("This is less than 1");   
       }else {
    	   for(int i=1; i<=num; i++) {
    		   fact=fact*i;
    	   }
    	   int qb=3;
    	  int p= (int) Math.sqrt(num);
    	   System.out.println("The factorial of the num is"+fact); 
       }
}
       
     public void squre() {
      int num=5,p=0,result=1;
	       if(num==0 && p==1) {
	    	   result=0;
	       }else if(num>=0 && p>=1) {
	    	   result= 1;
	       }else {
	    	   for(int i=1; i<=p; i++) {
	    		   result=result*num;
	    	   }
	    	   System.out.println("The squre root is"+result);
	       }
}
}
