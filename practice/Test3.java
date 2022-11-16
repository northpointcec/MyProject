package practice;

public class Test3 {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4},
	              {5, 6, 7, 8},
	              {9, 10, 11, 12},
	              {13, 14, 15,16}};
		     int n = matrix.length;
	        int m = matrix[0].length;
	        int[][] temp  = new int[n][1];
	        for( int i = 0; i<n; i++){
	            temp[i][0] = matrix[i][0];
	            
	        }
	       
	        for( int i = 0; i<n; i++){
	            matrix[i][0] = matrix[i][m-1];
	        }   
	        for( int i = 0; i<n; i++){
	            matrix[i][m-1] = temp[i][0];
	        }
	    
	}
}
