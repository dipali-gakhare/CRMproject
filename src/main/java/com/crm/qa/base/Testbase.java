package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.baseutils.testutil;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\DipakB\\eclipse-workspace_selenium\\CRMFree\\src\\main\\java\\com\\crm\\qa\\Config\\config.properties");
			
				prop.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	
		
	}
	
	public static void initializaion() {
		String browsername=prop.getProperty("Browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DipakB\\Desktop\\Dipali Document\\Driver\\chromedriver.exe");  
			 driver =new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
		
		
	}
		
	}
	


