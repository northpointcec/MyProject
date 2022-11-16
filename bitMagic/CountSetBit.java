package bitMagic;

import java.util.Scanner;

public class CountSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		sc.close();
		System.out.println(countSet(n));
	}
	public static int countSet( int n) {
		int count = 0;
		while(n>0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
}
