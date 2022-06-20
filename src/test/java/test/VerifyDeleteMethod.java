package test;

import org.testng.annotations.Test;

import apiutils.CreateAPI;

public class VerifyDeleteMethod  extends CreateAPI
{
	@Test(priority=2)
	public void TestDeleteMethod()
	{
		CreateAPI obj3 = new CreateAPI();
		obj3.getMethod();
	}
}
