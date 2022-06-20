package test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import apiutils.CreateAPI;

public class VerifyGetMethod extends CreateAPI
{
	@Test(priority=1)//ac to priority it will exicute///default it will exicute 1st and alphatical wise nxt
	public void TestGetMethod() 
	{
		CreateAPI obj1 = new CreateAPI();
		obj1.getMethod();
	}
	@Test
	public void TestPostMethod1() throws FileNotFoundException
	{
		CreateAPI obj2 = new CreateAPI();
		obj2.PostMethod1();
	}
	@Test(enabled = false)//not exicuting this
	public void TestDeleteMethod()
	{
		CreateAPI obj3 = new CreateAPI();
		obj3.getMethod();
	}
}
