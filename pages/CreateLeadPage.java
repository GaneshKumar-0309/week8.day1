package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage typeCompanyName(String compName) {

		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
		return this;

	}
	
	public CreateLeadPage typefirstName(String fName) {

		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	public CreateLeadPage typelastName(String lName) {

		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
		
	}
	
	public ViewLeadPage clickCreateLeadsButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
	
	
}
