package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsExample {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		WebElement link = driver.findElement(By.xpath(".//*[text()=' My eBay']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(link).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[text()=' Messages']")).click();
		
	}

}
