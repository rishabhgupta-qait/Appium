package Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ActionPages.APIDemoPage;
import Core.TestBase;


public class TestCases extends TestBase {

	public TestCases() throws MalformedURLException {
		super();
	}

	@Test(priority = 0)
	public void verticalScrollingTest() throws IOException {
		//test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		apidemoes.verticalScrolling();
	}
	@Test(priority = 1)
	public void toggle() {
		apidemoes.button();
	}
	

}
