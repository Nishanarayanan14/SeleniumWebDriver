package Demo1;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
	WebDriver dr;
	@BeforeTest
	public void beforeTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.navigate().to("https://rahulshettyacademy.com/practice-project");
		WebElement wb = dr.findElement(By.linkText("More"));
		Actions act=new Actions(dr);
		Thread.sleep(6000);
		act.moveToElement(wb).build().perform();
		Robot rc = new Robot();
		//rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		//rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		//Thread.sleep(3000);
		//rc.keyPress(MenuKeyEvent.VK_PAGE_UP);
		WebElement link = wb.findElement(By.xpath("//*[@class=\'new-navbar-highlighter\']"));
		act.contextClick(link).build().perform();
		Thread.sleep(3000);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_ENTER);
		rc.keyPress(MenuKeyEvent.VK_CONTROL);
		rc.keyPress(MenuKeyEvent.VK_TAB);
		
	}
  @Test
  public void f() {
  }
  @AfterTest
  public void afterTest() {
	  
  }
}
