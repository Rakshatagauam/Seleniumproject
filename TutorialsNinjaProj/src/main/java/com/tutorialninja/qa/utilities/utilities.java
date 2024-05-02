package com.tutorialninja.qa.utilities;

import java.util.Date;

public class utilities {

	public static String generateemailwithtimestamp()
	{
		Date date= new Date();
		String timestamp= date.toString().replace(" ", "_").replace(":", "_");
		return "cooln0601"+timestamp+"gmail.com";
	}
	
}
