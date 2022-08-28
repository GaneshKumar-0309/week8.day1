package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setup() {
		
		excelName = "CreateLead";
	}
	
	
	@Test(dataProvider="fetch")
	public void createLead(String username, String password, String companyName,String firstName,String LastName) {
		
		LoginPage lp = new LoginPage();
		lp.typeUsername(username)
		.typePassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickCrmSfa()
		.clickLeadstab()
		.clickCreateLeadsLink()
		.typeCompanyName(companyName)
		.typefirstName(firstName)
		.typelastName(LastName)
		.clickCreateLeadsButton();
		
		
		
	}

}
