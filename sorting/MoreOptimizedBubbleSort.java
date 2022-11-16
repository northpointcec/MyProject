package sorting;

public class MoreOptimizedBubbleSort {
 
	public static void main(String[] args) {
		boolean swap ;
		int[] arr = new int[] {7,5,8,9,4,6,1,3,2};
		for(int i = 0; i<arr.length-1; i++) {
			swap = false;
			for( int j = 0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j +1] = temp;
					swap = true;
				}
			}
			if(swap==false) {
				break;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
