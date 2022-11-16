package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Tutorial {

	public static void main(String[] args) {
		//Tutorial of HashSet in java
		// Duplicates are not allowed
		// It is very efficient for insertion, deletion,searching 
		//it take constant time that is O(1)
		
		
         //insertion		
		HashSet<Integer> set = new HashSet<>();
		for( int i = 0; i<10; i++) {
			set.add(i);
		}
		
		System.out.println(set);
		
		
		//searching
		//.contains is boolean function
		if(set.contains(1)) {
			System.out.println("Element is present in the set");
		}else {
			System.out.println("Element is not present int the set");
		}
		
		
		
		//deletion
		set.remove(1);
		// .size give the size of your HashSet data structure
		System.out.println(set.size());
		
		
		
		
		//Iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
