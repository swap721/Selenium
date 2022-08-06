package DifferentTasks;

public class OptionalArgument 
{
	public void optional(Object... s)
	{
		System.out.println(s);
	}
	
	
	public static void main(String[] args) 
	{
		OptionalArgument o=new OptionalArgument();
		o.optional();
		o.optional(122);
		o.optional("Swapnil");
		o.optional("Swapnil",1233,445);
	}
}
