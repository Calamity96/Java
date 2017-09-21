package notDefault;

public class loops {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println("5x for-loop");
		}
		
		int a = 0;
		while(a<5) {
			System.out.println("5x while-loop");
			a++;
		}
		
		int b = 0;
		do {
			System.out.println("5x do-while-loop");
			b++;
		}while(b<5);
	}

}
