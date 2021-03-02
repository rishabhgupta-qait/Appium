package Core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import ActionPages.APIDemoPage;
import Utility.CommonUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase{
	public static DesiredCapabilities dc;
	public static AndroidDriver<WebElement> driver;
	public APIDemoPage apidemoes;
	public CommonUtility commonutility;
	
	public TestBase() throws MalformedURLException {
		dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\Rishabh\\Downloads\\apk\\ApiDemos-debug.apk");
//		dc.setCapability("appPackage","com.android.calculator2");
//		dc.setCapability("appActivity",".Calculator");
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	}
	
	@BeforeClass
	public void setUp() throws MalformedURLException {
		initialization();
	}
	public void initialization() throws MalformedURLException {
		apidemoes = new APIDemoPage(driver);
		commonutility = new CommonUtility(driver);
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
