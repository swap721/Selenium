package org.testing.datadrivenTesting;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class facebookData 
{
	/*
	 * @Test(dataProvider="dp2") public void testcase(String s1,String s2) {
	 * System.out.println("user1 is "+s1); System.out.println("user1 is "+s2); }
	 */
	@DataProvider
	public Object[][] dp1()
	{
		Object[][] ob=new Object[3][2];
		ob[0][0]="user1";
		ob[0][1]="password1";
		
		ob[1][0]="user1";
		ob[1][1]="password1";
		
		ob[2][0]="user1";
		ob[2][1]="password1";
		
		return ob;
	}
	
	@DataProvider
	public Object[][] dp2() throws BiffException, IOException
	{
		File f=new File("C:\\Users\\hp\\OneDrive\\Documents\\SJM.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		Object[][] ob=new Object[r][c];
		
		for(int i=0;i<r;i++)//loop for rows
		{
			for(int j=0;j<c;j++)//loop for columns
			{
				Cell wc=ws.getCell(j, i);
				ob[i][j]=wc.getContents();
			}
		}
		return ob;
	}

	
}
