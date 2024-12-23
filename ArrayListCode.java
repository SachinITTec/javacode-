package CollectionInterface;

import java.util.ArrayList;

public class ArrayListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		
		ArrayList l1=new ArrayList(l);
//		l1.add(22);
//		l1.add(23);
		
		
		//method of the list and the arraylist 
		l.add(2, 1);  
		System.out.println(l);
		
		System.out.println(l.get(1));
		
		System.out.println(l.remove(2));
		System.out.println(l);
		
		int b=l.indexOf(10);
		System.out.println(b);
		
		int b1=l.lastIndexOf(10);
		System.out.println(b1);
		
	}

}
