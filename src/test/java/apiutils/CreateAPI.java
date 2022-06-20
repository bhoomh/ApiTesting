package apiutils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateAPI {
	@Test
	public void getMethod()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.when().log().all().get("/booking").then().log().all().assertThat();

	}
	public void PostMethod1() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://reqres.in/api/users")
		.body(getFileContent("C:\\Capgemini\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Restful-CreateBooking"))
		.header("Accept","application/json").header("Accept","application/json").when().log().all()
		.post("api/users").then().log().all();
		
		
	}

	public void deleteMethod()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").headers("Authorization","YWRtaW46cGFzc3dvcmQxMjM=] ")
		.when().log().all().delete("/api/v1/Activities").then().log().all().assertThat().statusCode(204);
	}
	
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
	File file = new File(filePath);
	Scanner sc =new Scanner(file);
	sc.useDelimiter("\\z");

	return sc.next();

	}	
}
