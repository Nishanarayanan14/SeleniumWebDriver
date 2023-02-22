package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;

public class Data1 {
	WebDriver wd;
	public String username2, password2;
	
	public String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
  @Test
  public void datadriven() throws IOException, InterruptedException {
	 File excel = new File("C:/Users/Admin/Documents/data_1.xlsx");
	 FileInputStream fis = new  FileInputStream(excel);
	 XSSFWorkbook book = new XSSFWorkbook(fis);
	 XSSFSheet sheet = book.getSheet("Sheet1");
	 
	 int rowcount = sheet.getLastRowNum();
	 for(int i=0;i<rowcount; i++) {
		String username1= sheet.getRow(i).getCell(0).getStringCellValue();
		String password1= sheet.getRow(i).getCell(1).getStringCellValue();
		Thread.sleep(2000);
		wd.findElement(By.name("username")).sendKeys(username1);
		wd.findElement(By.name("password")).sendKeys(password1);
		wd.findElement(By.xpath("//*[@type='submit']")).click();
		
		  
		if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
		wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@href=\'/web/index.php/auth/logout\']")).click();
		Thread.sleep(3000);
		}
			 else if (wd.findElement(By.xpath("//*@oxd-alert oxd-alert--error")).isDisplayed()) {
				 for(int j=i+1;j<rowcount; j++) {
					  username2= sheet.getRow(j).getCell(0).getStringCellValue();
					  password2= sheet.getRow(j).getCell(1).getStringCellValue();
					 
					 wd.findElement(By.name("username")).sendKeys(username2);
					 wd.findElement(By.name("password")).sendKeys(password2);
					 wd.findElement(By.xpath("//*[@type='submit']")).click();
						Thread.sleep(3000);
						
						if(wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
							System.out.print("error");
						
						   wd.findElement(By.xpath("//*[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
						   Thread.sleep(1000);
						   wd.findElement(By.xpath("//*[@href=\'/web/index.php/auth/logout\']")).click();
							Thread.sleep(3000);
						
						
					 
				 }
				 
				 
			 }
			    
			    
		}
	 }
			
			
		
		
		
		
	 }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.get(URL);
  } 
}
