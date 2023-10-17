package IRCTC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Train {
	
	WebDriver driver;
	
	@BeforeClass
	public void Trainbooking() {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();;
			
		WebElement fromStation = driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
		
        fromStation.sendKeys("CHENNAI EGMORE - MS (CHENNAI)");
        
        WebElement fromStation1 = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[2]/div[1]"));
        
		fromStation1.click();
		
		WebElement ToStation = driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
		
        ToStation.sendKeys("COIMBATORE JN - CBE (COIMBATORE))");
        
        WebElement ToStation1 = driver.findElement(By.xpath("//*[@id=\"destination\"]/span/div"));
        
        Assert.assertTrue(ToStation1.isSelected());
        
        ToStation1.click();
	}
	@Test
	public void TrainSearch() throws InterruptedException {
		
	 WebElement SearchBtn = driver.findElement(By.linkText("Try booking in Ask DISHA 2.0"));
	 
     SearchBtn.click();   
     
     driver.findElement(By.id("cllink-12034-CC-1")).click();  
         
     driver.findElement(By.cssSelector("#c1 > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(5) > a:nth-child(2)")).click();  //Clicks on "Book Now" link.
     
     driver.findElement(By.className("RamyaSrikanth")).sendKeys(""); 
          
     driver.findElement(By.cssSelector("#addPassengerForm\\:psdetail\\:0\\:psgnAge")).click(); 
     
     driver.findElement(By.cssSelector("#addPassengerForm\\:psdetail\\:0\\:psgnAge")).sendKeys("26"); 
          
     WebElement Gender = driver.findElement(By.cssSelector("#addPassengerForm\\:psdetail\\:0\\:psgnGender"));
          
     Gender.sendKeys("Female"); 
          
     Gender.sendKeys(Keys.TAB);
          
     WebElement Berth =driver.findElement(By.cssSelector("#addPassengerForm\\:psdetail\\:0\\:berthChoice"));
         
     Berth.sendKeys("LowerBerth"); 
         
     Berth.sendKeys(Keys.TAB);
                  
     driver.findElement(By.id("addPassengerForm:mobileNo")).sendKeys("8300260574");  
          
     driver.findElement(By.id("validate")).click(); //Make Payment
         
     driver.findElement(By.id("CASH_CARD")).click(); // Payment Option.
          
     driver.findElement(By.cssSelector("td.CASH_CARD > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > input:nth-child(1)")).click(); //Payment Gateway.
          
     driver.findElement(By.cssSelector(".prefdBankOpt > input:nth-child(2)")).click(); //Add as preferred bank
          
     driver.findElement(By.id("validate")).click(); //payment button.
	}


	@AfterClass
	public void close() {

		driver.quit();
}
}
