package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MergeContacts extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setup() {
		
		excelName = "Login";
	}
	
	
	@Test(dataProvider="fetch")
	public void runMergeContacts(String username, String password) {
		
		LoginPage lp = new LoginPage();
		lp.typeUsername(username)
		.typePassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickCrmSfa()
		.clickContactstab()
		.clickMergeContactsLink()
		.clickFromContactWidget()
		.clickFirstResltuingContact()
		.clickToContactWidget()
		.clickSecondResltuingContact()
		.clickMergeContactsButton()
		.verifyTitle();
		
		
		
	}

}
