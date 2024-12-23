package CollectionInterface;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		for(int i=0;i<10;i++)
		{
			a.add(i);
		}
	
		ListIterator li=a.listIterator();
		

		while(li.hasNext())
		{
			Object o=li.next();
			System.out.println(o);
		}
		
		li.set(100);
		
		li.add(300);
		
		//the remove method is also there
		
		//boolean has
		System.out.println(a);
		
	}

}
