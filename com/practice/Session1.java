
package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Session1 {
	
	public static void main(String[] args) {
		Practc c=new Practc();
		c.str();
		//while loop useful when condition are unpredictable
		//count the digits in a number
		int num=1236;
//		int count=0;
//		while(num>0) {
//			num=num/10;
//			count++;
//		}
//		System.out.println("The digits in the given are"+count);
//		//reverse an array
//		int[]  num1= {1,2,34,3,45,38,9};
//		int low=0;
//		int high=num1.length-1;
//		while(low<high) {
//			int temp=num1[low];
//			num1[low]=num1[high];
//			num1[high]=temp;
//			low++;
//			high--;
//		}
//		for(int num2:num1) {
//			System.out.println("Reverse array is"+num2);	
//		}
		//insert a number in a specific position ia an array
//		int[] num3=new int[5];
//		int n=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Insert the element in your array");
//		for(int i=0; i<num3.length-1;i++) {
//			num3[i]=sc.nextInt();
//		}
//		for(int num4:num3) {
//			System.out.println(num4);
//		}
//		System.out.println("Enter the postion you want to insert");
//		int location=sc.nextInt();
//		System.out.println("Enter new value that you insert");
//		int value=sc.nextInt();
//		for(int i=num3.length-1;i>location;i--) {
//			num3[i]=num3[i-1];
//		}
//		num3[location]=value;
//		for(int j=0; j<num3.length;j++) {
//			System.out.println("Your new array is"+num3[j]);
//
//		}
		//logic for 1st and last digit sum
		int lastDigit=num%10;
		int firstDigit=num;
		while(firstDigit>=10) {
			firstDigit=firstDigit/10;
		}
		System.out.println("firstDigit is"+firstDigit);
		//print dublicate character in a string
		String s="Raghvendra is here";
		String[] sp=s.split("");
		
		for(int i=0; i<sp.length;i++) {
			System.out.println("String is"+sp[i]);
		}
		//Main Method
		String str="kee ep";
		String str1="pee ek";
		anagram(str,str1);
		
	}
	//anagram string 
	public static String anagram(String str,String str1) {
		//TestCase1
		
		String ana=str.replaceAll("\\s","").toLowerCase();
		String ana1=str1.replaceAll("\\s","").toLowerCase();
		
		boolean check=false;
		if(ana.length() != ana1.length()) {
			check=false;
		}else {
			char[] ch1=ana.toCharArray();
			char[] ch2=ana1.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			check=Arrays.equals(ch1, ch2);
			System.out.println("This is anagram string"+check);
			if(check) {
				System.out.println("This is anagram string");
			}
		}
		
		return "";
	}

}
