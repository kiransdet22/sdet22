package com.vtiger.comcast.pomrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpom 
{
@FindBy(name="user_name")
private WebElement usernameTB; 

@FindBy(name="user_password")
private WebElement passwordTB;

@FindBy(id="submitButton")
private WebElement loginbtn;


public loginpom(WebDriver driver) 
{
	PageFactory.initElements(driver, this);

}

public WebElement getUsernameTB() {
	return usernameTB;
}

public WebElement getPasswordTB() {
	return passwordTB;
}

public WebElement getLoginbtn() {
	return loginbtn;
}

public WebElement getGet() {
	return loginbtn;
}

public void logintoapp(String username, String password) 
{
	usernameTB.sendKeys(username);
	passwordTB.sendKeys(password);
	loginbtn.click();
	

}


























}
