package CollectionInterface;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet s=new TreeSet();
		
		for(int i=0;i<11;i++)
		{
			s.add(i);
			System.out.println(i);
		}
		
		System.out.println(s.first());
		System.out.println(s.last());
		
		System.out.println(s.headSet(6));
		//return the element less than the object 
		
		System.out.println(s.tailSet(6));
		
		//In the subset we can give the two parameter inwhich it will gove the element 
		//between the first object and the second object
		System.out.println(s.subSet(5,8));
	}

}
