package sorting;

public class MergeSortEfficient {

	public static void main (String[] args) {
		int[] a = {2,5,7,8,9};
		int[] b = {3,4,6,10,11,12};
		mergeSort(a , b);
		
	}
	public static void mergeSort( int[] a , int[] b) {
		int i =0, j =0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				System.out.print(a[i]+" ");
				i++;
			}else {
				System.out.print(b[j]+" ");
				j++;
			}
		}
		while(i<a.length) {
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<b.length) {
			System.out.print(b[j]+" ");
			j++;
		}
	}

}
