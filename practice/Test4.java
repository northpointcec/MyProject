package practice;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int[][] matrix = {{10, 20, 30, 40},
	             {15, 25, 35, 45},
	             {27, 29, 37, 48},
	             {32, 33, 39,50}};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0; 
		int c = matrix[0].length-1;
		while((r+1)!=(matrix.length) || c>=0 || matrix[r][c]!=n) {
			if(matrix[r][c]==n) {
				System.out.println(r+" "+c);
				break;
			}
			if(n>matrix[r][c]) {
				r++;
			}
			if(n<matrix[r][c]) {
				c--;
			}
			
		}
		sc.close();
	
	}
}
