package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignupPage extends HomePage {
	
	public WebDriver driver;

	public SignupPage() {
		
		driver = BasePage.driver;
		PageFactory.initElements(driver, this);
	}

	public void isSignUp_Page() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(1000);
		SignUp.click();
		Thread.sleep(2000);
		Assert.assertEquals("Sign Up - Personal", SignUpDescription.getText());
		System.out.println("SignUp Page Successfull");
	}
	
	

}
