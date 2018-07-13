package com.DriverPortal.automation;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import com.DriverPortal.utils.DataProperties;

public class DrivingModeScreen extends AbstractScreen {

	private Pattern DrivingModeBoardedbutton;
	private Pattern DrivingModeBus1Title;
	private Pattern DrivingModeInputStudentIDfield;
	private Pattern DrivingModeSubmitStudentIDbutton;
	private Pattern DrivingModeUnknowStudentplus1;
	private Pattern DrivingModeCloseStopview;
	private Pattern Route180LstudentStop2;
	private Pattern BoardedStudentStatus;
	private Pattern DrivingModeUnBoardedStudent;
	private Pattern Route180LChangeroutePopup;
	private Pattern Route180LSelectNo;
	private Pattern DrivingModePopupConfirmYes;
	private Pattern Route717Student15378UnBoarded;
	private Pattern Route717Student60913UnBoarded;
	private Pattern Route717Student62871UnBoarded;
	private Pattern Route717Student69226UnBoarded;
	private Pattern Route717Student79106UnBoarded;
	private Pattern Route717ClosepopupInfo;
	private Pattern Route717UNboardedIcon;
	private Pattern Route717BoardedIcon;
	private Pattern Route717NextPage;
	private Pattern Route717Stop2Choice;
	static int i;

	public DrivingModeScreen() throws FindFailed {
		DrivingModePopupConfirmYes = new Pattern(DataProperties.getPathURL("DrivingModePopupConfirmYes.PNG"));
		DrivingModeBoardedbutton = new Pattern(DataProperties.getPathURL("DrivingModeBoardedbutton.PNG"));
		DrivingModeInputStudentIDfield = new Pattern(DataProperties.getPathURL("DrivingModeInputStudentIDfield.PNG"));
		DrivingModeBus1Title = new Pattern(DataProperties.getPathURL("DrivingModeBus1Title.PNG"));
		DrivingModeSubmitStudentIDbutton = new Pattern(
				DataProperties.getPathURL("DrivingModeSubmitStudentIDbutton.PNG"));
		DrivingModeUnknowStudentplus1 = new Pattern(DataProperties.getPathURL("DrivingModeUnknowStudentplus1.PNG"));
		DrivingModeCloseStopview = new Pattern(DataProperties.getPathURL("DrivingModeCloseStopview.PNG"));
		Route180LstudentStop2 = new Pattern(DataProperties.getPathURL("Route180LstudentStop2.PNG"));
		BoardedStudentStatus = new Pattern(DataProperties.getPathURL("BoardedStudentStatus.PNG"));
		DrivingModeUnBoardedStudent = new Pattern(DataProperties.getPathURL("DrivingModeUnBoardedStudent.PNG"));
		Route180LChangeroutePopup = new Pattern(DataProperties.getPathURL("Route180LChangeroutePopup.PNG"));
		Route180LSelectNo = new Pattern(DataProperties.getPathURL("Route180LSelectNo.PNG"));
		Route717Student15378UnBoarded = new Pattern(DataProperties.getPathURL("Route717Student15378UnBoarded.PNG"));
		Route717Student60913UnBoarded = new Pattern(DataProperties.getPathURL("Route717Student60913UnBoarded.PNG"));
		Route717ClosepopupInfo = new Pattern(DataProperties.getPathURL("Route717ClosepopupInfo.PNG"));
		Route717Student62871UnBoarded = new Pattern(DataProperties.getPathURL("Route717Student62871UnBoarded.PNG"));
		Route717Student69226UnBoarded = new Pattern(DataProperties.getPathURL("Route717Student69226UnBoarded.PNG"));
		Route717Student79106UnBoarded = new Pattern(DataProperties.getPathURL("Route717Student79106UnBoarded.PNG"));
		Route717UNboardedIcon = new Pattern(DataProperties.getPathURL("Route717UNboardedIcon.PNG"));
		Route717BoardedIcon = new Pattern(DataProperties.getPathURL("Route717BoardedIcon.PNG"));
		Route717NextPage = new Pattern(DataProperties.getPathURL("Route717NextPage.PNG"));
		Route717Stop2Choice = new Pattern(DataProperties.getPathURL("Route717Stop2Choice.PNG"));
		
	}

