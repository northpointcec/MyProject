package lambdaExp;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Rajesh");
		l.add("Ashok");
		l.add("Anil");
		l.add("Rahul");
		l.add("Ajay");
		l.add("Raj");
		l.add("Ankit");
		l.add("Sumit");
		l.add("Prince");
		l.add("Pradeep");
		l.forEach((la)->System.out.print(l+" "));
	}
}
