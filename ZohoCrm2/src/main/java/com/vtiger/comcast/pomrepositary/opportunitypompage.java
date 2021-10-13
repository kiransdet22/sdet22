package com.vtiger.comcast.pomrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opportunitypompage 
{
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement addbtn;

	

public  opportunitypompage(WebDriver driver)
{
	PageFactory.initElements(driver, this);

}




public WebElement getAddbtn() {
	return addbtn;
}

	
	
	
	
	
	
	
	
	
	
	
}
