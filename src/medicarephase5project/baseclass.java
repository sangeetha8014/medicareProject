package medicarephase5project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class baseclass {

	public static WebDriver driver;
	

	
	SoftAssert soft = new SoftAssert();
		
		
		
		@BeforeMethod
		public void setup() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			
			driver = new ChromeDriver();
			
			driver.get("http://localhost:8080/medicare/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
								
		
		}
		
				
		
		@AfterMethod
		public void teardown() {
			
			
		
//			driver.quit();
			
			soft.assertAll();
		}

	}


