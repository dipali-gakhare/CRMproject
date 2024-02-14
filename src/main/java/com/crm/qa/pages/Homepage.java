package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Homepage extends Testbase {
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]/img[1]")
	WebElement TestingLink;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/a[1]/img[1]")
	WebElement SeleniumLink;
	
	@FindBy(xpath="//a[contains(text(),'Insurance Project')]")
	WebElement InsuranceLink;
	

	@FindBy(xpath="//a[contains(text(),'Edit Customer')]")
	WebElement EditCustomerLink;
	
	
	@FindBy(xpath="//a[contains(text(),'New Account')]")
	WebElement NewAccountLink;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String pagetitle() {
		
		return driver.getTitle();
	}
	
	public testingpage ClickTestinglink() {
		TestingLink.click();
		return new testingpage();
		
	}
	public Seleniumgpage ClickSeleniumlink() {
		SeleniumLink.click();
		return new Seleniumgpage();
		
	}
	public Insurancepage ClickInsurencelink() {
		InsuranceLink.click();
		return new Insurancepage();
		
	}
	
	public EditCustomerPage ClickEditCustomerlink() {
		EditCustomerLink.click();
		return new EditCustomerPage();
		
	}
	
	public NewAccountLinkPage ClicknewAccountlink() {
		
		NewAccountLink.click();
		return new NewAccountLinkPage();
		
		
	}
	
	
	
	
	
	
	
	
	

}
