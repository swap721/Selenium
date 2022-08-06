package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling 
{
	public static void selectionBasedUponVisibleText(String visibleText, WebElement Element)
	{
		Select s=new Select(Element);
		s.selectByVisibleText(visibleText);
	}
	public static void selectionBasedUponIndex(int index, WebElement Element)
	{
		Select s=new Select(Element);
		s.selectByIndex(index);
	}
}
