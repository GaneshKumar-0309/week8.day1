package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadPage extends ProjectSpecificMethods {

	public EditLeadPage changeCompanyName(String chcompName) {

		//13 Change the company name
		//input[@id='updateLeadForm_companyName']
		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys(chcompName);
		return this;
	}


	public ViewLeadPage clickUpdate() {

		//14 Click Update
		getDriver().findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		return new ViewLeadPage();	
	}

}
