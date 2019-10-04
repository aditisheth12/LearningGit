package com.crm.spectrum.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="user_name")
	WebElement userName;
	@FindBy(name="user_password")
	WebElement passWord;
	@FindBy(id="submitButton")
	WebElement lgbutton;

	public WebElement getUser() {
		return userName;
	}
	
	public WebElement getPasswrd() {
		return passWord;
	}

	public void lpage (String username,String passward) {
		userName.sendKeys(username);
		passWord.sendKeys(passward);
		lgbutton.click();
	}

}
