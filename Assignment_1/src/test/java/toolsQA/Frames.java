 package toolsQA;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Robot rc=new Robot();
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		wd.findElement(By.xpath("//*[@class=\'card mt-4 top-card\'][3]")).click();
		
		
		
		//Alerts
		//wd.get("https://demoqa.com/alerts");
		//wd.findElement(By.id("alertButton")).click();
		//Alert simpleAleart = wd.switchTo().alert();
		//System.out.println(simpleAleart.getText());
		//Thread.sleep(3000);
		//simpleAleart.accept();
		//Thread.sleep(3000);
	    //wd.findElement(By.id("confirmButton")).click();
		//Alert confirmationAlert = wd.switchTo().alert();
		//System.out.println(confirmationAlert.getText());
		//Thread.sleep(3000);
		//confirmationAlert.accept();
		//Thread.sleep(3000);
		//System.out.println(wd.findElement(By.id("output")).getText());
		//Thread.sleep(3000);
		
		//model dialog
		wd.get("https://demoqa.com/modal-dialogs");
		wd.findElement(By.id("showSmallModal")).click();
		Thread.sleep(3000);
		wd.findElement(By.id("closeSmallModal")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("showLargeModal")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(2000);
	    
		
		
		}

}
