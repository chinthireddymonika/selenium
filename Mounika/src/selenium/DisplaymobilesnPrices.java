package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplaymobilesnPrices {
	
	public static void main(String[] args) throws Exception{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/search?q=Mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	Thread.sleep(5000);
	
	//driver.findElement(By.className("LM6RPg")).sendKeys("MOBILES");
	//driver.findElement(By.className("vh79eN")).click();
	List<WebElement> mobiles=driver.findElements(By.className("_3wU53n"));
	List<WebElement> prices=driver.findElements(By.xpath(".//*[@class='_1vC4OE _2rQ-NK']"));
	
	System.out.println("Total mobiles are "+mobiles.size());
		for(int i=0;i<mobiles.size();i++) {
			System.out.println(mobiles.get(i).getText());
		System.out.println(prices.get(i).getText());
		}
	}

}
