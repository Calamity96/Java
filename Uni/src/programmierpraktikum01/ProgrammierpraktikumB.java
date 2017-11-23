package programmierpraktikum01;

public class ProgrammierpraktikumB {

	public static void main(String[] args) {
		//System.out.println(Aufgabe1(12));
		char[] test = {'A', 'B', 'B', 'A'};
		System.out.println(palyndrom(test, 0));
	}
	
	public static int Aufgabe1(int x) {
			if(x<10 && x>0) {
			return x*Aufgabe1(x-1);
		}else if(x>10) {
			return x+Aufgabe1(x-10);
		}
		return 11;
	}
	
	public static int search(int[] a, int n, int val) {
		if(a[n]==val) return n;
		return search(a, n+1, val);
	}

	public static boolean palyndrom(char[] letters, int n) {
		if(!(letters[n]==letters[letters.length-(n+1)])) return false;
		if(n>=letters.length-(n+1)) return true;
		return palyndrom(letters, n+1);
	}
	
}
