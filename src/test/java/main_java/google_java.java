package main_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google_java {
	
		WebDriver driver;
		WebElement textbox;

		public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

		}
		public void google_homepage()
		{
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		}

		public void verify() throws InterruptedException {
		textbox = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
		if (textbox.isEnabled())
		{
		textbox.sendKeys("Hello world");
		Thread.sleep(3000);

		}

		}

		public void submit() {
			
     Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		driver.close();

		}
		}

