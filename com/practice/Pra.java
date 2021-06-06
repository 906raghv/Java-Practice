package com.practice;

import java.util.Scanner;

public class Pra extends Abs implements Intra{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pra p=new Pra();
        p.con();
		Intra.mc();
		p.mm();
		int b=Intra.pi;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter strings");
		String a;
	/*	 for(int i = 1; scan.hasNext()== true; i++){
		       System.out.println(i + " " + scan.nextLine());
		   }  */
		int i=0;
		while(in.hasNext())
        {
        a=in.nextLine();
        System.out.println(i+" "+a);
        i++;
    }
		
		  while (num != 0) {
		      // num = num/10
		      num /= 10;
		      ++count;
		    }
		  while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }
		
	}

	

}
