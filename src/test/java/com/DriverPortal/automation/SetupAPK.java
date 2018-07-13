/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.DriverPortal.automation.NoxHome;

public class SetupAPK extends BaseTestCase {

	@Test(groups = "Setup", priority = 1, retryAnalyzer = LoginTest.class)
	public void OpenDriveAndSetup() throws FindFailed, InterruptedException {
		App.focus("Nox", 1);
		NoxHome NoxH = new NoxHome();
		System.out.println("SettingTimeto7AM50");
		NoxH.SettingTimeto7AM50();
	}

	@Test(groups = "Setup", priority = 2, retryAnalyzer = LoginTest.class)
	public void UninstallDriverPortal() throws FindFailed, InterruptedException {
		NoxHome NoxH = new NoxHome();
		System.out.println("UninstallDriverPortal");
		NoxH.UninstallDriverPortal();
	}

	@Test(groups = "Setup", priority = 3, retryAnalyzer = LoginTest.class)
	public void OpenFileAndSetupAPK() throws FindFailed, InterruptedException {
		NoxHome NoxH = new NoxHome();
		System.out.println("OpenFileAndSetupAPK");
		NoxH.OpenFileAndSetupAPK();
	}
}
