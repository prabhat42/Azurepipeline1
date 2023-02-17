package Test;

 import java.io.IOException;



 //import org.jsoup.helper.DataUtil;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepack.base;
 //import io.github.bonigarcia.wdm.WebDriverManager;
//import util.MyXLSReader;

public class Login extends base{
	
	WebDriver driver;
	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}
	
	@Test 
	public void testLogin() throws IOException, InterruptedException
	{
		driver = OpenBrowser("chrome");
		
		//driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/input")).sendKeys("xzc@gmail.com");
//		
		System.out.println("Data Science");
	}
	@Test 
	public void logo() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/button[1]")).isDisplayed();
		System.out.println("Logo Displayed");
		
	}
	@Test 
	public void logo1() throws IOException, InterruptedException
	{
	
		System.out.println("Logo1 Displayed");
		
	}
	@Test 
	public void logo2() throws IOException, InterruptedException
	{
		
		System.out.println("Logo2 Displayed");
		
	}
	@Test 
	public void logo3() throws IOException, InterruptedException
	{
		
		System.out.println("Logo3 Displayed");
		
	}
	@Test 
	public void log4() throws IOException, InterruptedException
	{
		
		System.out.println("Logo4 Displayed");
		
	}
   @Test
   public void check()
   {
	String  str1="Prabhat";
	String  str2="prabhat";
	System.out.println(str1.equals(str2 ));
	
   }
		
		
	}


