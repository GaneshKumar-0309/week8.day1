package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setup() {
		
		excelName = "Login";
	}
	
	@Test(dataProvider="fetch")
	public void Login(String username,String Password) {
		
		LoginPage lp = new LoginPage();
		lp.typeUsername(username)
		.typePassword(Password)
		.clickLogin()
		.verifyHomePage();
		
		
	}

}
