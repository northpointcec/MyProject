package practice;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		int[][] matrix =  {{1, 2, 3, 4},
		         {5, 6, 7, 8},
		         {9, 10, 11, 12},
		         {13, 14, 15,16}};
		int n = matrix.length;
		int m = matrix[0].length;
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        int r = 0 , c = 0;
	        
	            for( int i = 0; i<m; i++){
	                list.add(matrix[0][i]);
	                c++;
	            }
	            if(c==m){
	                for( int i = 1; i<n; i++){
	                    list.add(matrix[i][m-1]);
	                    r++;
	                }
	            }
	            if(c==m && (r+1)==n){
	                for( int i = m-2; i>=0; i--){
	                    list.add(matrix[n-1][i]);
	                    c--;
	                }
	            }
	            if ((c-1)==0){
	                for( int i = n-2; i>0; i--){
	                    list.add(matrix[i][0]);
	                }
	            }
	            System.out.println(list);
	}
}
