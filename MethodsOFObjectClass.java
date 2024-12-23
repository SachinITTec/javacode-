package CollectionInterface;



/*
 * Cloning of the object using the clone method
 */
//
//class Cube implements Cloneable
//{
//	int no;
//	void setValue(int no)
//	{
//		this.no=no;
//	}
//	
//	public void showCube()
//	{
//		System.out.println("The Cube is "+no*no*no);
//	}
//	
//	public Cube getInstance() throws CloneNotSupportedException 
//	{
//		Object obj=this.clone();
//		return (Cube)obj;
//	}
//}
//
//
//public class MethodsOFObjectClass {
//
//	public static void main(String[] args) throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		Cube c1=new Cube();
//		c1.setValue(4);
//		c1.showCube();
//		System.out.println(c1.hashCode());
//		Cube c2=c1.getInstance();
////		c2.setValue(10);
//		c2.showCube();
//		System.out.println(c2.hashCode());
//	}
//
//}



//The clone method of the object class 
/*
 * 


class Cube implements Cloneable
{
	int no;
	void setValue(int no)
	{
		this.no=no;
	}
	
	public void showCube()
	{
		System.out.println("The Cube is "+no*no*no);
	}
	
	public Object clone() throws CloneNotSupportedException 
	{
		
		return super.clone();
	}
}


public class MethodsOFObjectClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Cube c1=new Cube();
		c1.setValue(4);
		c1.showCube();
		System.out.println(c1.hashCode());
		Cube c2=(Cube) c1.clone();
//		c2.setValue(10);
		c2.showCube();
		System.out.println(c2.hashCode());
	}

}
 */

//The initializer 1)static 2)instance
class initializaerr
{
	static
	{
		System.out.println("I am the static initializer");
	}
	
	{
		System.out.println("I am the instance initializer");
	}
	
	initializaerr()
	{
		System.out.println("I am in the constructor");
	}
	
}


class MethodsOFObjectClass
{
	public static void main(String[] args)
	{
		initializaerr i=new initializaerr();
		
	}
}






