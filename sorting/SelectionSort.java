package sorting;

public class SelectionSort{
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,7,9,8,1,2,3,4};
		for( int i = 0; i<arr.length; i++) {
			int min = arr[0];
			for( int j = 1; j<arr.length-1; j++) {
				if(min>arr[j]) {
					int tempt = min;
					min = arr[j];
					arr[j]= tempt;
				}
			}
		}
		for( int i:arr) {
			System.out.print(i+" ");
		}
	}
}