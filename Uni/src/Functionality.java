public class Functionality {

	public static int[][] insertionSort(int[] a) {
		if(a==null) {
			return null;
		}else {
			int[][] sorted = new int[a.length][a.length];
			sorted[0]=a.clone();
			for(int i=1;i<a.length;i++) {
				sorted[i] = sorted[i-1].clone();
				for(int j=0;j<i;j++) {
					if(sorted[i][i]<sorted[i][j]) {
						int swap = sorted[i][i];
						sorted[i][i] = sorted[i][j];
						sorted[i][j] = swap;
					}
				}
			}
			return sorted;
		}
	}
	
}