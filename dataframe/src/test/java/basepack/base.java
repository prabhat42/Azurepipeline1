package basepack;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	public 	Properties prop;
	public WebDriver OpenBrowser(String browserName) throws IOException
	{
	  prop= new Properties();
		File propFile =new File("C:\\Users\\DELL\\eclipse-workspace\\dataframe\\src\\test\\resources\\data.properties");
		try {
		FileInputStream fs=new FileInputStream(propFile);
		prop.load(fs);
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		WebDriver driver= null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
		    driver =new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
		    driver =new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
		    driver =new EdgeDriver();
	}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		return driver;

}
}
