package array;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int[] arr = new int[] {0,0,0,10,0};
		int count = 0;
		
		for( int i = 0; i<arr.length; i++) {
		
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] =arr[count];
				arr[count] =temp;
				count++;
			}
		}
		for( int i:arr) {
			System.out.print(i+" ");
		}
	}
}
