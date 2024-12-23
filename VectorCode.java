package CollectionInterface;

import java.util.Vector;

public class VectorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v);
		//the method of the vector class
		v.add(4,700);
		v.add(5,800);
		
		
		v.addElement(100);
		System.out.println(v);
		
		//2 to remove the elements
	
		boolean removeelement=v.removeElement(10);
		if(removeelement) {
			System.out.println(v);
		}
		//here in this method use the index as the parameter 
		v.removeElementAt(2);
		System.out.println(v);
		
		
		//retrive the elements
		
		System.out.println(v.get(0));
		
		System.out.println(v.elementAt(4));
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		
	}

}
