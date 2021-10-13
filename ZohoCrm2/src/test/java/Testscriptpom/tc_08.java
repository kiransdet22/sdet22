package Testscriptpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.pomrepositary.createnewopportunitypompage;
import com.vtiger.comcast.pomrepositary.loginpom;
import com.vtiger.comcast.pomrepositary.opportunitypompage;
import com.vtiger.comcast.pomrepositary.vtigerhomepage;

public class tc_08 
{
	@Test()
	public void createopporetunity() {
	String oppname="job1";
	System.setProperty("webdriver.chrome.driver", "./chromedriver93.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://localhost:8888/");
			
	loginpom loginpom = new loginpom(driver);	
	loginpom.logintoapp("admin","manager");
	
	 vtigerhomepage vtigerhomepage = new vtigerhomepage(driver);
	 vtigerhomepage.getOpportunitybtn().click();
	 
	 opportunitypompage opportunitypompage = new opportunitypompage(driver);
	 opportunitypompage.getAddbtn().click();
	 
	 
createnewopportunitypompage createnewopportunitypompage = new createnewopportunitypompage(driver);
createnewopportunitypompage.opptb();
createnewopportunitypompage.related();



	}}
