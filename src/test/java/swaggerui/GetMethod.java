package swaggerui;

import io.restassured.RestAssured;

public class GetMethod {

	public static void main(String[] args) 
	{
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.when().log().all().get("/api/v1/Activities").then().log().all().assertThat();


	}

}
