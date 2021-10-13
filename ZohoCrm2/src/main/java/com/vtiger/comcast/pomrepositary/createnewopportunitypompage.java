package com.vtiger.comcast.pomrepositary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class createnewopportunitypompage extends WebDriverUtility
{
   WebDriver driver;
 WebDriverUtility wutil=new WebDriverUtility();
public createnewopportunitypompage  (WebDriver driver) 
{
	PageFactory.initElements(driver, this);

}
	@FindBy(name="potentialname")
	private WebElement oppnameTB;
	
	public WebElement getOppnameTB() 
	{
		return oppnameTB;
	}
	public void opptb() 
	{
		oppnameTB.sendKeys("job");
	}

	@FindBy(xpath="(//img[@src=\"themes/softed/images/select.gif\"])[1]")
	private WebElement plusbtn;
	
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	@FindBy(id="related_to_type")
	private WebElement relatedto;  
	
		
	public WebElement getRelatedto() {
		return relatedto;
	}
	public void related() 
	{
		 SelectOption(relatedto,"Contacts");
	}	
	@FindBy(xpath="(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement savebtn;

	public WebElement getSavebtn()
	{
		return savebtn;
	}




	




}
