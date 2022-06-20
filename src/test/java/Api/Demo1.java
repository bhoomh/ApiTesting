package Api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		//--->Post Method
		//RestAssured.given().baseUri("http://restful-booker.herokuapp.com/").body(getFileContent("C:\\Capgemini\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\CreatBooking.txt"))
		//.header("Accept","application/json").header("Accept","application/json").when().log().all().post("/booking").then().log().all();
		
		//--->Put Method
		
		/*RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.body(getFileContent("C:\\Capgemini\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\put-UpdateBooking")).header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=] ")
		.header("Accept","application/json").header("Content-Type","application/json")
		.when().log().all().put("/booking/115").then().log().all();	*/
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
				.when().log().all().get("/api/v1/Activities").then().log().all().assertThat();
	}

	/*private static String getFileContent(String filePath) throws FileNotFoundException
	{
	File file = new File(filePath);
	Scanner sc =new Scanner(file);
	sc.useDelimiter("\\z");

	return sc.next();

	}*/
}
