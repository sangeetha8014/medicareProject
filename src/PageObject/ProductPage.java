package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage extends HomePage{
	
	public WebDriver driver;

	public ProductPage() {
		driver = BasePage.driver;
		PageFactory.initElements(driver, this);
	}
	
	
		public void isProduct_Pg() throws InterruptedException {
			
			driver.navigate().back();
			Thread.sleep(1000);
			ViewProducts.click();
			Thread.sleep(2000);
			Assert.assertEquals("Analgesics", Analgesics.getText());
			System.out.println("Analgesics is Available");

}
	
	

}
