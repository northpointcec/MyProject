package lambdaExp;

import java.util.ArrayList;

import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("ajay");
		l.add("raj");
		l.forEach((la)-> System.out.println(la));
	}
}