	public DrivingModeScreen SubmitUnknowStudentID() throws FindFailed {

		while (isexist(DrivingModeBus1Title) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait" + 5 * i + "s");
		paste(DrivingModeInputStudentIDfield, "UnknowID");
		waitAndClick(DrivingModeSubmitStudentIDbutton);
		waitAndClick(DrivingModeBoardedbutton);
		assertTrue(waittheresult(DrivingModeUnknowStudentplus1));
		waitAndClick(DrivingModeCloseStopview);

		return this;

	}

	public DrivingModeScreen SubmitKnowStudentIDatStop() throws FindFailed {

		while (isexist(Route180LstudentStop2) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait " + 5 * i + "s");
		waitAndClick(DrivingModeUnBoardedStudent);
		waitAndClick(DrivingModeBoardedbutton);
		wait(1.0);
		assertTrue(isexist(BoardedStudentStatus));
		waitAndClick(DrivingModeCloseStopview);
		wait(0.5);
		return this;

	}

	public DrivingModeScreen SubmitALLKnowStudentIDatStop() throws FindFailed {

		while (isexist(DrivingModeUnBoardedStudent) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait " + 5 * i + "s");
		waitAndClick(DrivingModeUnBoardedStudent);
		waitAndClick(DrivingModeBoardedbutton);
		wait(1.0);
		assertTrue(isexist(BoardedStudentStatus));
		waitAndClick(DrivingModeCloseStopview);
		wait(0.5);
		return this;

	}
	public DrivingModeScreen SubmitALLKnowStudentIDatStop1kv() throws FindFailed {

		while (isexist(DrivingModeUnBoardedStudent) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait " + 5 * i + "s");
		int count = 0;
		while (isexist(Route717UNboardedIcon) == true) {
			waitAndClick(Route717UNboardedIcon);
			waitAndClick(DrivingModeBoardedbutton);
			count = count + 1;
			if (count == 5) {
				break;
			}
		}
		// assertTrue(isexist(BoardedStudentStatus));
		waitAndClick(DrivingModeCloseStopview);
		wait(0.5);
		return this;

	}
	public DrivingModeScreen SubmitALLKnowStudentIDatStop2kv() throws FindFailed {

		while (isexist(Route717Stop2Choice) == false) {
			wait(5.0);
			i++;
			if(isexist(Route717Stop2Choice)==true) {
				waitAndClick(Route717Stop2Choice);
				break;
			}
		}
		System.out.println("wait " + 5 * i + "s");
		int count = 0;
		while (isexist(Route717UNboardedIcon) == true) {
			waitAndClick(Route717UNboardedIcon);
			waitAndClick(DrivingModeBoardedbutton);
			count = count + 1;
			if (count == 8) {
				break;
			}
		}
		// assertTrue(isexist(BoardedStudentStatus));
		waitAndClick(DrivingModeCloseStopview);
		wait(0.5);
		return this;

	}


	public DrivingModeScreen SubmitALLKnowStudentIDatStop3kv() throws FindFailed {

		while (isexist(DrivingModeUnBoardedStudent) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait " + 5 * i + "s");
		int count = 0;
		while (isexist(Route717UNboardedIcon) == true) {
			waitAndClick(Route717UNboardedIcon);
			waitAndClick(DrivingModeBoardedbutton);
			count = count + 1;
			if (count == 11) {
				waitAndClick(Route717NextPage);
			}
			if (count == 33) {
				break;
			}

		}

		// assertTrue(isexist(BoardedStudentStatus));
		waitAndClick(DrivingModeCloseStopview);
		wait(0.5);
		return this;

	}

	public DrivingModeScreen CancleStartnewrun() throws FindFailed {
		while (isexist(Route180LChangeroutePopup) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait" + 5 * i + "s");
		waitAndClick(Route180LSelectNo);
		assertFalse(isexist(Route180LChangeroutePopup));
		return this;

	}

	public DrivingModeScreen StartnewrunFromschool() throws FindFailed {
		while (isexist(Route180LChangeroutePopup) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait" + 5 * i + "s");
		waitAndClick(DrivingModePopupConfirmYes);
		assertFalse(isexist(Route180LChangeroutePopup));
		return this;

	}

}