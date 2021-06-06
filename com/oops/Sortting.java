package com.oops;

public class Sortting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int[] a1= {2,1,4,5,8,9,10};
//		bubble(a);
//		pattern();
       int a=5,b=5;
       pp(a,b);
	}
public static int bubble(int[] a) {
	int[] b;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<i-1; j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	for(int i=0; i<a.length; i++) {
		System.out.println("Bubble sort is"+a[i]);
	}
	return 1;
}
    public static void pattern() {
    	int a=6;
    	for(int i=0; i<a; i++) {
    		for(int j=2*(a-i); j>=0; j--) {
    			System.out.print("");
    			
    		}
    		for(int j=0; j<=i; j++) {
    			System.out.print("*");
    		}
    		System.out.println("");
    }

}
    public static int pp(int a, int b) {
    	if(a==b) {
    		System.out.print("*");
    	}
//    	}else {
//    		return a*pp(a,b-1);
//    	}
		return b;
    }
    }
