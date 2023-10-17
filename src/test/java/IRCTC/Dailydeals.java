package IRCTC;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dailydeals {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Deals() {

	WebDriverManager.edgedriver().setup();
	
	WebDriver driver = new EdgeDriver();
	
	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	
	driver.manage().window().maximize();
	
	WebElement deal = driver.findElement(By.linkText("DAILY DEALS"));
	
	deal.click();
	
	WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
	
	searchBox.sendKeys("SmartWatch",Keys.ENTER);
	
	String parentWindow=driver.getWindowHandle();
	
	WebElement watch=driver.findElement(By.xpath("(//a[@class=\"a-link-normal s-no-outline\"])[1]"));
	
	watch.click();
	
	Set<String> handles=driver.getWindowHandles();
	
	for(String handle:handles)
		
		{
		
		if(!(handle==parentWindow))
			
		{
			driver.switchTo().window(handle);
			
		}
		
		}
	WebElement buyNow=driver.findElement(By.id("buy-now-button"));
	
	buyNow.click();
	
	}
	
	@Test
	private void Amazonlogin() {
		
		WebElement username=driver.findElement(By.id("ap_email"));	
		
		username.sendKeys("rramyaraja138@gmail.com");
		
		WebElement continurBtn=driver.findElement(By.id("continue"));
		
		continurBtn.click();
		
		WebElement password=driver.findElement(By.id("ap_password"));
		
		password.sendKeys("Service@123");
		
		WebElement signInBtn=driver.findElement(By.id("signInSubmit"));
		
		signInBtn.click();
		
		WebElement modeOfPayment=driver.findElement(By.xpath("(//input[contains(@id,'pp-')])[6]"));
		
		modeOfPayment.click();
		
		WebElement enterTheDetails=driver.findElement(By.xpath("(//a[starts-with(@id,'pp-')])[2]"));
		
		enterTheDetails.click();
		
		}
				

	@AfterMethod
	public void Close() {
		
		driver.close();
}
}
