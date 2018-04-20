package com.Sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "F:\\Ranjith\\RANJITH\\Ranjith - Personal\\Selenium - Jars\\Chrome exe\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.navigate().to("https://www.google.com");
	}
	
	@Test(groups="titleTest")
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Google123","The title of the page is not matching");
		Assert.assertTrue(10<9, "Fuck off");
	}
	
	/*@Test(groups="LogoTest")
	public void googleLogoTest() {
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Hannah Glasse’s 310th birthday']"));
		boolean result = logo.isDisplayed();
		if(result)
		System.out.println("Logo is displayed");
		else
		System.out.println("Logo not dispalyed");
	}
	
	@Test(groups="emailTest")
	public void emailLinkTest() {
		WebElement mailLink = driver.findElement(By.xpath("//a[text()='Gail']"));
		boolean result = mailLink.isDisplayed();
		if(result)
		System.out.println("MailLink is displayed");
		else
		System.out.println("MailLink is not displayed");
		
	}
	
	@Test(groups="CommomTest")
	public void test1() {
		System.out.println("This is Test1");
	}
	
	@Test(groups="CommomTest")
	public void test2() {
		System.out.println("This is Test2");
	}
	
	@Test(groups="CommomTest")
	public void test3() {
		System.out.println("This is Test3");
	}
*/	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
