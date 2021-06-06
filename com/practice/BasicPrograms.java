package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BasicPrograms {

	public static void main(String[] args) {
//		fibonacci();
		int num=10;
//		fibonacciRecursion(num);
		//vowels checking
		String s="Raghvendra is here";
//		vowels(s);
		//factorial
//		factorialRecursion(num);
		//array logic
//		arrayLogic();
//		sta();
		game();

	}
public static void fibonacci() {
	int n1=0, n2=1, n3=0, num=10;
	System.out.print("If input is belongs"+n1+""+n2);
	for(int i=1; i<=num; i++) {
		n3=n1+n2;
		System.out.println("fibo is"+n3);
		n1=n2;
		n2=n3;
	}
	
}
public static int fibonacciRecursion(int num) {
	//in this condition we print by end 
	if(num<=1) {
		return 1;
	}else {
		return fibonacciRecursion(num-1)+fibonacciRecursion(num-2);
	}
}
public static String vowels(String s) {
		if(s.equals(null)) {
			return "invalid";
		}else {
			String p=s.toLowerCase();
			boolean y=p.matches(".*[aeiou]*.");
			String type=String.valueOf(y);
			return type;
		}
}
  public static int factorialRecursion(int num) {
	  if(num<1) {
		  return 1;
	  }else {
		  return (num*factorialRecursion(num-1));
	  }
  }
    public static void arrayLogic() {
	int[] a= {1,2,4,5,6,1,7,9,5,1,2,1};
	int[] b= {1,7,9,5,20,100};
	int second=0;
	int low=a[0];
	int i=0;
	int high=a[a.length-1];
	for(i=0; i<a.length; i++) {
		if(a[i]>a[0]) {
			second=a[0];
			a[0]=a[i];
			
		}
		//finding all 1 in arrays
		int count=0;
		if(a[i]==1) {
		count++;
		System.out.println(count);
		}
	}
	//largest and second largest elemet
	System.out.println(a[0]+""+second);
	//compare method based on lexicography
	System.out.println(Arrays.compare(a, b));//output 1 means contents are matches
	String c=Arrays.toString(Arrays.copyOfRange(a, 3, 6));
	Arrays.mismatch(a, b);
	//move array 2
	int location=2;
	for(int j=b.length-1; j>location; --j) {
		b[j]=b[j-1];
		System.out.println(b[j]);
	}
	b[location]=222;
	for(int s:b) {
		System.out.println(s);
	}
	//binay search
	Arrays.sort(b);
	int key=222;
	int first=b[0];
	int last=b[b.length-1];
	int mid=first+last/2;
	while(first>last) {
		if(b[mid]<key) {
			first=mid+1;
		}else if(b[mid]==key) {
			System.out.println(mid);
		}else if(b[mid]>key) {
			last=mid-1;
		}else {
			System.out.println("no element is there");
		}
	}
	//bubble sort
	for(int m=0; m<a.length; m++) {
		for(int n=0; n<a.length-i;  n++) {
			if(a[n]>a[n+1]) {
				int temp=a[n];
				a[n]=a[n-1];
				a[n-1]=temp;
			}
			System.out.println("no element is there"+a[n-1]);
		}
		
	}
}
    //collection
      public static void sta() {
    	  //finding dublicates
    	  int[] a= {1,9,3,5,3,9};
    	  Set<Integer> st=new HashSet();
    	  Set<Integer> dublicates=new HashSet();
    	  for(int i=0; i<a.length; i++) {
    		  if(!st.contains(a[i])) {
    			  st.add(a[i]);
    			  
    		  }else {
    			  dublicates.add(a[i]);
    			  
    		  }

    	  }
		  System.out.println("Actual Numbers"+st);
		  System.out.println("Dublicates values"+dublicates); 
		  //validation of username id
		  String[] name={"Raghv","bipin","sachin"};
		  String[] password={"123","342","902"};
		  Map<String, String> m=new HashMap<String,String>();
		  for(int i=0; i<name.length; i++) {
			  m.put(name[i], password[i]);
		  }
		  for(Entry<String, String> e:m.entrySet()) {
			  
			  System.out.println("Actual Numbers"+e.getKey()+"\t"+e.getValue());
		  }
      }
      public static void game() {
    	  boolean result=false;
    	  String rag="Raghvendra is here for work";
    	  int count=1;
    	  for(int i=0; i<rag.length(); i++) {
    		  if(rag.charAt(i)==' '){
    			  count++;
    			  if(result==false) {
    				  System.out.println("Now I am in false");  
    			  }
    		  }
    		  System.out.println(count);
    	  	  if(rag.indexOf(i)==rag.lastIndexOf(i)) {
    	  		  if(result==false) {
    	  			  break;
    	  		  }
    	  	  }
    	  }
    	//find the 1st non repaeated characters
        Map<String,Integer> map=new HashMap();
           map.put("Raghv", 1);
           map.put("bipin", 2);
           map.put("Mahi", 4);
           map.put("bb", 4);
           map.put("Sami", 6);
           map.put("GG", 4);
           map.put(null, null);
           map.put("namo", null);
           System.out.println("This new one"+map.get("bb").compareTo(3));
          Set s= map.entrySet();
          
           
    	  }
      }


