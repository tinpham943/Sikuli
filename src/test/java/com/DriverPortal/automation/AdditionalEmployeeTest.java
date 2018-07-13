/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class AdditionalEmployeeTest extends BaseTestCase {

	@Test(groups = "AE", priority = 1, retryAnalyzer = TimeAndAttendanceTest.class)
	public void Bug35() throws FindFailed, InterruptedException {
		AdditionalEmployeeScreen AEs = new AdditionalEmployeeScreen();
		System.out.println("Bug35");
		AEs.BugID35();
	}

	
}
