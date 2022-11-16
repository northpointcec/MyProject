package searching;

import java.util.Scanner;

public class FirstOccurrencNavie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] arra = new int[] {1,2,2,2,3,4,5,6,6,6,8,9,10,11,12};
		System.out.println(firocc(arra , n));
	}
	public static int firocc(int[] arr , int n) {
		for( int i = 0; i<arr.length; i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
}
// Time complexity O(n)