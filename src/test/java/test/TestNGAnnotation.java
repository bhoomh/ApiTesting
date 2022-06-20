package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGAnnotation {

	@BeforeMethod
	public void openURL()
	{
		System.out.println("URL should open");
	}
	
	@AfterMethod
	public void closeURL()
	{
		System.out.println("closing the browser");
	}
}
