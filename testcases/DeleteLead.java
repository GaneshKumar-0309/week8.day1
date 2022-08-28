package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setup() {
		excelName = "DeleteLead";
	}

	@Test(dataProvider="fetch" )
	public void runDeleteLead(String username,String password,String firstName) throws InterruptedException {

		LoginPage lp = new LoginPage();
		lp.typeUsername(username)
		.typePassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickCrmSfa()
		.clickLeadstab()
		.clickFindLeadsLink()
		.enterFirstName(firstName)
		.clickFindLeadButton()
		.clickFirstResultingLead()
		.clickDeleteLead()
		.clickFindLeadsLink()
		.enterLeadID()
		.clickFindLeadButton()
	    .verifyDeletedLead();
	}
	
	
}
