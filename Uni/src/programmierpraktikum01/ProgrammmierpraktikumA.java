package programmierpraktikum01;

public class ProgrammmierpraktikumA {

	public static void main(String[] args) {
		int[][] matrix = new int[7][7];
		
	}
	
	public static int[][] matrixe(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i * j;
			}
		}
		return matrix;
	}

}
