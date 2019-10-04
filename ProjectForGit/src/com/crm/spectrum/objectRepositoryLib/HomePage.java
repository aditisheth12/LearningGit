package com.crm.spectrum.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contact;
	
	public void getcontactModule() {
		contact.click();
		
	}

}
