package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganddropExample {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		WebElement source=driver.findElement(By.id("gh-btn"));
		WebElement Destination=driver.findElement(By.id("gf-norton"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, Destination).perform();
		
	}

}
