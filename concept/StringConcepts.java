package concept;

import java.util.Arrays;
import java.util.Scanner;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		 Scanner sc=new Scanner(System.in); 
		 System.out.print("Pleasse enter");
    	 s=sc.nextLine();
    	 sp(s);
	}
     public static void sp(String s) {
    	 //reverse a string 
    	 String rev="";
    	 for(int i=s.length()-1; i>=0; --i) {
    		 rev=rev+s.charAt(i);
    	 }
    	 System.out.print(rev);
    	 
    	//inter() method in string
         String s1="hello";
         String s2=new String("hello");
         String s3=s2.intern();//join the heap area within scp
         System.out.println(s1==s2);//false
         System.out.println(s1==s3);//true
         //anagram strings peek keep
         String s4="KEEP";
         boolean check=false;
         if(s4.length()==s.length()) {
        	 //char array convert
        	 char[] p=s4.toLowerCase().toCharArray();
        	 char[] p1=s.toLowerCase().toCharArray();
        	 //sort the array
        	 Arrays.sort(p);
        	 Arrays.sort(p1);
        	 //check the element
        	 for(int i=0; i<p.length; i++) {
        		 if(p[i]==p1[i]) {
        			 check=true;
        		 }
        	 }
        	 if(check) {
        		 System.out.println("String is anagram"); 
        	 }
        	 
        	 
         }else {
        	 System.out.println("String is not anagram");
        	
         }
         //remove particular character in strings
         boolean me=false;
         char rem='p';
         String ms=s.toLowerCase();
         for(int i=0; i<ms.length(); i++) {
        	 if(ms.charAt(i)==rem) {
        		String mm= ms.replace(ms.charAt(i),' ');
        	 me=true;
        	 System.out.println(me+"String valis\t"+mm.strip());
        	 }
         }
         //string is immutable
         String str="myNameis";
         String str1=str+"hello";
         System.out.println(str1);
     }
     
}
