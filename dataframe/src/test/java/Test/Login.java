package Test;

 import java.io.IOException;



 //import org.jsoup.helper.DataUtil;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
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
//		driver.findElement(By.id("//input[@placeholder=\"Enter Password\"]")).sendKeys("12345@klp");
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/button")).click();	
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
  /*	@DataProvider (name ="SearchProvider")
	public Object[] [] dataInput() 
	{
		Object [] []  data= { {"xzc@gmail.com", "123456@xzc" },
			{"amotooricap62@gmail.com",	"12345"} ,
			 {"xzc@gmail.com" ,	"12345@klp" } } ;
		
		return data;   */
		
		
	}


