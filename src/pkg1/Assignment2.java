package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;





public class Assignment2 
{
	public void ReadDataOfRange(int a,int b) throws IOException
	{
		File f=new File("../SMproject/File2.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b1=new BufferedReader(fr);
		String st;
		for(a=1;a<=b;a++)
			{
				st=b1.readLine();
				System.out.println(st);
			}
	}
	public static void main(String[] args) throws IOException 
	{
		Assignment2 a2=new Assignment2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter start row No");
		int p=sc.nextInt();
		System.out.println("Please enter End Row No");
		int q=sc.nextInt();
		a2.ReadDataOfRange(p, q);
	}
}
