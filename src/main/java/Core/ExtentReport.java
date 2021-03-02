package Core;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReport {
	public ExtentReports extent;
	public ExtentHtmlReporter htmlReporter;
	public ExtentTest test;
	@BeforeTest
	public void reportSetUp() {
		System.out.println("hii");
		htmlReporter = new ExtentHtmlReporter("extent.html");		// start reporters
        extent = new ExtentReports();						// create ExtentReports and attach reporter(s)
        extent.attachReporter(htmlReporter);
        test = extent.createTest("MyFirstTest", "Sample description");
	}
	
	@AfterTest
	public void reportTearDown() {
		extent.flush();
	}

}
