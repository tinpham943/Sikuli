/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import com.DriverPortal.automation.SelectRouteScreen;

public class SelectRouteTest extends BaseTestCase {

	@Test(groups = "SelectRoute", priority = 1, retryAnalyzer = SelectRouteTest.class)
	public void StartRoute180L() throws FindFailed, InterruptedException {
		SelectRouteScreen SelectR = new SelectRouteScreen();
		System.out.println("StarRoute180L");
		SelectR.StarRoute180L();
	}

	@Test(groups = "SelectRoute", priority = 2, retryAnalyzer = SelectRouteTest.class)
	public void SetupRunGPX() throws FindFailed, InterruptedException {
		SelectRouteScreen SelectR = new SelectRouteScreen();
		System.out.println("SetupRunGPX");
		SelectR.SetupRunGPX();
	}

	@Test(groups = "SelectRoute", priority = 3, retryAnalyzer = SelectRouteTest.class)
	public void BackToDriverPortal() throws FindFailed, InterruptedException {
		SelectRouteScreen SelectR = new SelectRouteScreen();
		System.out.println("BackToDriverPortal");
		SelectR.BackToDriverPortal();
	}
}
