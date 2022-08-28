package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setup() {
		
		excelName = "DuplicateLead";
	}
	
	
	@Test(dataProvider="fetch")
	public void runDuplicateLead(String username, String password, String companyName,String firstName,String LastName,String newCompanyName,String newfirstName) {
		
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
		.clickCreateLeadsButton()
		.clickDuplicateLead()
		.enterCompanyName(newCompanyName)
		.enterFirstName(newfirstName)
		.clickCreateLeadButton()
		.verifyViewLeads();
		
		
		
		
	}

}
