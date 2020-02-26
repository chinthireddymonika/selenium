package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionExample {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
	Thread.sleep(15000);
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.LEFT_CONTROL).sendKeys(Keys.F5).keyUp(Keys.LEFT_CONTROL).perform();
		
		
	}

}
