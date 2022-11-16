package matrix;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] A = {{35, 1, 70, 25, 79, 59, 63}, { 65, 6, 46, 82, 28, 62,92} };
		int[][] B = { {43, 28},{ 37, 92},{5, 3},{54, 93},{83, 22},{ 17, 19 },{96, 48}};
		   Solution obj = new Solution();
		   int[][] ans = obj.mul(A, B);
		   if(ans.length==0) {
			   System.out.println(-1);
		   }else {
			   for(int[] I:ans) {
				   for(int J:I) {
					   System.out.print(J+" ");
				   }
				   System.out.println();
			   }
		   }
		  
	}
	
}
class Solution{
public int[][] mul(int[][] A ,int[][] B){
		
	 int m = A.length;
     int n = A[0].length;
     int n1 = B.length;
     int p = B[0].length;
     int[][] c = new int[m][p];
     if(n==n1){
         for( int i = 0 ; i<m; i++){
             for( int j = 0; j<p; j++){
   
                 for ( int k = 0; k<n; k++){
                     c[i][j] = c[i][j] + A[i][k]*B[k][j];
                 }
             }
         }
         return c;
     }else{
         return new int [0][0];
     }
	
	}
}
