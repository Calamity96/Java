
public class Functionality {
	
	public static int quersumme(int n) {
		int num = n;
		if (n<0) n = n*(-1);
		int qs=0;
		while(n>0) {
			qs = qs + (n % 10);
			n = n/10;
		}
		if (num<0) qs = qs*(-1);
		return qs;
	}
}
