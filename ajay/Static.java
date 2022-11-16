package ajay;

public class Static {

	static int a;
	
	public static void main(String[] args) {
		System.out.println(a);
		Static s = new Static ();
		s.m1();
	}
	public void m1() {
		System.out.println(a);
	}
}
