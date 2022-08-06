package org.testing.utilities;

import org.apache.log4j.Logger;

public class logsCapture 
{
	public static void takeLogs(String classname, String msg)
	{
		Logger L=Logger.getLogger(classname);
		L.info(msg);
	}
}
