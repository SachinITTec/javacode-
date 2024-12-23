package CollectionInterface;

import java.util.LinkedList;

public class LinkedlistCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		System.out.println(l);
		
		//method of the linkedlist
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//the method to add at the first and the last 
		l.addFirst(100);
		l.addLast(300);
		System.out.println(l);
		
		//the method to remove the first and the last element 
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
	}

}
