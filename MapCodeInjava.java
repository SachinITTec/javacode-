package CollectionInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;



//HahMap 
//public class MapCodeInjava {
//	public static void main(String[] args)
//	{
//		HashMap<Integer,String> m=new HashMap<Integer,String>();
//		m.put(1,"Sachin");
//		m.put(2,"Sadgir");
//		m.put(3,"Rohan");
//		
//		Set<Integer> s=m.keySet();
//		for(Integer key:s)
//		{
//			String value=m.get(key);
//			System.out.println(key+" --------->"+value);
//		}
//	}
//}


//LinkedHashMAp

//public class MapCodeInjava
//{
//	public static void main(String[] args)
//	{
//		LinkedHashMap<Integer,String> map=new LinkedHashMap();
//		map.put(1,"Sachin");
//		map.put(2,"Sadgir");
//		map.put(6,"Ramesh");
//		map.put(5,"Raja");
//		map.put(3,"Rahul");
//		
//		Set<Integer> s=map.keySet();
//		for(Integer key:s)
//		{
//			String value=map.get(key)
//			System.out.println();
//		}
//		
//	}
//}



//TreeMap
//public class MapCodeInjava
//{
//	public static void main(String[] args)
//	{
//		TreeMap<Integer,String> map=new TreeMap();
//		map.put(1,"Sachin");
//		map.put(2,"Sadgir");
//		map.put(6,"Ramesh");
//		map.put(5,"Raja");
//		map.put(3,"Rahul");
//		
//		Set<Integer> s=map.keySet();
//		for(Integer key:s)
//		{
//			String value=map.get(key);
//			System.out.println(key+"---"+value);
//		}
//		
//	}
//}


public class MapCodeInjava
{
	public static  void main(String[] args)
	{
		LinkedHashMap<Integer,String> m=new LinkedHashMap();
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter which operation you want to do:");
			System.out.println("1.Add New Element In Map:");
			System.out.println("2.search element using the get method ");
			System.out.println("3.search element using the contains key ");
			System.out.println("4:Fetch the data using the etry set:");
			System.out.println("5:Enter the key for remove the value :");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the key :");
				int key=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the value :");
				String value=sc.nextLine();
				m.put(key, value);
				break;
				
			case 2:
				
				System.out.println("Enter the key to search the value :");
				int key1=sc.nextInt();
				
				String data=m.get(key1);
				if(data!=null)
				{
					System.out.println(+key1+"  "+data);
				}
			
				break;
			case 3:
				System.out.println("Enter the key to search the element:");
				int key2=sc.nextInt();
				if(m.containsKey(key2))
				{
					System.out.println("data found");
				}
				else
				{
					System.out.println("Data not found");
				}
				break;
			
			case 4:
				Set<Map.Entry<Integer,String>> set=m.entrySet();
				for(Map.Entry<Integer, String> map:set)
				{
					System.out.println(map.getKey()+"\t"+map.getValue());
				}
			break;
			
			case 5:
				System.out.println("Enter the key to remove ");
				int key3=sc.nextInt();
				String value1=m.remove(key3);
				System.out.println(value1);
				break;
				
			default:
				System.out.println("Wrong Choice");
			}
		
			
		}while(true);
	}
}