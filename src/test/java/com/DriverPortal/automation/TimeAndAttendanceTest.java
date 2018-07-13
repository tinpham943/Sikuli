/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import com.DriverPortal.automation.TimeAndAttendanceScreen;;

public class TimeAndAttendanceTest extends BaseTestCase {

	@Test(groups = "eDTA", priority = 1, retryAnalyzer = TimeAndAttendanceTest.class)
	public void PunchinAndPunchOut() throws FindFailed, InterruptedException {
		TimeAndAttendanceScreen edtaS = new TimeAndAttendanceScreen();
		System.out.println("PunchinAndPunchout");
		edtaS.PunchinAndPunchout();
	}

	@Test(groups = "eDTA", priority = 2, retryAnalyzer = TimeAndAttendanceTest.class)
	public void PunchinasAnotherTask() throws FindFailed, InterruptedException {
		TimeAndAttendanceScreen edtaS = new TimeAndAttendanceScreen();
		System.out.println("PunchinAsanotherTask");
		edtaS.PunchinAsanotherTask();
	}
}
