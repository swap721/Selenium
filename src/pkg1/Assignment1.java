package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;




public class Assignment1 
{
	public void ReadDataBasedUponRowNo(int a) throws IOException
	{
		File f=new File("../SMproject/File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String s;
		
		
		int r=0;
		while((s=b.readLine())!=null)
		{
			r=r+1;
			if(r==a)
			{
				
				System.out.println(s);
				
				
				
			}
					
			
		}
		
		
		
	}
	public static void main(String[] args) throws IOException 
	{
		Assignment1 x=new Assignment1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Row No");
		int p=sc.nextInt();
		x.ReadDataBasedUponRowNo(p);
	}
}
