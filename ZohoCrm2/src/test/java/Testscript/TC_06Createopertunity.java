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
import com.crm.vtiger.GenericUtils.JavaUtilites;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_06Createopertunity 
{
	@Test
	public void createOppertunites() throws Throwable
{
		WebDriverUtility wutil=new WebDriverUtility();

		
		System.setProperty("webdriver.chrome.driver", "./chromedriver93.exe");
		WebDriver driver = new ChromeDriver();
		JavaUtilites jutil=new JavaUtilites() ;
		ExcelUtilities eutil=new ExcelUtilities();
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
		driver.findElement(By.xpath("//img[@alt=\"Create Opportunity...\"]")).click();
		String oppname = eutil.getExcelData("sheet1", 1, 1);
		driver.findElement(By.name("potentialname")).sendKeys(oppname);
		
		WebElement relatedto = driver.findElement(By.id("related_to_type"));
		wutil.SelectOption(relatedto, "Contacts");
    WebElement dropdown = driver.findElement(By.id("related_to_type"));
    wutil.SelectOption(dropdown, "Contacts");
   driver.findElement(By.xpath("(//img[@src=\"themes/softed/images/select.gif\"])[1]")).click();
   String parent2 = driver.getWindowHandle();
    Set<String> windows2 = driver.getWindowHandles();
    Iterator<String> itr2 = windows2.iterator();
    String p = itr2.next();
    //System.out.println(p);
    String c = itr2.next();
    driver.switchTo().window(c);
    driver.findElement(By.xpath("(//a[@href=\"javascript:window.close();\"])[1]")).click();
    driver.switchTo().window(p);
   
    driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
    WebElement assigngrouped = driver.findElement(By.xpath("//select[@name=\"assigned_group_id\"]"));
    wutil.SelectOption(assigngrouped, "Team Selling");
    
   WebElement closingdate = driver.findElement(By.xpath("//input[@name=\"closingdate\"]"));
   closingdate.clear();
   closingdate.sendKeys("2021-10-15");
    WebElement salesstagedd = driver.findElement(By.name("sales_stage"));
    wutil.SelectOption(salesstagedd, "Value Proposition");
    driver.findElement(By.xpath("(//input[@class=\"crmbutton small save\"])[2]")).click();
    
    
}
}