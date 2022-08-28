package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class FindContactsPage extends ProjectSpecificMethods {


	public MegreContactsPage clickFirstResltuingContact() {

		Set<String> windowHandles = getDriver().getWindowHandles();
		List<String> windowHandleList = new ArrayList<String>(windowHandles);
		firstWindowHandle = windowHandleList.get(0);
		secondWindowHandle = windowHandleList.get(1);
		getDriver().switchTo().window(secondWindowHandle);
		getDriver().findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		return new MegreContactsPage();
	}

	public MegreContactsPage clickSecondResltuingContact() {

		Set<String> windowHandles1 = getDriver().getWindowHandles();
		List<String> windowHandleList2 = new ArrayList<String>(windowHandles1);
		thirdWindowHandle = windowHandleList2.get(1);
		getDriver().switchTo().window(thirdWindowHandle);
		getDriver().findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		return new MegreContactsPage();
	}

}
