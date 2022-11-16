package ajay;

public class VarArgas {

	public static void main(String... args) {
		System.out.println(sum(10));
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
	}
	public static int sum(int... n) {
		int add = 0;
		for(int i = 0; i<n.length;i++) {
			add = add +n[i];
		}
		return add;
	}
}
