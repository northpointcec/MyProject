package array;

import java.util.Scanner;

public class Initialization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for( int i = 0; i<n; i++) {
			int x ; 
			x = sc.nextInt();
			arr[i] = x;
		}
		sc.close();
		for( int I:arr) {
			System.out.print(I);
		}
	}
}
