package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeData 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../SMproject/File.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fw);
		b.write("I am the first line");
		b.newLine();
		b.write("I am the second line");
		b.close();
	}
}
