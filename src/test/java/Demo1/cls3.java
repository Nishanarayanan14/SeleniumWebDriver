package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class cls3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//String Actual_Title = wd.getTitle();
		//String Expected_Title = "OrangeHRM";
		//Assert.assertEquals(Actual_Title, Expected_Title);
		WebElement we1 = wd.findElement(By.xpath("//*[@class=\"oxd-input oxd-input--active\"]"));
		Assert.assertEquals(true, we1.isDisplayed());
		System.out.println("Assertion Passed");
		wd.quit();
		
	
	}

}
