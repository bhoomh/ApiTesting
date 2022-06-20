package StepDef;

import java.io.FileNotFoundException;

import apiutils.CreateAPI;
import io.cucumber.java.en.Then;

public class VerifyCreateSteps 
{
	@Then("create booking id")
	public void create_booking_id() throws FileNotFoundException
	{
		CreateAPI obj2 = new CreateAPI();
		obj2.PostMethod1();
	}
}
