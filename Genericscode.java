package CollectionInterface;

import java.util.ArrayList;
import java.util.List;

//public class Genericscode {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList l=new ArrayList();
//		l.add(10);
//		l.add(20);
//		l.add(30);
//		l.add("Sachin");
//		
//		for(Object obj:l)
//		{
//			if(obj instanceof Integer)
//			{
//				System.out.println((int)obj);
//			}
//		}
//	}
//
//}

/*
 
public class Genericscode
{
	public static void main(String[] args)
	{
		ArrayList <Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		
		int sum=0;
		for(Object obj:al)
		{
			if(obj instanceof Integer)
			{
				sum=sum+(int)obj;
			}
		}
		System.out.println(sum);
	}
}
*/

//if we want to store any type of the data then we can use the class name as the generics 
/*
class Data
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	private String name;
	private int per;
	
	public Data()
	{
		
	}
	public Data(String name,int id,int per)
	{
		this.name=name;
		this.id=id;
		this.per=per;
		
	}

}

public class Genericscode
{
	public static void main(String[] args)
	{
		ArrayList<Data> l=new ArrayList<Data>();
		l.add(new Data("sachin",1,90));
		l.add(new Data("sadgir",2,80));
		l.add(new Data("Rama",3,60));
		l.add(new Data("Ramesh",4,40));
		l.add(new Data("Riyansh",5,30));
		
		for(Data d:l)
		{
			System.out.println(d.getId()+" "+d.getName()+" "+d.getPer());
		}
		
	}
}
*/


//class with the generics
/*
class Test<E>
{
	void show(E e)
	{
		System.out.println(e);
	}
}
public class Genericscode
{
	public static void main(String[] args)
	{
		Test<Integer> t=new Test<Integer>();
		t.show(10);
		t.show(200);
		t.show(300);
		t.show(400);
		
		
		
	}
}
*/



/*
 * Interface with the generics if declare the interface datatype as the E 
 * it can be based on the element type 


interface data<E>
{
	void setdata(E radius);
	void findarea(E area);
}
class setdata implements data<Integer>
{
	public void setdata(Integer radius)
	{
		 System.out.println(radius);
	}

	@Override
	public void findarea(Integer area) {
		// TODO Auto-generated method stub
		
	}
}
class finddata implements data<Float>
{
	public void findarea(Float area)
	{
		System.out.println(area);
	}

	@Override
	public void setdata(Float radius) {
		// TODO Auto-generated method stub
		
	}
}
public class Genericscode
{
	public static void main(String[] args)
	{
		setdata s=new setdata();
		s.setdata(100);
		
		finddata f=new finddata();
		f.findarea(23.f);
		
	}
}
 */


//in the wild card generics we have to take the format as the 
//show(List<?> list) in the parent class and then we can take the List with the any type of the 
//refernce data type while creating the list and then create the object of the main class and call the 
//method by the reference of that class 
/*
class ABC 
{
	void show(List<?> list)
	{
		for(Object o:list)
		{
			System.out.println("The list is "+o);
		}
	}
}
class Genericscode
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		ABC a=new ABC();
		a.show(l);
		
		ArrayList<Float> l1=new ArrayList<Float>();
		l1.add(200.f);
		l1.add(300.f);
		l1.add(400.f);
		
		a.show(l1);
		
	}
}

*/


//Bounded Generics 
/*
 * In the wild card generics we can take the change the datatype according to the 
 * requirement and the data type can be chnages in the collection which are present in the parent class
 * and while declaring method in the child class we should inherit the wrapper class using wildcard in the method 
 
class simple
{
	void show(List<? extends Number> list )
	{
		for(Object o:list)
		{
			System.out.println(o);
		}
	}
}
class Genericscode
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		
		simple s=new simple();
		s.show(l);
		
		ArrayList<Float> l2=new ArrayList<Float>();
		l2.add(null);
	}
	
}
*/


