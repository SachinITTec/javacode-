package CollectionInterface;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


 class EmployeeNew {
	private int id;

	public EmployeeNew() {
		
	}
	public EmployeeNew(String name,int id,int sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	private String name;
	private int sal;

}
 
class sortbyid implements Comparator
{
	

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeNew e1=(EmployeeNew)o1;
		EmployeeNew e2=(EmployeeNew)o2;
		
		if(e1.getId()>e2.getId())
		{ 
			return 1;
		}
		else if(e1.getId()<e2.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}

class sortbysal implements Comparator
{
	
	public int compare(Object o1,Object o2)
	{
		EmployeeNew e3=(EmployeeNew)o1;
		EmployeeNew e4=(EmployeeNew)o2;
		
		if(e3.getSal()>e4.getSal())
		{
			return 1;
		}
		else if(e3.getSal()<e4  .getSal())
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

}
class sortbyname implements Comparator<EmployeeNew>
{
	 public int compare(EmployeeNew e1, EmployeeNew e2) {
	        return e1.getName().compareTo(e2.getName());
	    }
}
public class ComparatorInterface {

	
			public static void main(String[] args) {
				
				
				EmployeeNew emp1 = new EmployeeNew("aBC",1,1000);
				EmployeeNew emp2 = new EmployeeNew("bNO",2,6000);
				EmployeeNew emp3 = new EmployeeNew("dQR",6,3000);
				EmployeeNew emp4 = new EmployeeNew("cTV",4,9000);
				EmployeeNew emp5 = new EmployeeNew("mYZ",5,500);
				
				
				ArrayList al = new ArrayList();
				al.add(emp1);
				al.add(emp2);
				al.add(emp3);
				al.add(emp4);
				al.add(emp5);
				
				
				for(Object obj:al)
				{
					EmployeeNew e=(EmployeeNew)obj;
					
					System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
				}
				sortbyid s=new sortbyid();
				Collections.sort(al,s);
				
				System.out.println("Sort the by using id ===========");
				for(Object obj:al)
				{
					EmployeeNew e=(EmployeeNew)obj;
					
					System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
				}
						
				
				sortbysal s1=new sortbysal();
				Collections.sort(al,s1);
				
				System.out.println("Sort the by using salary=============");
				for(Object obj:al)
				{
					EmployeeNew e=(EmployeeNew)obj;
					
					System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
				}
				
				System.out.println("Sort the by using name=============");
				
				sortbyname s2=new sortbyname();
				Collections.sort(al,s2);
				
				for(Object obj:al)
				{
					EmployeeNew e=(EmployeeNew)obj;
					
					System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
				}
			}

		

	}


