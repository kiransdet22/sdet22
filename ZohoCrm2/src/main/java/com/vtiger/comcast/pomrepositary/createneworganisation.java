package com.vtiger.comcast.pomrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createneworganisation 
{
	

public createneworganisation(WebDriver driver) 
{
	PageFactory.initElements(driver, this);

}
	public WebElement getOrgnametb() {
	return orgnametb;
}

public WebElement getSavebtn() {
	return savebtn;
}
	@FindBy(name="accountname")
	private WebElement orgnametb;
	
	@FindBy(name="button")
	private WebElement savebtn;

	public void createorg(String orgName) 
	{
		orgnametb.sendKeys(orgName);
		savebtn.click();
	}
}
