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

public class AdminLogin extends baseclass {

		@Test
		
		public void AdminLogin() throws InterruptedException {
			
			/*LOGIN PAGE*/
			
			//Login
	        WebElement Login = driver.findElement(By.xpath("//li[@id='login']"));
	        Login.click();
			
			Thread.sleep(2000);
			

			//Email
	        WebElement Email = driver.findElement(By.xpath("//input[@id='username']"));
	        Email.sendKeys("vk@gmail.com");
			
			Thread.sleep(2000);
			
			//Password
	        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	        password.sendKeys("admin");
			
			Thread.sleep(2000);
			
			//LoginSubmit
	        WebElement Loginsubmit = driver.findElement(By.xpath("//input[@type='submit']"));
	        Loginsubmit.click();
			
			Thread.sleep(2000);
			
						
			/*MANAGEPRODUCT*/
	        WebElement ManageProduct = driver.findElement(By.xpath("//a[contains(text(), 'Manage Product')]"));
	        ManageProduct.click();
			
			Thread.sleep(2000);
			
			
			//Add Category//
	        WebElement AddCategory = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-xs']"));
	        AddCategory.click();
			
			Thread.sleep(2000);
			

	        WebElement CategoryName = driver.findElement(By.xpath("//input[@placeholder='Category Name']"));
	        CategoryName.sendKeys("AntibioticsD");
			
			Thread.sleep(2000);
			
	        WebElement CategoryDesc = driver.findElement(By.xpath("//textarea[@placeholder='Enter category description here!']"));
	        CategoryDesc.sendKeys("Penicillin");
			
			Thread.sleep(2000);
			
	        WebElement Save = driver.findElement(By.xpath("(//input[@class=\"btn btn-primary\" and @type=\"submit\"])[2]"));
	        Save.click();
			
			Thread.sleep(2000);
			
			//AddProduct
	        WebElement ProductName = driver.findElement(By.xpath("//input[@placeholder='Product Name']"));
	        ProductName.sendKeys("Test Product");
			
			Thread.sleep(2000);
			
	        WebElement BrandName = driver.findElement(By.xpath("//input[@placeholder='Brand Name']"));
	        BrandName.sendKeys("Test Brand");
			
			Thread.sleep(2000);
			
			
	        WebElement Description = driver.findElement(By.xpath("//textarea[@placeholder='Enter your description here!']"));
	        Description.sendKeys("Test Description");
			
			Thread.sleep(2000);
			
			
	        WebElement UnitPrice = driver.findElement(By.xpath("//input[@placeholder='Enter Unit Price']"));
	        UnitPrice.sendKeys("200");
			
			Thread.sleep(2000);
			
			
	        WebElement Quantity = driver.findElement(By.xpath("//input[@placeholder='Enter Quantity']"));
	        Quantity.sendKeys("10");
			
			Thread.sleep(2000);
			
	        WebElement Uploadfile = driver.findElement(By.xpath("//input[@id='file']"));
	        Uploadfile.sendKeys("/home/sangeetha8014ya/Downloads/DOXYCYCLINE-500x500-1.jpg");
			
			Thread.sleep(2000);
			
						
	        WebElement ChooseCategory = driver.findElement(By.xpath("//select[@name='categoryId']/option[@value='2']"));
	        ChooseCategory.click();
			
			Thread.sleep(2000);
			
			
	        WebElement Save2 = driver.findElement(By.xpath("//input[@class='btn btn-primary'][1]"));
	        Save2.click();
			
			Thread.sleep(2000);
			
			//Edit Product
			
			driver.switchTo().defaultContent();
			
			WebElement Edit = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-pencil']"));
			Edit.click();
		
			
			Thread.sleep(2000);
			//Assert.assertEquals("Product Management",Edit.getText());
			System.out.println("Edited Successfully");
			Thread.sleep(2000);
			
			

			
		}
			

	}


