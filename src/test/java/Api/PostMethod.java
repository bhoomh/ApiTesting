package Api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class PostMethod {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		RestAssured.given().baseUri("https://reqres.in/api/users")
		.body(getFileContent("C:\\Capgemini\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Restful-CreateBooking"))
		.header("Accept","application/json").header("Accept","application/json").when().log().all()
		.post("api/users").then().log().all();
		
	}
		
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
	File file = new File(filePath);
	Scanner sc =new Scanner(file);
	sc.useDelimiter("\\z");

	return sc.next();

	}
	}


