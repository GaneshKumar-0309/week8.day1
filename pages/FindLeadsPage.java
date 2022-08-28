package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {

	public FindLeadsPage enterFirstName(String fName) {

		getDriver().findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys(fName);
		return this;
	}

	public FindLeadsPage enterLeadID() {

		getDriver().findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(leadID);
		return this;
	}

	public FindLeadsPage clickFindLeadButton() throws InterruptedException {

		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		return this ;
	}

	public ViewLeadPage clickFirstResultingLead() {

		leadID = getDriver().findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).getText();
		getDriver().findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		return new ViewLeadPage();
	}

	public void verifyDeletedLead() {
		String text2 = getDriver().findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(text2.contains("No records")) {
			System.out.println("Successfully deleted");
		}
		else {
			System.out.println("Unsuccessful");
		}

	}
}
