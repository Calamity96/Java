package programmierpraktikum02;

import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int eingabe;
		System.out.print("n eingeben: ");
		eingabe = scan.nextInt();
		scan.close();
		System.out.println(ordentlich(eingabe));
	}
	
	public static int ordentlich(int n) {
		int result = 0;
		if(n>=0) {
			for(int i=0;i<=n;i++) {
				if(!((i%2)==0)) {
					result+=i;
				}
			}
		}else {
			for(int i=0;i>=n;i--) {
				if(!((i%2)==0)) {
					result+=i;
				}
			}
		}
		return result;
	}
	
}
