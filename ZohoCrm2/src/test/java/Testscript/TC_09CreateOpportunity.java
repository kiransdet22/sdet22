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

public class TC_09CreateOpportunity {

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
		String oppname = eutil.getExcelData("sheet1",1 , 1);
		driver.findElement(By.name("potentialname")).sendKeys(oppname);
		WebElement relatedto = driver.findElement(By.id("related_to_type"));
		wutil.SelectOption(relatedto,"Contacts");
		driver.findElement(By.xpath("(//img[@alt=\"Select\"])[1]")).click();
		String parent4= driver.getWindowHandle();
	    Set<String> windows4 = driver.getWindowHandles();
	    Iterator<String> itr = windows4.iterator();
	    String p = itr.next();
	    //System.out.println(p);
	    String c = itr.next();
	    driver.switchTo().window(c);
	    driver.findElement(By.id("1")).click();
	    driver.switchTo().window(p);
	    driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
	    WebElement assignedto = driver.findElement(By.name("assigned_group_id"));
	    wutil.SelectOption(assignedto, "Support Group");
	    WebElement closingdate = driver.findElement(By.name("closingdate") );
		closingdate.clear();
		closingdate.sendKeys("2021-10-18");
		WebElement salesstage = driver.findElement(By.name("sales_stage"));
	    wutil.SelectOption(salesstage, "Qualification");
	    driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
			
		
		
		
		
		
		
		
		
		
		
		
		
}}
