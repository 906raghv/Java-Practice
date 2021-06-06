package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class Col {
	int a;
	String str;
	public void swap(int a, String str) {
		this.a=a;
		this.str=str;
	}
	Col(int a, String str) {
		this.a=a;
		this.str=str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		         s.add("puneet");
		         s.add("mai");
		         s.add("pani");
		         s.add("raghv");
		         s.add("fid");
		         s.add("varansi");
		         //insert specified position
		         s.add(3,"Raghvendra");
		         //update at specified position
		         s.set(1,"bipin");
		         //remove
		         s.remove(3);
		         //search in arraylist
		        boolean sc= s.contains("bipin");
		        //find an specic element
		         String o=s.get(1);
		         //sort
		         Collections.sort(s);
		         //for copy we use Collections.copy(list1,list2) list 2 values copy in list 1
		         
		         s.forEach(name -> System.out.println(name+"\t"+o+"\t"+sc));
		       //find sublist
		         //swap values
		         Collections.swap(s, 1, 3);
		         //trim the irrelevant space of arraylist
		         s.trimToSize();
		         //increase sixe of arraylist
		         s.ensureCapacity(10);
		         s.add("mahi");
		         System.out.println(s.subList(1, 5)+""+s.size());
		         ArrayList list=new ArrayList();
		         Bmc bm=new Bmc();
		         bm.b=10;
		         bm.h=20;
		         bm.arr();
		         
	}

}
