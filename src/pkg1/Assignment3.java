package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3 
{
	public void WriteData(int x) throws IOException
	{
		File f=new File("../SMproject/File2.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner sa=new Scanner(System.in);
		System.out.println("Please write text");
		String s1=sa.next();
		bw.write("s1");
		
		//System.out.println(s1);
		
		
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		Assignment3 a3=new Assignment3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter end row No");
		int h1=sc.nextInt();
		//System.out.println("Please write text");
		//String s1=sc.next();
		a3.WriteData(h1);
	}
}
