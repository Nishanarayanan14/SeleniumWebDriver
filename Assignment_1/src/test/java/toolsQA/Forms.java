package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forms {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://demoqa.com/automation-practice-form");
		wd.findElement(By.id("firstName")).sendKeys("Nisha");
		wd.findElement(By.id("lastName")).sendKeys("N");
		wd.findElement(By.id("userEmail")).sendKeys("nisha4@gmail.com");
		//wd.findElement(By.id("Gender")).sendKeys("Female");
		wd.findElement(By.id("userNumber")).sendKeys("7878787878");
		//wd.findElement(By.id("dateOfBirth")).sendKeys("14 Mar 2023");
		//wd.findElement(By.id("subjects")).sendKeys("computer");
		//wd.findElement(By.id("Hobbies")).sendKeys("Music");
		wd.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Admin\\Pictures\\Screenshots");
		wd.findElement(By.id("currentAddress")).sendKeys("thamman building");
		wd.findElement(By.id("stateCity")).sendKeys("NCR");
		wd.findElement(By.id("stateCity")).sendKeys("Delhi");
		wd.findElement(By.id("submit")).click();
	}
	
}
