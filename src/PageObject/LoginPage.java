package PageObject;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends HomePage {
	
	public WebDriver driver;

	public LoginPage() {

		driver = BasePage.driver;
		PageFactory.initElements(driver, this);
	}

	public void isLogin_Page() throws InterruptedException {

		driver.navigate().back();
		Thread.sleep(1000);
		Login.click();
		Assert.assertEquals("Login", LoginDisplay.getText());
		System.out.println("Login Page can be seen");
	}


	
	
}
