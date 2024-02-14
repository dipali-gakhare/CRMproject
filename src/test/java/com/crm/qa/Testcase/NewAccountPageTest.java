package com.crm.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.NewAccountLinkPage;
import com.crm.qa.pages.testingpage;

public class NewAccountPageTest extends Testbase {
	Loginpage loginpage;
	Homepage homepage;
	//testingpage TestingPage;
	NewAccountLinkPage newaccountlinkpage;
	
	
	public NewAccountPageTest() {
		super();
	}
	
	public void setUp() {
		initializaion();
		newaccountlinkpage = new NewAccountLinkPage();
		loginpage = new Loginpage();
		
		//TestingPage = new testingpage();
		homepage= loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
	 homepage.ClicknewAccountlink();
		
	}
	
	@Test
	
	public void verifylebelTest() {
		Assert.assertTrue(true);
		
	}
	
	@Test
	
	public void validateNewAccountpagetest() {
		homepage.ClicknewAccountlink();
		
		
	}
	
   @Test
	
	public void NewAccountTest() {
	
	newaccountlinkpage.NewAccountPage("Dipali", "Current", "Gakhare");
	
	}
	
	
	
	
	
		
	
	

}
