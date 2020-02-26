package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebayusingMethods {
	
	//public void search(WebDriver driver,String str) throws Exception{
		
		
	//}
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("gh-ac")).sendKeys("Mobiles");
		
		
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(1);
		
	    driver.findElement(By.id("gh-btn")).click();
	    
		
        
	}

}
