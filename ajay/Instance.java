package ajay;

public class Instance {
	
	int a;

	public static void main(String[] args) {
	
		Instance t = new Instance();
		System.out.println(t.a);
		t.fun();
		
	}
	public void fun(){
		System.out.println(a);
	}
}
