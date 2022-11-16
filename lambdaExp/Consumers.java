package lambdaExp;

import java.util.ArrayList;

import java.util.Collections;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(9);
		l.add(7);
	    l.add(1);
	    l.add(2);
	    Collections.sort(l);
	    Consumer<Integer> number = (n)->System.out.print(n+" ");
	    l.forEach(number);
	}
}
