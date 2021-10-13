package Testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.ExcelUtilities;
import com.crm.vtiger.GenericUtils.FileUtility;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_08CreateOpportunity
{
	@Test
	public void createOppertunites() throws Throwable
{
		WebDriverUtility  wutil=new WebDriverUtility();
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
		driver.findElement(By.xpath("//input[@name=\"potentialname\"]"));
		String oppname = eutil.getExcelData("sheet1",1 , 1);
		driver.findElement(By.name("potentialname")).sendKeys(oppname);
		WebElement assignedto = driver.findElement(By.id("related_to_type"));
		wutil.SelectOption(assignedto,"Organizations");
		driver.findElement(By.xpath("(//img[@src=\"themes/softed/images/select.gif\"])[1]")).click();
     	String parent2 = driver.getWindowHandle();
	    Set<String> windows2 = driver.getWindowHandles();
	    Iterator<String> itr2 = windows2.iterator();
	    String p = itr2.next();
	    //System.out.println(p);
	    String c = itr2.next();
	    driver.switchTo().window(c);
	    driver.findElement(By.xpath("//a[text()='kiran']")).click();
	    driver.switchTo().window(p);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//img[@alt=\"Select\"])[2]")).click();
	    
	    
	 String parent3 = driver.getWindowHandle();
	     Set<String> windows3 = driver.getWindowHandles();
	    Iterator<String> itr3 = windows3.iterator();
	    String p1 = itr3.next();
	    //System.out.println(p);
	    String d = itr3.next();
	    driver.switchTo().window(d);
	    driver.findElement(By.xpath("(//a[text()='TYSS'])[2]")).click();
	    
	    driver.switchTo().window(p1);
	    WebElement closingdate = driver.findElement(By.name("closingdate") );
		   closingdate.clear();
		   closingdate.sendKeys("2021-10-18");
		  WebElement salesstage = driver.findElement(By.name("sales_stage"));
		  wutil.SelectOption(salesstage, "Qualification");
		  driver.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement quickcreate = driver.findElement(By.id("qccombo"));
		wutil.SelectOption(quickcreate,"New Campaign" );
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("TYSS");	
		WebElement campaigntype = driver.findElement(By.name("campaigntype"));
		wutil.SelectOption(campaigntype,"Trade Show");
		driver.findElement(By.xpath("//img[@alt=\"Select\"]")).click();
        Set<String> address = driver.getWindowHandles();
		Iterator<String> itr = address.iterator();
		String p = itr.next();
		String c = itr.next();
		driver.switchTo().window(c);
		driver.switchTo().window(p);
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
		  WebElement closingdate = driver.findElement(By.name("closingdate") );
		   closingdate.clear();
		   closingdate.sendKeys("2021-10-18");
		   
		   driver.findElement(By.xpath("(//input[@title=\"Cancel [Alt+X]\"])[1]")).click();
		   
		  // driver.findElement(By.xpath("//img[@alt=\"Select\"]")).click();
	
		//a.sendKeys("vfgv");
		//driver.findElement(By.xpath("//input[@value='T']")).click();
		
		//driver.close();
		//driver.findElement(By.xpath("//input[@value='T']")).click();//{"method":"xpath","selector":"//input[@value='T']"}
		//driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys("kkk");
	
		/*driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		
		String oppname = eutil.getExcelData("sheet1", 1, 1);
		driver.findElement(By.name("potentialname")).sendKeys(oppname);
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click()	;	
		WebElement assignedto = driver.findElement(By.name("assigntype"));
		wutil.SelectOption(assignedto, " Administrator");*/
	
		
	
}}
