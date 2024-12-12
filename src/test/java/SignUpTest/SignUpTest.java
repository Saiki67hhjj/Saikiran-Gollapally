package SignUpTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SignUpTest  extends SignUpPage 
{
	SignUpPage sp;
	@Given("I am on the sign-up page")
	public void navigateToSignup() 
	{
		sp =new SignUpPage();
		sp.SignupPage1();
		  // Add navigation steps
	}

	@When("I enter valid details")
	public void enterDetails() 
	{
	    // Use SignupPage methods to fill the form
		
		
		sp.enterEmail("gsaikiran913@gmail.com");
		sp.enterPassword("Hema@12345");
	}
	@When("I click on submit")
	public void Submit() 
	{
	    // Use SignupPage methods to fill the form
		sp.ClickSubmit();	
	}
	
	@Then("I should see a confirmation message")
	public void verifySignup() 
	{
	   boolean status = sp.confirmation();
	   
	   if(status==true)
		{
			System.out.println("Sign in completed");
		}
		else
		{
			System.out.println("Wrong Credentials entered by user");
		}
		
	}
}
