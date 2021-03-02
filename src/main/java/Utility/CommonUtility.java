package Utility;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CommonUtility {
	AndroidDriver<WebElement> driver;
	public CommonUtility(AndroidDriver<WebElement> driver) {
		this.driver=driver;
	}

//	public CommonUtility() {
//		// TODO Auto-generated constructor stub
//	}

	public void navigateBack() {
		driver.navigate().back();
	}

}
