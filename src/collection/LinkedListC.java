package collection;

import java.util.LinkedList;

public class LinkedListC {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("hen");
		ll.add('G');
		ll.add("45.8");
		ll.add(true);
		ll.add(null);
		ll.add(345);
		ll.add(null);
		ll.add("hen");
		
		System.out.println(ll);
		ll.add("goat");
		System.out.println(ll);
		ll.add(3,'D');
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(4));
		System.out.println(ll.contains(45));
		System.out.println(ll.contains(345));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		System.out.println(ll);//Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(ll.poll());
		System.out.println(ll);
		ll.pollLast();
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);

	}

}
