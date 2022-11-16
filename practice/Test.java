package practice;

import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Solution obj = new Solution();
		System.out.println(obj.add(a , b));
		sc.close();
	}
}
class Solution{
	public int add ( int a , int b) {
		int c = a+b;
		return c;
	}
}