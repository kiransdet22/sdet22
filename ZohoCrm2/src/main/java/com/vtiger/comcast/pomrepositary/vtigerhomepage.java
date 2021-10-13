package com.vtiger.comcast.pomrepositary;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class vtigerhomepage 
{
     WebDriver driver;
	@FindBy(xpath="(//a[text()='Opportunities'])[1]")
	private WebElement opportunitybtn;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement Administratorbtn; 
	
	@FindBy(xpath="//a[text()='Sign Out']")
	 private WebElement   signoutbtn;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement orglink;
	
	
	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getOpportunitybtn() {
		return opportunitybtn;
	}

	public WebElement getSignbtn() {
		return Administratorbtn;
	}
	
	
	public vtigerhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}	
	public WebElement getSignoutbtn() {
		return signoutbtn;
		}
	public void logout() 
	{
		//Actions act=new  Actions(driver);
		//act.moveToElement(Administratorbtn).perform();
		//signoutbtn.click();
		WebDriverUtility wutil=new WebDriverUtility();
		wutil.mouseHover(driver,signoutbtn);
		signoutbtn.click();
	}

	
	}
	
	
	
	

