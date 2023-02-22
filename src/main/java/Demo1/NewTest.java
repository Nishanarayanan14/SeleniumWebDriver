package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v103.storage.model.InterestGroupAccessType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;


public class NewTest {
	WebDriver dr;
	public String URL1 = "https://www.google.com/";
	public String URL2 = "https://www.amazon.com/";
  
 @BeforeTest
 public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	dr= new ChromeDriver();
	dr.get(URL1);
	
	
}
	@Test 
  public void actions() throws AWTException, InterruptedException {
		WebElement link = dr.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		Thread.sleep(3000);
		Actions act = new Actions(dr);
		act.contextClick(link).build().perform();
		Robot rb = new Robot();
		Thread.sleep(3000);
		rb.keyPress(MenuKeyEvent.VK_DOWN);
		rb.keyPress(MenuKeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(MenuKeyEvent.VK_CONTROL);
		rb.keyPress(MenuKeyEvent.VK_TAB);
		
		WebElement link2 = dr.findElement(By.xpath("//*[contain(text(),'Create an account')]"));
		Thread.sleep(3000);
		Actions act2 = new Actions(dr);
		act2.click(link2);
		
	}
	@AfterTest
	public void AfterTest() {
		dr.close();
  }

}

