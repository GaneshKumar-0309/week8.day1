package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadPage extends ProjectSpecificMethods {


	public DuplicateLeadPage enterCompanyName(String newCompanyName){

		getDriver().findElement(By.id("createLeadForm_companyName")).clear(); 
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(newCompanyName);
		return this;
	}


	public DuplicateLeadPage enterFirstName(String newfirstName){

		getDriver().findElement(By.id("createLeadForm_firstName")).clear();
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(newfirstName);
		return this;
	}

	public ViewLeadPage clickCreateLeadButton(){

		getDriver().findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage();
	}

}
