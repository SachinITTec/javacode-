package CollectionInterface;

import java.util.Stack;

public class StackCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		for(int i=0;i<10;i++)
		{
			s.add(i);
		}
		
		
		s.pop();
		System.out.println(s);
		
		s.push("sachin");
		System.out.println(s);
		
		
		System.out.println(s.peek());
		
		boolean b=s.empty();
		if(b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println(s.search("sachin"));
	}

}
