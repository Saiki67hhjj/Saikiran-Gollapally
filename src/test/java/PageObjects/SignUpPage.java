package PageObjects;

import static PageObjects.SignUpPage.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class SignUpPage 
{
	   static WebDriver driver;
	

		    public static void SignupPage1() 
		    {
		    	 driver =new ChromeDriver();
		    	 driver.get("https://magento.softwaretestingboard.com/");
		    	 
		    	 driver.manage().window().maximize();
		    }

		    public void enterEmail(String email) 
		    {
		    	driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		        driver.findElement(By.id("email")).sendKeys(email);
		    }

		    public void enterPassword(String password) {
		        driver.findElement(By.id("pass")).sendKeys(password);
		    }
		  public void ClickSubmit()
		  {
		    driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
		  }
		  
		  public boolean confirmation()
		  {
			  boolean displayed = driver.findElement(By.xpath("//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, Sai kiran G!']")).isDisplayed();
			  
			return displayed;
			  
			 
		  }
}




