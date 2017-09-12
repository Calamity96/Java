package notDefault;

public class math {

	public static void main(String[] args) {
		int i = 1;
		int b = 5;
		System.out.println(calc(i, b));

	}



	public static int calc(int a, int b) {
		int erg = 0;
		erg = (a + 1) * (b + 1);
		return erg;
	}
}
