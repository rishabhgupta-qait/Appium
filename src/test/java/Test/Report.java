package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	@BeforeTest
	public static void reportSetUp() {
		System.out.println("hii");
		htmlReporter = new ExtentHtmlReporter("extent.html");		// start reporters
        extent = new ExtentReports();						// create ExtentReports and attach reporter(s)
        extent.attachReporter(htmlReporter);
        test = extent.createTest("MyFirstTest", "Sample description");
	}
	
	@AfterTest
	public static void reportTearDown() {
		extent.flush();
	}

}
