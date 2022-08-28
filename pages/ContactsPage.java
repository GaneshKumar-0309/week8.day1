package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ContactsPage extends ProjectSpecificMethods {

	
	public MegreContactsPage clickMergeContactsLink() {
		
		getDriver().findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		return new MegreContactsPage();
	}
	
}
