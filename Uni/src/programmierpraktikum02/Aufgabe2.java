package programmierpraktikum02;

import java.lang.Math;

public class Aufgabe2 {
	
	public static final double EPSILON = 10e-8;

	public static void main(String[] args) {
		System.out.println(cosh(0.5f));
		System.out.println(Math.cosh(0.5d));
	}

	public static double hoch(double x, int n) {
		double result=1d;
		for(int i=0;i<=n;i++) {
			result*=x;
		}
		return result;
	}
	
	public static int fakultät (int x) {
		int result=1;
		for(int i=1;i<=x;i++) {
			result*=i;
		}
		return result;
	}
	
	public static double cosh(double x) {
		double result=1d;
		int i=0;
		double summand=0d;
		while(summand>EPSILON||-summand>EPSILON){
			i+=2;
			summand=((hoch(x,i))/(fakultät(i)));
			result+=summand;
		}
		return result;
	}
	
}
