package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsExample {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
		Thread.sleep(2000);
		WebElement signIn=driver.findElement(By.xpath(".//*[text()='Log In/Sign Up']"));
		signIn.click();
		Thread.sleep(5000);
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(".//*[text()='Login/Signup with mobile number and password']")).click();
	}
}

		
		
		
