package CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
public class collectionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al.size());

		boolean b = al.isEmpty();
		if (b) {
			System.out.println("Empty Collection");
		} else {
			System.out.println("Not Empty Collection");
		}

		boolean b1=al.contains(30);
		if(b1)
		{
			System.out.println("It contains the element");
		}
		else
		{
			System.out.println("It does not contain the element");
		}
		
		boolean b2=al.add(100);
		if(b2)
		{
			System.out.println("Number Added");
		}
		else
		{
			System.out.println("Number is not added");
		}
		
		boolean b3=al.containsAll(al);
		System.out.println(b3);
		
		ArrayList al1=new ArrayList();
		al1.add(50);
		al1.add(60);
		al1.add(70);
		al1.add(80);
		boolean b4=al.addAll(al1);
		if(b4)
		{
			System.out.println(al);
		}
		
		
		al.clear();
		System.out.println(al);
	}

}
