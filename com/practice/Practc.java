.package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Practc {
	
	public void str() {
		String s="Raghvendra are You Crazy";
		int count=0;
		char[] c=s.replaceAll("\\s", "").toCharArray();
		Map<Character , Integer> m=new HashMap();
		for(char p:c) {
			if(!m.containsKey(m)) {
				m.put(p,count++);
			System.out.println("This is your characters"+m);
			}
			   m.forEach((k,v) -> System.out.println("Key = "
		                + k + ", Value = " + v));
		}
		
		
	}

}
