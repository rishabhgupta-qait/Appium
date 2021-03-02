package ActionPages;
import static org.testng.Assert.assertEquals;
import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import Core.ExtentReport;
import static Utility.CommonUtility.*;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
//import static Test.Report.*;

public class APIDemoPage {
	AndroidDriver<WebElement> driver;
	public APIDemoPage(AndroidDriver<WebElement> driver) throws MalformedURLException {
		this.driver=driver;	
	}
	public void verticalScrolling() {
		driver.findElementByAccessibilityId("Views").click();
		AndroidElement list=(AndroidElement)driver.findElementByAccessibilityId("Views");
		MobileElement listitem = (MobileElement) driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().description(\"Switches\"));"));
		listitem.click();
		driver.findElementByXPath("//android.widget.Switch[@content-desc=\"Standard switch\"]\r\n").click();
		navigateBack();	
	}
	
	public void button() {
		MobileElement listitem = (MobileElement) driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().description(\"Buttons\"));"));
		listitem.click();
		driver.findElementByAccessibilityId("Normal").click();
		driver.findElementByAccessibilityId("Toggle").click();
		String actual = driver.findElementByAccessibilityId("Toggle").getText();
		assertEquals(actual,"ON");	
	}
	
	public void dragAndDrop() throws InterruptedException {
		navigateBack();
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]").click();
		WebElement source= driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		WebElement target= driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		TouchAction action=new  TouchAction((PerformsTouchActions)driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
	}
	
}


