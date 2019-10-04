package com.crm.spectrum.invoice;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.spectrum.genericLib.BaseClass;
import com.crm.spectrum.objectRepositoryLib.HomePage;

public class TestCreateInvoiceScript extends BaseClass {
@Test
 public void createInvoice() {
	HomePage hpage= PageFactory.initElements(BaseClass.driver,HomePage.class);	
	hpage.getcontactModule();
	
}

}
