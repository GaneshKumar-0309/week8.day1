package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyLeadsPage clickLeadstab() {

		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
	
	public ContactsPage clickContactstab() {

		getDriver().findElement(By.linkText("Contacts")).click();
		return new ContactsPage();
	}
	
	
	
	
	
	
}
