package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.hooks;

public class stepdefination {
	
	
	WebDriver driver = hooks.driver;
	
	@Given("^user should launch browser$")
	public void user_should_launch_browser()  {
	System.out.println("hello");
	    
	}

	@Given("^click on signup link$")
	public void click_on_signup_link() throws InterruptedException  {
		driver.findElement(By.partialLinkText( "Sign up" ) ).click();
		Thread.sleep(3000);
	    
	}

	@When("^enter mandaroty signup details$")
	public void enter_mandaroty_signup_details()  {
		driver.findElement(By.xpath("//input[@id= 'registration_firstname']")).click();
		driver.findElement(By.xpath("//input[@id= 'registration_firstname']")).sendKeys("Apple");
		
		driver.findElement(By.xpath("//input[@id= 'registration_lastname']")).click();
		driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys("Apple");	
		driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys("Apple@mail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("App");
		driver.findElement(By.xpath("//input[@name ='pass1']")).sendKeys("123134");
		driver.findElement(By.xpath("//input[@name ='pass2']")).sendKeys("123134");
		driver.findElement(By.xpath("//button[@id='registration_submit']")).submit();
	    
	}

	@When("^click on Register button$")
	public void click_on_Register_button()  {
		driver.findElement(By.xpath("//button[@id = 'registration_submit' ] ")).submit();
	    
	}

	@Then("^confirmation message displays$")
	public void confirmation_message_displays()  {
		System.out.println(driver.findElement(By.xpath("//div[@class ='col-xs-12 col-md-12']")).getText());
	    
	}
	@Given("^: click on Drop dron$")
	public void click_on_Drop_dron()  {
		driver.findElement(By.xpath("//a[@class ='dropdown-toggle']")).click();

	}

	@Given("^Verify Name$")
	public void verify_Name()  {
	    
	}

	@Given("^Click on Inbox$")
	public void click_on_Inbox()  {
	    
	}

	@Then("^Indox will be opened$")
	public void indox_will_be_opened() {

	}


}
