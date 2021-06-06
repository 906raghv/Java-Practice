package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	        }
	        in.close();
	        int c = a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
            // for(int i=0;i<t;i++)
            {

                try
                {
                    long x=sc.nextLong();
                    System.out.println(x+" can be fitted in:");
                    if(x>=-128 && x<=127)System.out.println("* byte");
                    //Complete the code
                    if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                        System.out.println("* short");
                    if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                        System.out.println("* int");
                    if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                        System.out.println("* long");
                }
                catch(Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }

            }
		
		
		  int s=7;
		  for(int i=0;i<=s;i++)
		   {
		     for(int j=1;j<=s-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		  int a=12345;
		 
		  int count=0;
		  for(int i=0; i<=4; i++) {
			  int rem=a%10;
			  count++;
			  a=a/10;
		  }
		  System.out.print("n"+count);
		  double num1=2.34;
		  double num2=4.58;
		  
		  if (Math.abs(num1 - num2) <= 0.01) { 
			     System.out.println("These numbers are the same."); 
			 } 
			 else { 
			     System.out.println("These numbers are different."); 
			 } 
		  int[][] num=new int[10][10];
		  for(int i=0; i<=8; i++) {
			  for(int j=0; j<=8; j++) {  
				  System.out.printf("%4d",num[i][j]);
		  }
			  System.out.print("\n");  
			  
		  }
		  int[] d= {1,2,3,4,5,6,6};
		  System.out.print("\n"+Arrays.toString(d)); 
		  //remove second elemnt
		  for(int i=1; i<=4;i++) {
			  d[i]=d[i+1];
		  }
		  System.out.print("\n"+Arrays.toString(d));
		  //find the dublicates values
		  String[] str= {"Raghv","ti","punam","kk","raghv"};
		  String[] str1= {"Raghv","ti","punam","kk","raghv","amit","bipin"};
		  Set<String> s1=new HashSet();
		  for(int sp=0; sp<=4;sp++) {
			  for(int sd=0;sd<=6;sd++) {
  				  if(str[sp].equals(str1[sd])) {
					  s1.add(str[sp]);
				  }
			  }
			  System.out.print(s1);
		  }
		  
		 ArrayList<String> ar=new ArrayList<String>();
		        ar.add("raghv");
		        ar.add("tiwari");
		 String[] n=new String[ar.size()];
		 ar.toArray(n);
		 ar.forEach(System.out::println);
		 //find the missing number
		 int[] am= {1,2,3,4,5,6,7,8,9};
		 //natural sum of 10 numbers
		 int ori=10*11/2;
		 int sum=0;
		 for(int i=0; i<am.length; i++) {
			  sum=sum+am[i];
			 System.out.println(sum);
		 }
		 //missing is
		 int total=ori-sum;
		 System.out.println(total);
		 //findinding zeos
		 int[] ft= {0,1,3,0,0,3,0,40,0,0};
		 for(int i=0; i<ft.length;i++) {
			 if(ft[i]==0) {
				 int zero=i;
				 System.out.println("zeros Index of"+i);
			 }
		 
				 
	}

	}}
