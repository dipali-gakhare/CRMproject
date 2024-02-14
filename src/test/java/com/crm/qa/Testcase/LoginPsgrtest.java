package com.crm.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class LoginPsgrtest extends Testbase {
	
	Loginpage loginpage;
	Homepage homepage;
	
	public LoginPsgrtest() {
		super();
	}
	@BeforeMethod
	
	public void setUp() {
		initializaion();
		loginpage = new Loginpage();
		
	}
	
	@Test(priority=1)
	public void loginPagetitleTest() {
		
		String title=loginpage.validateloginpagetitle();
		Assert.assertEquals(title,"Guru99 Bank Home Page");
		
	}
	
	@Test(priority=2)
	public void GuruLogopageTest() {
		boolean flash =loginpage.validateGuruLogo();
		Assert.assertTrue(flash);
		
	}
	
	@Test(priority=3)
	public void Logintest() {
		homepage= loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
