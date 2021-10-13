package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.ExcelUtilities;
import com.crm.vtiger.GenericUtils.FileUtility;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_07CreateOpportunity 
{
	@Test
	public void createOppertunites() throws Throwable
{
		WebDriverUtility wutil=new WebDriverUtility();
	
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver93.exe");
		
		WebDriver driver = new ChromeDriver();
		FileUtility file=new FileUtility();
		String URL = file.getPropertyKeyValue("url");
		String username = file.getPropertyKeyValue("username");
		String password = file.getPropertyKeyValue("password");
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).submit();
		driver.findElement(By.xpath("(//a[text()='Opportunities'])[1]")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		 WebElement dropdown = driver.findElement(By.id("related_to_type"));
		 wutil.SelectOption(dropdown, "Organizations");
		
}
	
}
