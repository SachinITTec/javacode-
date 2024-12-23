package CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object val=i.next();
			System.out.println(val);
		
		}
		i.remove();
		System.out.println(al);
		
	}

}
