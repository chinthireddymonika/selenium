package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHusingMethod {
	
public static void main(String[] args) throws Exception{
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		Thread.sleep(5000);
		Set<String> ids=driver.getWindowHandles();
		for(String id:ids)
		{
			driver.switchTo().window(id);
			String title=driver.getTitle();
			if(title.equals("Croma"))
			{
				driver.findElement(By.tagName("img")).click();
				
			}
		}

}
}
