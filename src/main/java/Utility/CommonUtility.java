package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CommonUtility {
	 public static AndroidDriver<WebElement> driver;
	public CommonUtility(AndroidDriver<WebElement> driver) {
		this.driver=driver;
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void waitForDisplay() throws InterruptedException {
		
	}

}
