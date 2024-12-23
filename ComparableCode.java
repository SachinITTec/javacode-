package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;


 class Employee implements Comparable{
	private int id;

	public Employee() {
		
	}
	public Employee(String name,int id,int sal) {
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

	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		 int result = this.name.compareTo(e.name); // Compare names lexicographically
		    if (result > 0) {
		        return -1;
		    } else if (result < 0) {
		        return +1;
		    } else {
		        return 0;
		    }
		
	}
	
	
	
}

public class ComparableCode {

	
			public static void main(String[] args) {
				Employee emp1 = new Employee("nBC",1,1000);
				Employee emp2 = new Employee("lNO",2,6000);
				Employee emp3 = new Employee("aQR",3,3000);
				Employee emp4 = new Employee("STV",4,9000);
				Employee emp5 = new Employee("XYZ",5,500);
				ArrayList al = new ArrayList();
				al.add(emp1);//id ,name,sal
				al.add(emp2);
				al.add(emp3);
				al.add(emp4);
				al.add(emp5);
				System.out.println("Employee Data Before Sorting");
				for(Object obj:al) {
					Employee e=(Employee)obj;
					System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
				}
				Collections.sort(al);
				System.out.println("Display Employee Data After Sorting");
				for(Object obj:al) {
					Employee e=(Employee)obj;
					System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
				}
			}

		

	}


