
public class dunno {

	public static void main(String[] args) {
		int n = -123;
		int tmp = n;
		int result = 0;
		while(tmp/10 != 0 || tmp%10 != 0) {
			result += tmp%10;
			tmp /= 10;
		}
		System.out.println(result);
		//holla

	}

}
