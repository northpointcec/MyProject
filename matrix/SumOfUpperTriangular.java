package matrix;

public class SumOfUpperTriangular {

	public static void main(String[] args) {
		int[][] arr = { { 1,2,3,4},
				        { 5,6,7,8},
				        { 9,10,11,12},
				        { 13,14,15,16}
		               };
		int sum = 0;
		
		for( int i = 0; i<arr.length; i++ ) {
			for( int j = 0; j<arr.length; j++) {
				if( i==j || j>i) {
					sum = sum +arr[i][j];
				}
			}
		}
		int sum1 =0;
		for( int i = 0; i<arr.length; i++ ) {
			for( int j = 0; j<arr.length; j++) {
				if( i==j || j<i) {
					sum1 = sum1 +arr[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
