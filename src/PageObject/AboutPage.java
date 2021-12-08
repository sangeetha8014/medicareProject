package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AboutPage extends HomePage {

	public WebDriver driver;

	public AboutPage() {

		driver = BasePage.driver;
		PageFactory.initElements(driver, this);
	}

	public void isAbout_Page() throws InterruptedException {
		About.click();
		Thread.sleep(1000);
		Assert.assertEquals("This is an about us page", About_Display.getText());
		System.out.println("About page Successfull");
	}

}
