
public class dunno {

	public static int main(int n) {
		int tmp = n;
		int result = 0;
		while(tmp/10 != 0 || tmp%10 != 0) {
			result += tmp%10;
			tmp /= 10;
		}
		return result;

	}

}
