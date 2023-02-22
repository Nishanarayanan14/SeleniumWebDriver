package reports;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Demo1.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	ExtentReports extent;
	WebDriver wd;
	ExtentTest logger;
	@BeforeTest
	public void beforeTest() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/nisha.html",true);
		extent.loadConfig(new File(System.getProperty("user.dir") +"src/test/java/extent-config.xml"));
		
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
	
}
	
  @Test
public void Login() throws InterruptedException {
	  logger=extent.startTest("Demo");
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  logger.log(LogStatus.PASS, "web page has opened");
	  Thread.sleep(3000);
	  String title =wd.getTitle();
	  logger.log(LogStatus.PASS, title);
	  Assert.assertEquals("Demo", "Demo");
	  logger.log(LogStatus.PASS, "Assert Passed");
	  Thread.sleep(3000);
	 
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  logger.log(LogStatus.PASS, "username is passed");
	  Thread.sleep(3000);
	
	 wd.findElement(By.name("password")).sendKeys("admin123");
	 logger.log(LogStatus.PASS, "password is passed");
	 Thread.sleep(3000);
	
	 wd.findElement(By.xpath("//*[@type='submit']")).click();
	 logger.log(LogStatus.PASS, "login  successfull");
	 Thread.sleep(3000);
  }
     
	
      @Test(dependsOnMethods="Login")
      
      public void logout() throws InterruptedException
      {
    	  
    wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
    logger.log(LogStatus.PASS, "clicking on the dropdown");
    Thread.sleep(3000);
    wd.findElement(By.xpath("//*[@href=\'/web/index.php/auth/logout\']")).click();
    logger.log(LogStatus.PASS, "logout");
    
    		          
    	  
      
         
 }
	 
 
              
           
 
  @AfterTest
 public void afterTest() {
	  wd.close();
	  extent.endTest(logger);
	  extent.flush();
	  extent.close();
  }
}

