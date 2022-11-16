package ajay;

public class Matrix {

	public static void main(String[] args) {
		int[][][] array = { { {0},{0,1},{0,1,2} },{ {0},{0,1},{0,1,2},{0,1,2,3} } };
		for(int[][] a:array) {
			for(int[] b:a) {
				for(int c:b) {
					System.out.print(c+" ");
				}
				System.out.println();
			}
		}
	}
}
