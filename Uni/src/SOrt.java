
public class SOrt {
	static String arr[] = {
			"Now", "is", "the", "time", "for", "all", "good", "men",
			"to", "come", "to", "the", "aid", "of", "their", "country",
			"Zoo", "Klaus", "A", "Z", "a", "z"
	};
	public static void main(String args[]) {
		for(int j = 0; j < arr.length; j++) {
			for(int i = j + 1; i < arr.length; i++) {
				if(arr[i].compareTo(arr[j]) < 0) {
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			//System.out.println(arr[j]);
		}
	System.out.println("a".compareTo("Z"));
	System.out.println("a".compareTo("z"));
	}
}