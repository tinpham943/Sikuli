package com.DriverPortal.automation;

import java.io.IOException;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import com.DriverPortal.utils.DataProperties;

@SuppressWarnings("unused")
public class BaseTestCase implements IRetryAnalyzer {

	private App Screen;
	private Process app;
	boolean check;
	private int retryCount = 1;
	private int maxRetryCount = 2;

	@BeforeMethod
	public void setUp() throws InterruptedException, FindFailed {
		app = run();

	}

	private Process run() {
		try {
			return Runtime.getRuntime().exec(DataProperties.get("nox.path"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@AfterSuite
	public void tearDownn() {
		stop();
		System.out.println("close nox");
	}

	private void stop() {
		App.close("Nox");
	}

	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}
