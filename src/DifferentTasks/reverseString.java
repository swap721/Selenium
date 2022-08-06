package DifferentTasks;

public class reverseString 
{
	public static String reverseString(String str){
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
		}
	public static void main(String[] args) 
	{
		reverseString r=new reverseString();
		String s=r.reverseString("Swapnil Matkar");
		System.out.println(s);
		}
}
