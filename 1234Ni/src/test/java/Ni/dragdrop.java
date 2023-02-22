package Ni;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://demoqa.com/");
		Robot rc=new Robot();
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		wd.findElement(By.xpath("//*[@class=\'card mt-4 top-card\'][1]")).click();
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\'element-group\'][5]")).click();
		Thread.sleep(3000);
		Thread.sleep(2000);
		wd.get("https://demoqa.com/droppable");
		WebElement l1=wd.findElement(By.id("draggable"));
		WebElement l2=wd.findElement(By.id("droppable"));
		Actions act=new Actions(wd);
		act.dragAndDrop(l1,l2).build().perform();
		Thread.sleep(4000);
		wd.get("https://demoqa.com/text-box");
		wd.findElement(By.id("userName")).sendKeys("Nisha");
		wd.findElement(By.id("userEmail")).sendKeys("nishanarayanan014@gmail.com");
		wd.findElement(By.id("currentAddress")).sendKeys("coonoor");
		wd.findElement(By.id("permanentAddress")).sendKeys("coonoor");
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"btn btn-primary\"]")).click();
		
		//CheckBox
		rc.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		WebElement a=wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[2]"));
		act.click(a).build().perform();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-uncheck\"]")).click();
		Thread.sleep(2000);
		
		//RadioButton
		//wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[3]")).click();
		//Thread.sleep(1000);
		//wd.findElement(By.xpath("//*[@class=\"custom-control-label\"][1]")).click();
		//Thread.sleep(1000);
	    //wd.findElement(By.xpath("//*[@class=\"custom-control-label\"][2]")).click();
		
		
		//webTables
		rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[4]")).click();
		Thread.sleep(1000);
	    wd.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(1000);
		wd.findElement(By.id("firstName")).sendKeys("Nisha");
		wd.findElement(By.id("lastName")).sendKeys("Narayanan");
		wd.findElement(By.id("userEmail")).sendKeys("nisha14@gmail.com");
		wd.findElement(By.id("age")).sendKeys("21");
		wd.findElement(By.id("department")).sendKeys("Computer");
		wd.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		//Buttons
		//wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[5]")).click();
		//WebElement as=wd.findElement(By.id("rightClickBtn"));
		//Actions act=new Actions(wd);
		//act.contextClick(as).build().perform();
		//Thread.sleep(2000);
		
				
		
		//Links
		wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[6]"));
		wd.findElement(By.linkText("Home")).click();
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		rc.keyPress(MenuKeyEvent.VK_DOWN);
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@id=\"simpleLink\"]")).click();
		Thread.sleep(3000);
		
		
				
		
		
		
		
		
	}

}
