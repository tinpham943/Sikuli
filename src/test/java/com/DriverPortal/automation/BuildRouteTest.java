/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;


public class BuildRouteTest extends BaseTestCase {

	@Test(groups = "BuildRoute", priority = 1, retryAnalyzer = SelectRouteTest.class)
	public void bug186() throws FindFailed, InterruptedException {
		BuildRouteScreen BRs = new BuildRouteScreen();
		System.out.println("Bug186");
		BRs.bug186();
	}
}
