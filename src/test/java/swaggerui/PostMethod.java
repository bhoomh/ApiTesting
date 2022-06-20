package swaggerui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class PostMethod {

	public static void main(String[] args) throws FileNotFoundException {
		

		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.nets")
		.body(getFileContent("C:\\Capgemini\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\resreq-PostCreate"))
		.header("Accept","application/json").header("Accept","application/json").when().log().all()
		.post("/api/v1/Activities").then().log().all();
		
	}
		
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
	File file = new File(filePath);
	Scanner sc =new Scanner(file);
	sc.useDelimiter("\\z");

	return sc.next();

	}

}
