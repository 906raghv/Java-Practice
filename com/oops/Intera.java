package com.oops;

public interface Intera {
	public static int a=10;
	default void menu() {
		int a=20,b=30;
		int c=a+b;
		System.out.println("I am default in interface"+c);
	}
     public static void fresh() {
    	 System.out.println("I am static in interface"+a);
     }
     private void mall(int p) {
    	 System.out.println("I am private in interface"+a);
	}
    	 
     
}
