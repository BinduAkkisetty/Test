package JavaOopsConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(101);
		set.add("bindu");
		set.add(30000);
		set.add('f');
		set.add('f');
		System.out.println(set.size());
		System.out.println(set);
		//Iterator<Integer>iterator=set.iterator();
		
		TreeSet<Integer> nset=new TreeSet<Integer>();
		nset.add(10);
		nset.add(2);
		nset.add(5);
		nset.add(20);
		nset.add(5);
		System.out.println(nset.size());
		System.out.println(nset);
		Iterator<Integer>iterator=nset.iterator();
		while(iterator.hasNext());
		{
			Integer next=iterator.next();
			System.out.println(next);
		}
		
		
		//hashset will retrieve values in any order
		//linkedhashset will retrieve values like the way hey are inserted
		//treeset will retrieve in sorted order
		
		
		
		

	}

}
