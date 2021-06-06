package com.practice;

public interface Intra {
	public static final int pi=25;
	private void rr() {
		System.out.print("private");
	}
   default void mm() {
	   System.out.print("private"); 
   }
   public static void mc() {
	   System.out.print("static");
   }
}
