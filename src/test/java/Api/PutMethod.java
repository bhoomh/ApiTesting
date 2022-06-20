package Api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class PutMethod {

	public static void main(String[] args) throws FileNotFoundException {
		
		RestAssured.given().baseUri("https://reqres.in/api/users/2")
		.body(getFileContent("C:\\Capgemini\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Rest-PutMethod")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=] ")
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().put("/api/users/2").then().log().all();

	}
	public static String getFileContent(String filePath) throws FileNotFoundException
	{
	File file = new File(filePath);
	Scanner sc =new Scanner(file);
	sc.useDelimiter("\\z");

	return sc.next();

	}

}
