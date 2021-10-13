package Testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class testjava
{
	@Test
	public void createOppertunites() throws Throwable
{	
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/tool-tips");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     WebElement however1= driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	     Actions act=new Actions(driver);
	     act.moveToElement(however1).perform();
	     
	     WebElement however = driver.findElement(By.xpath("//div[text()='You hovered over the Button']"));
	     String textfeild1 = however.getText();
	     WebElement textfeild = driver.findElement(By.xpath("//input[@placeholder=\"Hover me to see\"]"));
	    textfeild .sendKeys(textfeild1);
}
	}
