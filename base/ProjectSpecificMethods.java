package base;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class ProjectSpecificMethods {


	public String excelName ="";
	public static String leadID;
	public static String firstWindowHandle,secondWindowHandle,thirdWindowHandle;
	public static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
	
	
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
		
	}
	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
		
	}
	
	@BeforeMethod
	public void init() {
		
       
		WebDriverManager.chromedriver().setup();
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@DataProvider(name="fetch",indices = 0)
	public String[][] fetchData() throws IOException {
		
		String[][] data = ReadExcelData.readData(excelName);
		return data;
	}
}
