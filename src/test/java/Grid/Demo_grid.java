package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;


public class Demo_grid {
	
		WebDriver driver;
		String Baseurl,nodeurl;
		@BeforeTest
		public void setup() throws MalformedURLException
		{
			Baseurl="https://www.guru99.com/";
			
			nodeurl="http://192.168.0.58:5566/wd/hub";
			
			DesiredCapabilities capability=DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(new URL(nodeurl),capability);
		}
	public void aftertest()
	{
		driver.quit();
	}
	@Test
	public void simpletest()
	{
		driver.get(Baseurl);
		String a=driver.getTitle();
		System.out.println("Title of the page" +a);
		
	}
	}

