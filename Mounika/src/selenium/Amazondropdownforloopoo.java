package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazondropdownforloopoo {
	
	public static void main(String[] args) throws Exception {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://amazon.com");
	Thread.sleep(5000);
	
	WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
	Select sel=new Select(dropdown);
	List<WebElement> items=sel.getOptions();
	System.out.println(items.size());
	
	for(int i=0; i<items.size(); i++)
	{
		if(items.get(i).getText().equals("Books"))
				{
			i=items.size();
				}
	
	else if(i==(items.size()-1))
	{
		System.out.println("value not found");
	}	
	
}
	}
}
