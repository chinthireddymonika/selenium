package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytmclosepopup {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
		Thread.sleep(3000);
		driver.findElement(By.className("_3ac-")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("_3i6R")).click();
		
	}

}
