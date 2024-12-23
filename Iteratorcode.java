package CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		for(int i=0;i<11;i++)
		{
			a.add(i);
		}
		
		Iterator i1=a.iterator();
		while(i1.hasNext())
		{
			Object i3=i1.next();
			System.out.println(i3);
		}
		i1.remove();
		System.out.println(a);
	}
}
