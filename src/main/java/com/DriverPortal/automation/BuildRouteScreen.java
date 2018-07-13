package com.DriverPortal.automation;

import static org.testng.Assert.assertTrue;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import com.DriverPortal.utils.DataProperties;

public class BuildRouteScreen extends AbstractScreen {

	private Pattern PopupConfirmYes;
	private Pattern SelectRouteSection;
	private Pattern EdulogMenu;
	private Pattern BuildNewRouteButton;
	private Pattern BuildNewRouteCmt;
	private Pattern BuildNewRouteCreateRunButton;
	private Pattern BuildNewRouteErrorpopup;
	private Pattern BuildNewRouteFinishedbuildRoute;
	private Pattern BuildNewRouteID;
	private Pattern BuildNewRouteNumofStudent;
	private Pattern BuildNewRouteOKButton;
	private Pattern BuildNewRoutePlannedTimeButton;
	private Pattern BuildNewRouteRunID;
	private Pattern BuildNewRouteSetNewStop;
	private Pattern BuildNewRouteStartButton;
	private Pattern BuildNewRouteStopCmt;
	private Pattern BuildNewRouteStopID;
	private Pattern BuildNewRouteFinishSetnewStop;
	private Pattern BuildNewRouteUploadButton;
	String randomId = createRandomIdByDate();

	public BuildRouteScreen() throws FindFailed {

		PopupConfirmYes = new Pattern(DataProperties.getPathURL("PopupConfirmYes.PNG"));
		SelectRouteSection = new Pattern(DataProperties.getPathURL("SelectRouteSection.PNG"));
		EdulogMenu = new Pattern(DataProperties.getPathURL("EdulogMenu.PNG"));
		BuildNewRouteButton = new Pattern(DataProperties.getPathURL("BuildNewRouteButton.PNG"));
		BuildNewRouteCmt = new Pattern(DataProperties.getPathURL("BuildNewRouteCmt.PNG"));
		BuildNewRouteCreateRunButton = new Pattern(DataProperties.getPathURL("BuildNewRouteCreateRunButton.PNG"));
		BuildNewRouteErrorpopup = new Pattern(DataProperties.getPathURL("BuildNewRouteErrorpopup.PNG"));
		BuildNewRouteFinishedbuildRoute = new Pattern(DataProperties.getPathURL("BuildNewRouteFinishedbuildRoute.PNG"));
		BuildNewRouteID = new Pattern(DataProperties.getPathURL("BuildNewRouteID.PNG"));
		BuildNewRouteNumofStudent = new Pattern(DataProperties.getPathURL("BuildNewRouteNumofStudent.PNG"));
		BuildNewRouteOKButton = new Pattern(DataProperties.getPathURL("BuildNewRouteOKButton.PNG"));
		BuildNewRoutePlannedTimeButton = new Pattern(DataProperties.getPathURL("BuildNewRoutePlannedTimeButton.PNG"));
		BuildNewRouteRunID = new Pattern(DataProperties.getPathURL("BuildNewRouteRunID.PNG"));
		BuildNewRouteSetNewStop = new Pattern(DataProperties.getPathURL("BuildNewRouteSetNewStop.PNG"));
		BuildNewRouteStartButton = new Pattern(DataProperties.getPathURL("BuildNewRouteStartButton.PNG"));
		BuildNewRouteStopCmt = new Pattern(DataProperties.getPathURL("BuildNewRouteStopCmt.PNG"));
		BuildNewRouteStopID = new Pattern(DataProperties.getPathURL("BuildNewRouteStopID.PNG"));
		BuildNewRouteFinishSetnewStop = new Pattern(DataProperties.getPathURL("BuildNewRouteFinishSetnewStop.PNG"));
		BuildNewRouteUploadButton = new Pattern(DataProperties.getPathURL("BuildNewRouteUploadButton.PNG"));
	
	}

	public BuildRouteScreen bug186() throws FindFailed {
		waitAndClick(EdulogMenu);
		waitAndClick(SelectRouteSection);
		waitAndClick(BuildNewRouteButton);
		paste(BuildNewRouteID, "Route"+randomId);
		paste(BuildNewRouteCmt, "Route"+randomId);
		waitAndClick(BuildNewRouteStartButton);
		paste(BuildNewRouteRunID, "Run"+randomId);
		waitAndClick(BuildNewRoutePlannedTimeButton);
		waitAndClick(BuildNewRouteOKButton);
		waitAndClick(BuildNewRouteCreateRunButton);
		waitAndClick(BuildNewRouteSetNewStop);
		paste(BuildNewRouteStopID, "Stop"+randomId);
		paste(BuildNewRouteStopCmt, "Stop"+randomId);
		paste(BuildNewRouteNumofStudent, "1");
		waitAndClick(BuildNewRouteFinishSetnewStop);
		waitAndClick(BuildNewRouteSetNewStop);
		paste(BuildNewRouteStopID, "Stop2"+randomId);
		paste(BuildNewRouteStopCmt, "Stop2"+randomId);
		paste(BuildNewRouteNumofStudent, "1");
		waitAndClick(BuildNewRouteFinishSetnewStop);
		waitAndClick(BuildNewRouteFinishedbuildRoute);
		waitAndClick(PopupConfirmYes);
		waitAndClick(BuildNewRouteUploadButton);
		paste(BuildNewRouteID, "Route"+randomId);
		paste(BuildNewRouteCmt, "Route"+randomId);
		waitAndClick(BuildNewRouteStartButton);
		assertTrue(isexist(BuildNewRouteErrorpopup));
		return this;
	}
	public BuildRouteScreen CreateNewRun() throws FindFailed {
		waitAndClick(EdulogMenu);
		waitAndClick(SelectRouteSection);
		waitAndClick(BuildNewRouteButton);
		paste(BuildNewRouteID, "Route"+randomId);
		paste(BuildNewRouteCmt, "Route"+randomId);
		waitAndClick(BuildNewRouteStartButton);
		paste(BuildNewRouteRunID, "Run"+randomId);
		waitAndClick(BuildNewRoutePlannedTimeButton);
		waitAndClick(BuildNewRouteOKButton);
		waitAndClick(BuildNewRouteCreateRunButton);
		waitAndClick(BuildNewRouteSetNewStop);
		paste(BuildNewRouteStopID, "Stop"+randomId);
		paste(BuildNewRouteStopCmt, "Stop"+randomId);
		paste(BuildNewRouteNumofStudent, "1");
		waitAndClick(BuildNewRouteFinishSetnewStop);
		waitAndClick(BuildNewRouteSetNewStop);
		paste(BuildNewRouteStopID, "Stop2"+randomId);
		paste(BuildNewRouteStopCmt, "Stop2"+randomId);
		paste(BuildNewRouteNumofStudent, "1");
		waitAndClick(BuildNewRouteFinishSetnewStop);
		waitAndClick(BuildNewRouteFinishedbuildRoute);
		waitAndClick(PopupConfirmYes);
		waitAndClick(BuildNewRouteUploadButton);
		return this;
	}



	
}
