package ActionPages;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import Core.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DialPage  {
	public static DesiredCapabilities dc;
	public static AndroidDriver<WebElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		//dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\Rishabh\\Downloads\\apk\\ApiDemos-debug.apk");
		dc.setCapability("appPackage","com.google.android.dialer");
		dc.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	}
	

}
