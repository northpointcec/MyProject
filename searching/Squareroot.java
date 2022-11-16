package searching;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(sqrt(n));
	}
	public static int sqrt( int n) {
		int low =1 , high = n, ans =-1;
		while(low<=high) {
			int mid = (low+high)/2;
			int sq = mid*mid;
			if(sq == n) {
				return mid;
			}else if(sq>n) {
				high = mid-1;
			}else {
				low = mid+1;
				ans = mid;
			}
		}
		return ans;
	}
}
