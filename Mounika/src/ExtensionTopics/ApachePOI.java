package ExtensionTopics;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ApachePOI {
	
	static public void srchTxtbox(WebDriver driver,String searchvalue) {
		WebElement ele1=driver.findElement(By.id("gh-ac"));
		ele1.sendKeys(searchvalue);
	}
	
	static public void seldropdown(WebDriver driver,String selectvalue) {
		WebElement ele2=driver.findElement(By.id("gh-cat "));
		Select sel=new Select(ele2);
		sel.selectByVisibleText(selectvalue);
	}
	
	static public void clickbutton(WebDriver driver) {
		WebElement ele3=driver.findElement(By.id("gh-btn"));
		ele3.click();
	}
	public static void main(String[] args)throws Exception {
		
		XSSFWorkbook wb=new XSSFWorkbook("TestData.xlsx");
		XSSFSheet sh=wb.getSheet("TestData");
		int rowcount=sh.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowcount;i++) {
			String srchvalue=sh.getRow(i).getCell(0).getStringCellValue();
			String dropdownvalue=sh.getRow(i).getCell(1).getStringCellValue();
			
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		ApachePOI.srchTxtbox(driver, srchvalue);
		ApachePOI.seldropdown(driver, dropdownvalue);
		ApachePOI.clickbutton(driver);
		
		
	}

}
}
