package searching;

import java.util.Scanner;

public class LastOccurrenceNaive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] arra = new int[] {1,2,2,2,3,4,5,6,6,6,8,9,10,11,12};
		System.out.println(lsOccu(arra , n));
	}
	public static int lsOccu(int[] arr , int n) {
		for(int i = arr.length-1; i>=0; i--) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
}
