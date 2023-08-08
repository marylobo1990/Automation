package tests;

import org.testng.annotations.Test;

import pages.Etoileitem;


public class Etoileitemtest extends BaseclasE{
	
	@Test
	public void testshop()
	{
		
		Etoileitem ob4=new Etoileitem(driver);
		ob4.select();
		ob4.addtocart();
	
		
		
		
	}

}
