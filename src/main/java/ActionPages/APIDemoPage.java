package ActionPages;
import static org.testng.Assert.assertEquals;
import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import Core.ExtentReport;
import Utility.CommonUtility;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class APIDemoPage extends ExtentReport {
	AndroidDriver<WebElement> driver;
	
	public APIDemoPage(AndroidDriver<WebElement> driver) throws MalformedURLException {
		this.driver=driver;	
	}
	CommonUtility commonutility;
	public void verticalScrolling() {
		driver.findElementByAccessibilityId("Views").click();
		AndroidElement list=(AndroidElement)driver.findElementByAccessibilityId("Views");
		MobileElement listitem = (MobileElement) driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().description(\"Switches\"));"));
		listitem.click();
		driver.findElementByXPath("//android.widget.Switch[@content-desc=\"Standard switch\"]\r\n").click();
		commonutility=new CommonUtility(driver);
		commonutility.navigateBack();	
	}
	public void button() {
		AndroidElement list=(AndroidElement)driver.findElementByAccessibilityId("Views");
		MobileElement listitem = (MobileElement) driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().description(\"Buttons\"));"));
		listitem.click();
		driver.findElementByAccessibilityId("Buttons").click();
		driver.findElementByAccessibilityId("Toggle").click();
		String actual = driver.findElementByAccessibilityId("Toggle").getText();
		assertEquals(actual,"ON");
		
		
	}
}


