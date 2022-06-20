package StepDef;

import java.io.FileNotFoundException;

import apiutils.CreateAPI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGetSteps extends CreateAPI
{
	@Given("Calling Get Method")
	public void calling_get_method() {
	   CreateAPI obj=new CreateAPI();
	   obj.getMethod();
	}

	@Then("Get Executed Successfully")
	public void get_executed_successfully() 
	{
		System.out.println("Get Executed Successfully");
	    
	}
}
