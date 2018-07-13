/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.DriverPortal.automation.NoxHome;

public class KvFullTest extends BaseTestCase {

	@Test(groups = "KvTest", priority = 1, retryAnalyzer = LoginTest.class)
	public void KvTest() throws FindFailed, InterruptedException {
		App.focus("Nox", 1);
		DrivingModeScreen DrivingS = new DrivingModeScreen();
		NoxHome NoxH = new NoxHome();
		SelectRouteScreen Srs = new SelectRouteScreen();
		BuildRouteScreen Brs = new BuildRouteScreen();	
		LoginScreen loginS = new LoginScreen();
		System.out.println("SettingTimeto8AM");
		NoxH.SettingTimeto8AM();
		System.out.println("UninstallDriverPortal");
		NoxH.UninstallDriverPortal();
		System.out.println("OpenFileAndSetupAPK");
		NoxH.OpenFileAndSetupAPK();
		System.out.println("SetNoxHomeAlwaysTrue");
		loginS.SetNoxHomeAlwaysTrue();
		System.out.println("Login");
		loginS.Login();
		System.out.println("TurnOnAirPlanMode");
		NoxH.TurnOnAirPlanMode();
		System.out.println("CreateNewRun");
		Brs.CreateNewRun();
		System.out.println("StarRoute717");
		Srs.StarRoute717();
		System.out.println("SetupRunGPXKv717");
		Srs.SetupRunGPXKv717();
		System.out.println("BackToDriverPortal");
		Srs.BackToDriverPortal();
		System.out.println("SubmitKnowStudentIDatStop1");
		DrivingS.SubmitALLKnowStudentIDatStop1kv();
		System.out.println("SubmitKnowStudentIDatStop2");
		DrivingS.SubmitALLKnowStudentIDatStop2kv();
		System.out.println("SubmitKnowStudentIDatStop3");
		DrivingS.SubmitALLKnowStudentIDatStop3kv();

	}

}
