package RegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_1 {
	public static WebDriver driver;

	@Test(priority = 1)
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/register");
	}
	@Test(priority = 2)
	public void SignUp() {
		WebElement YourName = driver.findElement(By.xpath("//span[normalize-space()='First Name']"));
		YourName.sendKeys("test_Vrushali");
		WebElement LastName = driver.findElement(By.xpath("//span[normalize-space()='Last Name']"));
		LastName.sendKeys("test_Vrushali");
		WebElement MobileNum = driver.findElement(By.xpath("//span[normalize-space()='Mobile Number']"));
		MobileNum.sendKeys("8998765648");	
		WebElement Mail = driver.findElement(By.xpath("//span[normalize-space()='Email']"));
		Mail.sendKeys("test_Vrushali@gmail.com");	
		WebElement password = driver.findElement(By.xpath("//span[normalize-space()='Password']"));
		password.sendKeys("Vrushali@123");	
		WebElement Confpassword = driver.findElement(By.xpath("//span[normalize-space()='Confirm Password']"));
		password.sendKeys("Vrushali@123");	
		
	}
	@Test(priority = 3)
	public void SubmitFrom() {
		WebElement SignUp = driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		SignUp.click();	
	}
	
	@Test(priority = 4)
	public void tearDown() {
		driver.close();
	}
}
