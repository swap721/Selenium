package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../SMproject/File.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.print((char)a);
		}
	}
}
