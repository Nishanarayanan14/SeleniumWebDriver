package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_definition {
	WebDriver wd;
			
	@Given("User should in login page")
	public void user_should_in_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	    
	}
	@When("enter the valid username {string}")
	public void enter_the_valid_username(String string) throws InterruptedException {
		 wd.findElement(By.name("username")).sendKeys(string);
		 Thread.sleep(2000);
	    
	}
	@When("enter the valid password {string}")
	public void enter_the_valid_password(String string) throws InterruptedException {
		wd.findElement(By.name("password")).sendKeys(string);
		Thread.sleep(2000);
	    
	}
	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		wd.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
	    
	}
	@Then("I should get the title {string}")
	public void i_should_get_the_title(String string) {
		Assert.assertEquals(wd.getTitle(), string);
	    
	}


}
