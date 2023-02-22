package ni;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSE {
	WebDriver wb;
  @Test
  public void tc1() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)wb;
	  Thread.sleep(3000);
	  
	  js.executeScript("document.getElementById('userName').value='nisha'");
	  js.executeScript("document.getElementById('userEmail').value='nisha22@gmail.com'");
	  js.executeScript("document.getElementById('currentAddress').value='coonoor'");
	  js.executeScript("document.getElementById('permanentAddress').value='coonoor'");
	  js.executeScript("document.getElementById('submit').click()");
	  js.executeScript("window.scrollBy(0,1000)");
	  System.out.println( js.executeScript("return document.title"));
	  System.out.println( js.executeScript("return document.domain"));
	 // System.out.println( js.executeScript("return document.domain"));
	  System.out.println( js.executeScript("return document.getElemantById('submit').innerText"));
	  
	  
	  //js.executeScript("history.go(0)");
	  //js.executeScript("window.history.forward(0)");
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	  wb.get("https://demoqa.com/text-box");
	  
	  
  }
  
}
