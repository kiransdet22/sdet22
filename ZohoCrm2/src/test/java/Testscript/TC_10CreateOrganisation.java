package Testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.ExcelUtilities;
import com.crm.vtiger.GenericUtils.FileUtility;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_10CreateOrganisation
{
	@Test
	public void createOppertunites() throws Throwable
{
		WebDriverUtility wutil=new WebDriverUtility();
		ExcelUtilities eutil=new ExcelUtilities();
		String opp= eutil.getExcelData("sheet1", 1, 1);
		
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
        String oppname = eutil.getExcelData("sheet1", 1, 1);
		driver.findElement(By.name("potentialname")).sendKeys(oppname);
		WebElement relatedto = driver.findElement(By.id("related_to_type"));
		wutil.SelectOption(relatedto, "Organizations");
		driver.findElement(By.xpath("//img[@title=\"Select\"]")).click();
		 String parent2 = driver.getWindowHandle();
		    Set<String> windows2 = driver.getWindowHandles();
		    Iterator<String> itr2 = windows2.iterator();
		    String p = itr2.next();
		    //System.out.println(p);
		    String c = itr2.next();
		    driver.switchTo().window(c);
		    driver.findElement(By.xpath("(//a[@href=\"javascript:window.close();\"])[1]")).click();
		    driver.switchTo().window(p);
		    WebElement type = driver.findElement(By.name("opportunity_type"));
		    wutil.SelectOption(type, "New Business");
		    WebElement leadsourse = driver.findElement(By.name("leadsource"));
		    wutil.SelectOption(leadsourse,"Self Generated");
		    
		 //  wutil.SelectOption(assignedto, "Team Selling");
		
		
		
		
		
		
		
		
		
		
}}
