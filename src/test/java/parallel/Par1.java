package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Par1 {
	WebDriver wd;
	@Parameters("mybrowser")
	@BeforeTest
	public void beforeTest(String mybrowser)
	{
		if(mybrowser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
			
		}
		
		else if(mybrowser.equalsIgnoreCase("firefox"));
		{
			WebDriverManager.chromedriver().setup();
			wd=new FirefoxDriver();
		}
	}
	
	
  @Test
public void OrangeHRM() throws InterruptedException {
	  wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@href=\'/web/index.php/auth/logout\']")).click();
  }
}
