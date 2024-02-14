package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.Testbase;

public class NewAccountLinkPage extends Testbase {
	
	@FindBy(name="cusid")
	WebElement CustomerID;
	
	
	@FindBy(name="inideposit")
	WebElement Initialdeposite;
	
	@FindBy(name="button2")
	WebElement SubmitButton;
	
	
	public String validateText() {
		return driver.getTitle();
	}
	public void NewAccountPage(String Nm, String IN,String Deposite ) {
		CustomerID.sendKeys(Nm);
		Select select = new Select(driver.findElement(By.xpath("//tbody/tr[3]/td[2]/select[1]")));
		select.deselectByVisibleText(IN);
		Initialdeposite.sendKeys(Deposite);
		SubmitButton.click();
		
		
		
		
		
		
		
		
		
		
	}


}
