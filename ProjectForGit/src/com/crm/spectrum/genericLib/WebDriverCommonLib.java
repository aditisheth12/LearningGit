package com.crm.spectrum.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void waitForPageToLoad() {
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElementTOLoad(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	

}
