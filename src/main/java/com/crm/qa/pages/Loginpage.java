package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase{
	
	//pagr factory
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement Loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'here')]")
	WebElement here;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement GuruLogo;
	
	//initialise page objects
	public Loginpage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public boolean validateGuruLogo() {
		return GuruLogo.isDisplayed();
	}
	
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
	
	public Homepage login(String un ,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Loginbtn.click();
		return new Homepage();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
