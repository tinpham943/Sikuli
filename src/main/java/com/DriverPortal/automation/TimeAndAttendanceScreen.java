package com.DriverPortal.automation;

import static org.testng.Assert.assertTrue;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import com.DriverPortal.utils.DataProperties;

public class TimeAndAttendanceScreen extends AbstractScreen {

	private Pattern eDTAperformingTask;
	private Pattern eDTApunchAs;
	private Pattern eDTApunchin;
	private Pattern eDTApunchout;
	private Pattern eDTAPunchinSuccess;
	private Pattern eDTAPunchOutSuccess;
	private Pattern eDTAResultPunchinList;
	private Pattern eDTASubmonitor;
	private Pattern eDTAFieldTrips;

	public TimeAndAttendanceScreen() throws FindFailed {
		eDTAperformingTask = new Pattern(DataProperties.getPathURL("eDTAperformingTask.PNG"));
		eDTApunchAs = new Pattern(DataProperties.getPathURL("eDTApunchAs.PNG"));
		eDTApunchin = new Pattern(DataProperties.getPathURL("eDTApunchin.PNG"));
		eDTApunchout = new Pattern(DataProperties.getPathURL("eDTApunchout.PNG"));
		eDTAPunchinSuccess = new Pattern(DataProperties.getPathURL("eDTAPunchinSuccess.PNG"));
		eDTAPunchOutSuccess = new Pattern(DataProperties.getPathURL("eDTAPunchOutSuccess.PNG"));
		eDTAResultPunchinList = new Pattern(DataProperties.getPathURL("eDTAResultPunchinList.PNG"));
		eDTASubmonitor = new Pattern(DataProperties.getPathURL("eDTASubmonitor.PNG"));
		eDTAFieldTrips = new Pattern(DataProperties.getPathURL("eDTAFieldTrips.PNG"));
	}

	public TimeAndAttendanceScreen PunchinAndPunchout() throws FindFailed {
		waitAndClick(eDTApunchin);
		if (isexist(eDTAPunchinSuccess) == true) {
			wait(5.0);
			waitAndClick(eDTApunchout);
		}
		assertTrue(isexist(eDTAPunchOutSuccess));
		return this;
	}

	public TimeAndAttendanceScreen PunchinAsanotherTask() throws FindFailed {
		waitAndClick(eDTApunchAs);
		waitAndClick(eDTASubmonitor);
		waitAndClick(eDTAperformingTask);
		waitAndClick(eDTAFieldTrips);
		waitAndClick(eDTApunchin);
		waituntildisappear(eDTAPunchinSuccess);
		assertTrue(isexist(eDTAResultPunchinList));
		return this;
	}

}
