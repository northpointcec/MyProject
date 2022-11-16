package searching;

import java.util.Scanner;

public class BinarySearchIterative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Element to be searched
		int n = sc.nextInt(); 
		sc.close();
		//The necessary condition for the binary search is Array must be sorted
		
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print(binSearch(array , n));
		
	}
	public static int binSearch(int[] array , int n) {
		int low = 0; 
		int high = array.length-1;
		while(low<=high) {
			int mid = ( high + low)/2;
			if(array[mid] == n) {
				return mid;
			}else if(n > mid ) {
				low = mid +1;
			}else {
				 high = mid -1;
			}
		}
		return -1;
	}
}
//it takes the time complexity of O(logn)
// space complexity of O(1)
