package CollectionInterface;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		for(int i=0;i<10;i++)
		{
			v.add(i);
		}
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Object obj=e.nextElement();
			System.out.println(obj);
		}
	}
	

}
