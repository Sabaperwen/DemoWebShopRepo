package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ItestListnerUtility extends BaseClass implements ITestListener {
	//to write all the method right click source override/implements method and choose methods and ok

	public static ExtentReports report;
	ExtentSparkReporter reporter; 
	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Report/demo.html");
		//here we will store the report in Report folder and that demo.html is the report name where the report is present
		reporter.config().setTheme(Theme.STANDARD);//it will display the report in dark mode
		reporter.config().setDocumentTitle("This is sample report");//it will display the title of the report
		reporter.config().setReportName("this is selenium");

		report=new ExtentReports();

		report.attachReporter(reporter);
	}
	public void onTestStart(ITestResult result) {
		logger=report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "The test is passed");
	}

	public void onTestFailure(ITestResult result) {
		logger.addScreenCaptureFromPath(screenshot.capturingScreenshot(result.getName()));
		logger.log(Status.FAIL, "The test is failed");

	}


	public void onFinish(ITestContext context) {
		report.flush();
	}


}
