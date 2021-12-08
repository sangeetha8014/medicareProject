package medicarephase5project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class LoginTest extends baseclass {
	
	@Test

	public void Login() throws InterruptedException {
	
		/*LOGIN PAGE*/
		
		
		//Login
        WebElement Login = driver.findElement(By.xpath("//li[@id='login']"));
        Login.click();
		
		Thread.sleep(2000);
		
		
		//Email
        WebElement Email = driver.findElement(By.xpath("//input[@id='username']"));
        Email.sendKeys("kn@gmail.com");
		
		Thread.sleep(2000);
		
		//Password
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("12345");
		
		Thread.sleep(2000);
		
		//LoginSubmit
        WebElement Loginsubmit = driver.findElement(By.xpath("//input[@type='submit']"));
        Loginsubmit.click();
		
		Thread.sleep(2000);
		
		/*PRODUCT SEARCH*/
		
		//ViewProducts
        WebElement ViewProducts = driver.findElement(By.xpath("//li[@id='listProducts']"));
        ViewProducts.click();
		
		Thread.sleep(2000);
		
		//Search
        WebElement Search = driver.findElement(By.xpath("//input[@type='search']"));
        Search.sendKeys("Amoxicillin");
		
		Thread.sleep(2000);
		
		//ViewItem
        WebElement ViewItem = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        ViewItem.click();
		
		Thread.sleep(2000);
		
		/*SHOPPING CART*/
		
		//Addtocart
        WebElement AddToCart = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
        AddToCart.click();
		
		Thread.sleep(2000);
		
		//Checkout
        WebElement Checkout = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']"));
        Checkout.click();
		
		Thread.sleep(2000);
		
		/*BILLING PAYMENT*/
		
		//Selectaddress
        WebElement Address = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        Address.click();
		
		Thread.sleep(2000);
		
		//EnterCardNumber
        WebElement CardNumber = driver.findElement(By.xpath("//input[@id='cardNumber']"));
        CardNumber.sendKeys("1234-456-7896");
		
		Thread.sleep(2000);
		
		//EnterMonth
        WebElement Month = driver.findElement(By.xpath("//input[@id='expityMonth']"));
        Month.sendKeys("04");
		
		Thread.sleep(1000);
		
		//EnterYear
        WebElement Year = driver.findElement(By.xpath("//input[@id='expityYear']"));
        Year.sendKeys("23");
		
		Thread.sleep(1000);
		
		//EnterCVcode
        WebElement CVcode = driver.findElement(By.xpath("//input[@id='cvCode']"));
        CVcode.sendKeys("09");
		
		Thread.sleep(1000);
		
		//Clickpay
        WebElement Pay = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg btn-block']"));
        Pay.click();
		
		Thread.sleep(2000);
		
		/*ORDER SUMMARY*/
		
		WebElement OrderSummarydetailsPage = driver.findElement(By.xpath("//h3[@class='text-center']"));
		Assert.assertTrue(OrderSummarydetailsPage.isDisplayed());
		
		System.out.println("Order SummarydetailsPage is Displayed");
		
		
				
	}

}
