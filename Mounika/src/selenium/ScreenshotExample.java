package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class ScreenshotExample {
	
	public void screenshot(WebDriver driver,String filename) throws Exception
	{
	
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D://"+filename+".png"));
	}
	
	public static void main(String[] args) throws Exception{
		
		ScreenshotExample obj=new ScreenshotExample();
		WebDriver driver=null;
		try
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			obj.screenshot(driver, "BrowserNotFound");
		}
		
		try {
			driver.get("http://amazon.com");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			obj.screenshot(driver, "NoUrl");
		}
		try {
			driver.findElement(By.id("twotabsearchtextboxfvgergre")).sendKeys("Mobiles");
		}
		catch(Exception e)
		{
			obj.screenshot(driver, "TextboxSearch");
		}
		}
	}

