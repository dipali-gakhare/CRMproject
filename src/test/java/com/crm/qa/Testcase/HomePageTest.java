package com.crm.qa.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.testingpage;

public class HomePageTest extends Testbase{
	
	Loginpage loginpage;
	Homepage homepage;
	testingpage TestingPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		initializaion();
		loginpage = new Loginpage();
		
		TestingPage = new testingpage();
		homepage= loginpage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		
	}
	
	@Test(priority=1)
	
	public void HomepageTitleTest() {
		String titlepage =homepage.pagetitle();
		Assert.assertEquals(titlepage,"Guru99 Bank Manager HomePage","tittle is not matched");
		
		
		
}
	@Test(priority=2)
	public void TestingLinkTest() {
		TestingPage=homepage.ClickTestinglink();
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=3)
	
	public void SeleniumgpageTest() {
		homepage.ClickSeleniumlink();
		Assert.assertTrue(true);
		
		
	}
   @Test(priority=4)
	
	public void InsurancepageTest() {
		homepage.ClickInsurencelink();
		Assert.assertTrue(true);
		
		
	}
   
   @Test(priority=5)
	
	public void EditCustomerPageTest() {
		homepage.ClickEditCustomerlink();
		Assert.assertTrue(true);
		
		
	}
   
   @Test(priority=6)
	
	public void NewAccountPageTest() {
		homepage.ClicknewAccountlink();
		Assert.assertTrue(true);
		
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
