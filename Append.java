package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Append 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../SMproject/File.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		b.write("I am the third line");
		b.newLine();
		b.write("I am the fourth line");
		b.close();
	}
}
