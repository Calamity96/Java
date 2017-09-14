package notDefault;

import java.util.*;

public class wasKomplexes {

	public String something;
	
	public static void main(String[] args) {
		wasKomplexes x = new wasKomplexes();
		x.ausf();
	}
	
	public void ausf() {
		System.out.println("Geben sie was ein: ");
		lesen();
		System.out.println(this.something);
	}
	
	public void lesen () {
		Scanner scan = new Scanner(System.in);
		this.something = scan.next();
		scan.close();
	}
}
