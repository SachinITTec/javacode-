package Exception;



//try with the resources --------
//import java.io.File;
//import java.io.FileWriter;
//
//public class ExceptionCode {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try(FileWriter f=new FileWriter("C:\\FileHandling\\Demo1233\\RevisionToday.txt"))
//		{
//			String data="Sachin";
//			f.write(data);
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("The Exception is"+e);
//		}
//		
//	}
//
//}

//User Defined Exception

/*
class VoterException extends ArithmeticException
{
	public String getErrorMsg()
    {  return "you are not eligible don't try wrong activity";
    }

}

class VerifyVoter
{
	void Verifyage(int age)
	{
		if(age<18)
		{
		      VoterException ve=new VoterException();
		      throw ve;
		}
		else
		{
			System.out.println("You are the valid voter");
		}
	}
}
public class ExceptionCode
{
	public static void main(String[] args)
	{
		try
		{
			VerifyVoter v=new VerifyVoter();
			v.Verifyage(17);
		}
		catch(VoterException ve)
		{
			System.out.println(ve.getErrorMsg());
		}
		
	}
}
*/









