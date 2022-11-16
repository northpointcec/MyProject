package searching;

import java.util.Arrays;

public class Countones {

	public static void main(String[] args) {
		int[] arr = {0,1,0,1,0,1,1,1,1,0,1,0,1,0,1,1,1,1,0};
		Arrays.sort(arr);
		System.out.println(noofones(arr));
	}
	public static int noofones(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==1) {
				return arr.length-i;
			}
		}
		return -1;
	}
}
