package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHusingMethod {
	
	public void activewindow(WebDriver driver,String activewindowname) {
		Set<String> ids=driver.getWindowHandles();
		for(String id:ids)
		{
			driver.switchTo().window(id);
			String title=driver.getTitle();
			if(title.equals(activewindowname))
			{
				System.out.println("Pass");
				
			}
		
	}
	}
	
	public void closewindow(WebDriver driver,String window) {
		Set<String> ids=driver.getWindowHandles();
		for(String id:ids)
		{
			driver.switchTo().window(id);
			String title=driver.getTitle();
			if(title.equals(window))
			{
				driver.close();
				
			}
		}
	}
	
public static void main(String[] args) throws Exception{
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		Thread.sleep(5000);
		WHusingMethod WH=new WHusingMethod();
		WH.activewindow(driver, "Genpact");
		WH.closewindow(driver, "Genpact");
		
		}

}
