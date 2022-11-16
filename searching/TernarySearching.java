package searching;

import java.util.Scanner;

public class TernarySearching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(search(arr ,n));
	}
	public static int search( int[] arr , int n) {
		int low = 0; 
		int high = arr.length-1;
		while(low<=high) {
			int mid1 = low +(high-low)/3;
			int mid2 = high -(high-low)/3;
			if(arr[mid1]==n) {
				return mid1;
			}
			if(arr[mid2]==n) {
				return mid2;
			}
			if(n<arr[mid1]) {
				high = mid1-1;
			}else if(n>arr[mid1] && n<arr[mid2]) {
				low = mid1+1;
				high = mid2-1;
			}else {
				low = mid2+1;
			}
		}
		return -1;
	}
}
