package IRCTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Edge() {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]"));
		
		register.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 500);");
	}
	
	@Test
	public void Register() {
	
		
		WebElement username =driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		
		username.sendKeys("RamyaSri138");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"usrPwd\"]"));
		
		password.sendKeys("Qwerty138");
		
		WebElement password1= driver.findElement(By.id("cnfUsrPwd"));
		
		password1.sendKeys("Qwerty138");
	
		WebElement Language=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-3\"]/div/div[5]/p-dropdown/div/div[3]/span"));
		
		List<WebElement>values = Language.findElements(By.xpath("//*[@id=\"ui-tabpanel-3\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li"));
		
		values.get(0).click();
		
		WebElement LanguagedropDown=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-3\"]/div/div[6]/p-dropdown/div/div[3]/span"));
		
		List<WebElement>values1 = LanguagedropDown.findElements(By.tagName("li"));
		
		values1.get(0).click();
		
		WebElement dropdown2=driver.findElement(By.className("ui-dropdown-trigger-icon ui-clickable ng-tns-c65-15 pi pi-chevron-down"));
		
        dropdown2.click();
        
        WebElement dropdown3=driver.findElement(By.xpath("//ul[@role=\"button\"]"));
        
        List<WebElement> values2=dropdown3.findElements(By.xpath("p-dropdownitem"));
        
        System.out.println(values2.size());
        
        values1.get(2).click();
        
        WebElement securityAnswer = driver.findElement(By.xpath("(//ul[@formcontrolname=\"secAns\"]"));
        
        securityAnswer.sendKeys("Good News");
        
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button"));
        
        continueButton.click();
        
		//Personal Details
        WebElement firstName = driver.findElement(By.id("firstName"));
        
        firstName.sendKeys("Ramya");
        
        WebElement middleName = driver.findElement(By.xpath("//ul[@name=\"middleName\"]"));
        
        middleName.sendKeys("Sri");
        
        WebElement lastName = driver.findElement(By.xpath("//ul[@name=\"lastname\"]"));
        
        lastName.sendKeys("138");
        
        WebElement Occupation = driver.findElement(By.xpath("(//span[contains(@class,'ui-dropdown-trigger-icon ui-clickable')])[3]"));
        
        Occupation.click();
        
        WebElement DOB  =driver.findElement(By.xpath("(//span[contains(@class,'ui-dropdown-items ui-dropdown-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns-c65-16')])"));
        
        DOB.click();
        
        WebElement dropdown = driver.findElement(By.xpath("//ul[@role=\"button\"]"));
        
        List<WebElement> values3=dropdown.findElements(By.xpath("p-dropdownitem"));
        
        System.out.println(values3.size());
        
        values2.get(5).click();
        
        driver.findElement(By.xpath("(//span[contains(@class,'ng-star-inserted ui-radiobutton-label ui-label-active')])")).click();

        driver.findElement(By.xpath("(//span[contains(@class,'form-control ng-pristine ng-valid ng-touched')])")).click();
        
        driver.findElement(By.xpath("//ul[@value=\"9\"]"));
        
        List<WebElement> values4=dropdown.findElements(By.xpath("//input[@class=\"ng-star-inserted\"])[9]"));
        
        System.out.println(values4.size());
        
        values2.get(9).click();
        
        driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text ui-clickable ng-star-inserted')])[2]")).click();
        
        driver.findElement(By.id("email")).sendKeys("sramyasrikanth138@gmail.com");
        
        driver.findElement(By.id("mobile")).sendKeys("8300260574");
        
        driver.findElement(By.xpath("(//span[contains(@class,'form-control ng-pristine ng-valid ng-touched')])")).click();
        
        driver.findElement(By.xpath("//ul[@value=\"9\"]"));
        
        List<WebElement> values5=dropdown.findElements(By.xpath("//ul[@class=\"ng-star-inserted\"])[10000]"));
        
        System.out.println(values5.size());
        
        values2.get(10000).click();
        
        driver.findElement(By.xpath("//*[@id='divMain']/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button")).click();
        
        //Address
        driver.findElement(By.id("resAddress1")).sendKeys("No:234");
        
    	driver.findElement(By.id("resAddress2")).sendKeys("Aathupalam");
    	
    	driver.findElement(By.xpath("//input[@name='resPinCode']")).sendKeys("635205");
    	
    	WebElement dropdown1=driver.findElement(By.xpath("(//select[@class,'form-control ng-pristine ng-invalid ng-touched')])"));
    	
        dropdown1.click();
        
        WebElement dropdown7=driver.findElement(By.xpath("//option[@size=\"5\"])[1]"));
        
        List<WebElement> values6=dropdown7.findElements(By.xpath("//ul[@value=\"Dharmapuri\"])"));
        
        System.out.println(values6.size());
        
        values6.get(0).click();
        
        driver.findElement(By.xpath("(//select[@class,'form-control ng-dirty ng-touched ng-invalid')])")).click();
        
        WebElement dropdown8=driver.findElement(By.xpath("//option[@class='ng-star-inserted'])[2]"));
        
        List<WebElement> values7=dropdown8.findElements(By.xpath("//ul[@value=\"Periyanahalli B.O\"])"));
        
        System.out.println(values7.size());
        
        values7.get(2).click();
        
        //Phone Number
        driver.findElement(By.id("resPhone")).sendKeys("8300260574");
        
        driver.findElement(By.xpath("//ul[@role=\"radio\"]")).click();
        
        driver.findElement(By.xpath("//ul[@type=\"checkbox")).click();
        
        driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}


