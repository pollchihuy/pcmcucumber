package coid.juaracoding.pcmcucumber.impl.sociola.login;

import coid.juaracoding.pcmcucumber.config.ContohConfig;
import coid.juaracoding.pcmcucumber.connection.DriverSingleton;
import coid.juaracoding.pcmcucumber.scenariomapping.LoginTesting;
import coid.juaracoding.pcmcucumber.util.Constants;
import coid.juaracoding.pcmcucumber.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class LoginOutlineHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports(GlobalFunction.rootProject+"/"+GlobalFunction.extendReportName +"-main/extentreport/login.html");
	private static LoginTesting[] tests = LoginTesting.values();
	private static final int[] DATA_OUTLINE = {
//			Loose Coupling
//			Tight Coupling
			1,//TC0011 Valid Login
//			1,//TC0021 Empty Login
//			1,//TC0022 Username Dan Password Invalid
//			4,//TC0023 Username Valid Dan Password Invalid
//			1,//TC0024 Username Empty Dan Password Invalid
//			1,//TC0025 Username Valid Dan Password Kosong
//			1,//TC0026 Username Invalid Dan Password Kosong
			1,//TC01111 Input Form Registrasi
			1//TC0141 Validasi Menu Verifikasi
	};
	private String testReport = "";
	
	@Before
	public void setUp() {
//		DriverSingleton.getInstance(Constants.FIREFOX);
//		DriverSingleton.getInstance(Constants.CHROME);
		DriverSingleton.getInstance(ContohConfig.getBrowser());
		driver = DriverSingleton.getDriver();
		testReport = tests[GlobalFunction.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		if(GlobalFunction.countOutline==DATA_OUTLINE[GlobalFunction.testCount])
		{
			GlobalFunction.countOutline=0;
			GlobalFunction.testCount++;
		}
		GlobalFunction.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = GlobalFunction.getScreenshot(driver, GlobalFunction.extendReportName +scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	@AfterAll
	public static void closeBrowser() {
		GlobalFunction.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}
}