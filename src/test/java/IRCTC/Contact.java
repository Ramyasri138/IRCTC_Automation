package IRCTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Contactus() {
		
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver= new EdgeDriver();
	
	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	
	driver.manage().window().maximize();
	

}
	@Test
	public void Contactirctc() {
		
		SoftAssert Assert = new SoftAssert();
		
		WebElement Contact = driver.findElement(By.linkText("CONTACT US"));
		
		Assert.assertTrue(Contact.isSelected());
		
	    Contact.click();
		
		WebElement emailLink = driver.findElement(By.linkText("care@irctc.co.in"));
		
		Assert.assertTrue(emailLink.isDisplayed());
		
		emailLink.click();
		
		Assert.assertAll();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	
}
