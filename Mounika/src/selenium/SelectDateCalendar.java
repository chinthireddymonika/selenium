package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDateCalendar {
	
	public void Date(WebDriver driver, String specificdate) {
		driver.findElement(By.name("txtJourneyDate")).click();
		List<WebElement> rows=driver.findElements(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i=1;i<=rows.size();i++)
{
		List<WebElement> cols=driver.findElements(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td"));
		 for(int j=1;j<=cols.size();j++)
		{
			WebElement ele=driver.findElement(By.xpath("(.//table[@class='ui-datepicker-calendar'])[1]/tbody/tr["+i+"]/td["+j+"]"));
			String date=ele.getText();
			if(date.equals(specificdate)) {
				ele.click();
			}
			
		}
		
	}
	}
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.apsrtconline.in/oprs-web/");
		SelectDateCalendar dt=new SelectDateCalendar();
		dt.Date(driver, "28");
		
		
	}
}