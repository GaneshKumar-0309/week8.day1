package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyViewLeads() {
		String title = getDriver().getTitle();
		if(title.contains("View Leads")) {
			System.out.println("View Leads Page displayed");
		}
		return this;
	}

	public EditLeadPage clickEditLead() {

		getDriver().findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditLeadPage();
	}


	public ViewLeadPage verifyChangedName() {

		String Name = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The Company Name is : "+Name);
		if (Name.contains("Volante Technologies Pvt Limited")) {
			System.out.println("Company Name Succesfully changed");
		} else {
			System.out.println("The Company Name is not changed");
		}
		return this;
	}

	public MyLeadsPage clickDeleteLead() {

		getDriver().findElement(By.linkText("Delete")).click();
		return new MyLeadsPage();
	}

	public DuplicateLeadPage clickDuplicateLead() {

		getDriver().findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage();
	}

}
