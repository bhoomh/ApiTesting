package restfulbooking;

import io.restassured.RestAssured;

public class GetMethod {

	public static void main(String[] args) 
	{
		
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
		.when().log().all().get("/booking").then().log().all().assertThat();

	}

}
