package testscriptorg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.ExcelUtilities;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtilites;

import com.crm.vtiger.GenericUtils.WebDriverUtility;
import com.vtiger.comcast.pomrepositary.createnewopportunitypompage;
import com.vtiger.comcast.pomrepositary.createneworganisation;
import com.vtiger.comcast.pomrepositary.loginpom;
import com.vtiger.comcast.pomrepositary.organisationpompage;
import com.vtiger.comcast.pomrepositary.vtigerhomepage;

public class TC_01createorg {
	@Test
	public void createorganisation() throws Throwable 
	{
		 //object created
		ExcelUtilities Elib = new ExcelUtilities();
	    FileUtility Flib = new  FileUtility();
	    JavaUtilites Jlib = new JavaUtilites();
	    WebDriverUtility Wutil = new WebDriverUtility();
	   // WebDriver driver=null;
	    /*read common data*/
	    String Browser = Flib.getPropertyKeyValue("Browser");
	    String url = Flib.getPropertyKeyValue("url");
	    String username = Flib.getPropertyKeyValue("username");
	    String password = Flib.getPropertyKeyValue("password");
	    
	    /**
	     * read test data
	     */
	    String orgName = Elib.getExcelData("sheet1", 1, 2)+"_"+Jlib.getRandomData();
	    
	    /**
	     * launch browser
	     */
	    System.setProperty("webdriver.chrome.driver", "./chromedriver93.exe");
	  WebDriver  driver=new ChromeDriver();
	    
	    /**
	     * logintoapp
	     */
	    
	    driver.get(url);
	    loginpom lp=new loginpom(driver);
	    lp.logintoapp(username,password);
	    
	    /**
	     * navigate to org page
	     */
	    vtigerhomepage hp=new vtigerhomepage(driver);
	    hp.getOrglink().click();
	    /**
	     * navigate to organisation page
	     */
	    
	    organisationpompage op=new organisationpompage(driver);
	    op.getOgraddbtn().click();
	    
	    
	    /**
	     * create organisation
	     *
	     */
	    

	 createneworganisation cnog=new createneworganisation(driver);   
	    cnog.createorg(orgName);
	    
	    
	   hp.logout(); 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}}
