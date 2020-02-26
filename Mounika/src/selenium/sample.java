package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class sample {
	
	public static void main(String[] args) throws Exception {
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Superman computers\\Desktop\\chrome.exe");
		  //System.out.println(System.getProperty("webdriver.chrome.driver"));

	 WebDriver driver=new ChromeDriver();
	// driver.manage().window().maximize();
	 Thread.sleep(10000);
	 driver.get("http://google.com");
	 driver.get("http://flipkart.com");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 

	}

}