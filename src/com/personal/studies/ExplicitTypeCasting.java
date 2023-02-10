package com.personal.studies;

public class ExplicitTypeCasting {
	
	public static void main(String[] args) {
		
		double a = 50.45;
		System.out.println("Double Value --- "+a);
		
		float b = (float) a;
		System.out.println("Float Value ---- "+b);
		
		int c =  (int) b;
		System.out.println("Intger Value --- "+c);
		
		short d =  (short) c;
		System.out.println("Short Value ---- "+d);
	}

}
