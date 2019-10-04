package com.crm.spectrum.genericLib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.spectrum.objectRepositoryLib.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	PropertyExcelFileReader genericData=new PropertyExcelFileReader();
	WebDriverCommonLib wLib= new WebDriverCommonLib();	
	
	@BeforeClass
	
	public void beforeClassConfig() throws IOException {
//  String browser=genericData.getPropertyFile("Browser");
		driver= new FirefoxDriver();
		System.out.println("browser is launched");	
	}
	
	@BeforeMethod
	
	public void beforeMethodConfig() throws IOException {
		String url=genericData.getPropertyFile("Url");
		String username=genericData.getPropertyFile("Username");
		String password=genericData.getPropertyFile("Password");
		wLib.waitForPageToLoad();
		BaseClass.driver.get(url);
		LoginPage logpage=PageFactory.initElements(BaseClass.driver, LoginPage.class); 
		String user=genericData.getExcelData("Sheet2", 1, 0);
		String pass=genericData.getExcelData("Sheet2", 1, 1);
		logpage.lpage(user, pass);
		System.out.println("login done");
		
	}
	
	
}
