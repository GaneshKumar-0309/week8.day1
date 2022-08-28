package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods{


	@BeforeTest
	public void setup() {
		excelName = "EditLead";
	}

	@Test(dataProvider="fetch" )
	public void runEditLead(String username,String password,String firstName,String changedCompanyName) throws InterruptedException {

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
		.clickEditLead()
		.changeCompanyName(changedCompanyName)
		.clickUpdate()
		.verifyChangedName();
	}


}
