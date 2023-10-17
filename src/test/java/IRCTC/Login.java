package IRCTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@BeforeMethod
	public void Contactus() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.linkText("LOGIN"));
    login.click();
}

	
	@Test
	public void USRNAME() {
		WebElement username = driver.findElement(By.id("6400975"));
	    username.sendKeys("RamyaSri138");
		
	}
	@Test(priority=1)
	public void Password() {
		WebElement password = driver.findElement(By.id("6568579"));
	    password.sendKeys("Qwerty138");
	}
	
	
	@Test(priority=2)
	public void Signin() throws InterruptedException {  
    Thread.sleep(30000);
    WebElement signin = driver.findElement(By.linkText("SIGN IN"));
    Assert.assertTrue(signin.isSelected());
    signin.click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}

