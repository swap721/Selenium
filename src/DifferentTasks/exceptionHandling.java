package DifferentTasks;

public class exceptionHandling 
{
	public static void main(String[] args) 
	{
		System.out.println("first line");
		System.out.println("second line");
		try
		{
		int a=10/0;
		System.out.println("Inside try block");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally line");
		}
		System.out.println("last line code");
	}
}
