package sorting;

import java.util.Arrays;

public class BuiltInSortingPrimitive {

	public static void main(String[] args) {
		int[] arr = new int[] {4,5,1,7,8,9,3,6,2};
		Arrays.sort(arr);
		for(int I:arr) {
			System.out.print(I+" ");
		}
		System.out.println();
		int[] ar = new int[] {4,5,1,7,8,9,3,6,2};
		Arrays.sort(ar , 1,5);
		for(int i:ar) {
			System.out.print(i +" ");
		}
	}
}
