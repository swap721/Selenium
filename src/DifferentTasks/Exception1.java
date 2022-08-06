package DifferentTasks;

public class Exception1 
{
	public static void main(String[] args) 
	{
		System.out.println("first line");
		System.out.println("second line");
		try
		{
		int a=10/0;
		System.out.println("Inside try block");
		try
		{
			int b=0/9;
		}
		catch(Exception t)
		{
			t.printStackTrace();
		}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("last line code");
	}
}
