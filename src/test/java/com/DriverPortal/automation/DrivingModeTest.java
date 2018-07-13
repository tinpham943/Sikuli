/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import com.DriverPortal.automation.DrivingModeScreen;;

public class DrivingModeTest extends BaseTestCase {

	@Test(groups = "DrivingMode", priority = 1, retryAnalyzer = DrivingModeTest.class)
	public void SubmitUnknowStudentID() throws FindFailed, InterruptedException {
		DrivingModeScreen DrivingS = new DrivingModeScreen();
		System.out.println("SubmitUnknowStudentID");
		DrivingS.SubmitUnknowStudentID();
	}

	@Test(groups = "DrivingMode", priority = 2)
	public void SubmitKnowStudentIDatStop() throws FindFailed, InterruptedException {
		DrivingModeScreen DrivingS = new DrivingModeScreen();
		System.out.println("SubmitKnowStudentIDatStop2");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop3");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop4");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop5");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop6");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop7");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop8");
		DrivingS.SubmitKnowStudentIDatStop();
	
	}

	@Test(groups = "DrivingMode", priority = 3, retryAnalyzer = LoginTest.class)
	public void Startnewrun() throws FindFailed, InterruptedException {	
		DrivingModeScreen DrivingS = new DrivingModeScreen();
		System.out.println("StartnewrunFromschool");
		DrivingS.StartnewrunFromschool();
		NoxHome NoxH = new NoxHome();
		NoxH.SettingTimeto4PM15();
		SelectRouteScreen slr = new SelectRouteScreen();
		slr.BackToDriverPortal();
	}
	/*@Test(groups = "DrivingMode", priority = 4)
	public void SubmitALLKnowStudentIDatStopfromschool() throws FindFailed, InterruptedException {
		DrivingModeScreen DrivingS = new DrivingModeScreen();
		System.out.println("SubmitKnowStudentIDatStop2");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop3");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop4");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop5");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop6");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop7");
		DrivingS.SubmitKnowStudentIDatStop();
		System.out.println("SubmitKnowStudentIDatStop8");
		DrivingS.SubmitKnowStudentIDatStop();
	
	}*/
}
