package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MegreContactsPage extends ProjectSpecificMethods {

	public FindContactsPage clickFromContactWidget(){

		getDriver().findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		return new  FindContactsPage();

	}

	public FindContactsPage clickToContactWidget(){

		getDriver().switchTo().window(firstWindowHandle);
		getDriver().findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
		return new FindContactsPage();

	}

	public MegreContactsPage clickMergeContactsButton() {

		getDriver().switchTo().window(firstWindowHandle);
		getDriver().findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
		return this;
	}

	public MegreContactsPage verifyTitle() {
		System.out.println("The title of the current page is "+getDriver().getTitle());
		return this;

	}
}