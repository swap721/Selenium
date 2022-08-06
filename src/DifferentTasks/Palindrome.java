package DifferentTasks;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter No : ");
		int number=s.nextInt();
		int oldnumber=number;
		int sum=0;
		while(number>0)
		{
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		if(oldnumber==sum)
		{
			System.out.println("It's a palindrome number");
		}
		else
		{
			System.out.println("It's not a palindrome number");
		}
	}
}
