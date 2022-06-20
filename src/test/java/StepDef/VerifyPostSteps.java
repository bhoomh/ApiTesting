package StepDef;

import java.io.FileNotFoundException;
import apiutils.CreateAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPostSteps 
{
	@Given("calling Post method")
	public void Calling_Post_Method() throws FileNotFoundException
	{
		CreateAPI obj2 = new CreateAPI();
		obj2.PostMethod1();
	}
	@Then("executed sucessfully")
	public void execute_successfully()
		{
			System.out.println("Post executed Successfully");
		}
	}


