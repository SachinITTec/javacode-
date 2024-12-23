package CollectionInterface;

import java.util.Collections;
import java.util.Vector;

public class VectorcodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(10);
		v.add(30);
		v.add(20);
		v.add(40);
		v.add(50);
		
		
		int max=(int) Collections.max(v);
		int min=(int)Collections.min(v);
		
		
		
		System.out.println("Max..."+max);
		System.out.println("Min..."+min);
		
		
		Object number=0;
		
		for(Object o:v)
		{
			
			
			if((int)number<(int)o)
			{
				number=o;
			}
			
		}
		System.out.println("The max number is "+number);
		
		int smallest=(int) v.get(0);
		
		for(int i=0;i<v.size();i++)
		{
			if((int)v.get(i)<smallest)
			{
				smallest=(int)v.get(i);
			}
		}
		System.out.println("The minimum number is "+smallest);
	}

}
