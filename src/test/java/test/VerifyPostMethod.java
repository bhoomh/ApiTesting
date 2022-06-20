package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.Test;

import apiutils.CreateAPI;
import io.restassured.RestAssured;

public class VerifyPostMethod extends CreateAPI 
{

	@Test(priority=2)
	public void TestPostMethod() throws FileNotFoundException
	{
		CreateAPI obj2 = new CreateAPI();
		obj2.PostMethod1();
	}

}
