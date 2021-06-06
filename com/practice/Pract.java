package com.practice;

public class Pract extends Pract_1{
	int x,z,a;
    Pract(){
    	super(20,30);
    }
    Pract(int x, int z){
    	super.prr(10);
    	x=x;
    	z=z;
    }
    public void prr() {
    	super.a=20;
    	a=60;
    	System.out.println("I am in child class");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array reverse
		Pract p=new Pract();
		p.sss();
		String m="Raghvendra is not";
		boolean p1=m.toLowerCase().matches(".*[aeiou]*.");

	}

}
