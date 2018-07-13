package com.DriverPortal.automation;

import static org.testng.Assert.assertTrue;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import com.DriverPortal.utils.DataProperties;

public class AdditionalEmployeeScreen extends AbstractScreen {

	private Pattern EdulogMenu;
	private Pattern AdditionalEmployeeSection;
	private Pattern AdditionalEmployeeAthleticTripOption;
	private Pattern AdditionalEmployeeGobutton;
	private Pattern AdditionalEmployeeID;
	private Pattern AdditionalEmployeeMechanicOption;
	private Pattern AdditionalEmployeeOptionResults;
	private Pattern AdditionalEmployeePass;
	private Pattern AdditionalEmployeePerformtaskbutton;
	private Pattern AdditionalEmployeePunchinAsbutton;
	private Pattern AdditionalEmployeePunchinbutton;
	private Pattern AdditionalEmployeePunchinListResults;
	private Pattern AdditionalEmployeePunchOUTbutton;
	
	public AdditionalEmployeeScreen() throws FindFailed {
		EdulogMenu = new Pattern(DataProperties.getPathURL("EdulogMenu.PNG"));
		AdditionalEmployeePunchOUTbutton = new Pattern(DataProperties.getPathURL("AdditionalEmployeePunchOUTbutton.PNG"));
		AdditionalEmployeeSection = new Pattern(DataProperties.getPathURL("AdditionalEmployeeSection.PNG"));
		AdditionalEmployeeAthleticTripOption = new Pattern(DataProperties.getPathURL("AdditionalEmployeeAthleticTripOption.PNG"));
		AdditionalEmployeeGobutton = new Pattern(DataProperties.getPathURL("AdditionalEmployeeGobutton.PNG"));
		AdditionalEmployeeID = new Pattern(DataProperties.getPathURL("AdditionalEmployeeID.PNG"));
		AdditionalEmployeeMechanicOption = new Pattern(DataProperties.getPathURL("AdditionalEmployeeMechanicOption.PNG"));
		AdditionalEmployeeOptionResults = new Pattern(DataProperties.getPathURL("AdditionalEmployeeOptionResults.PNG"));
		AdditionalEmployeePass = new Pattern(DataProperties.getPathURL("AdditionalEmployeePass.PNG"));
		AdditionalEmployeePerformtaskbutton = new Pattern(DataProperties.getPathURL("AdditionalEmployeePerformtaskbutton.PNG"));
		AdditionalEmployeePunchinAsbutton = new Pattern(DataProperties.getPathURL("AdditionalEmployeePunchinAsbutton.PNG"));
		AdditionalEmployeePunchinbutton = new Pattern(DataProperties.getPathURL("AdditionalEmployeePunchinbutton.PNG"));
		AdditionalEmployeePunchinListResults = new Pattern(DataProperties.getPathURL("AdditionalEmployeePunchinListResults.PNG"));
		
	}

	public AdditionalEmployeeScreen BugID35() throws FindFailed {
		waitAndClick(EdulogMenu);
		waitAndClick(AdditionalEmployeeSection);
		type(AdditionalEmployeeID,"037505");
		type(AdditionalEmployeePass,"9999");
		waitAndClick(AdditionalEmployeeGobutton);
		waitAndClick(AdditionalEmployeePunchinAsbutton);
		waitAndClick(AdditionalEmployeeMechanicOption);
		waitAndClick(AdditionalEmployeePerformtaskbutton);
		waitAndClick(AdditionalEmployeeAthleticTripOption);
		waitAndClick(AdditionalEmployeePunchinbutton);
		type(AdditionalEmployeeID,"037505");
		type(AdditionalEmployeePass,"9999");
		waitAndClick(AdditionalEmployeeGobutton);
		assertTrue(isexist(AdditionalEmployeeOptionResults));
		assertTrue(isexist(AdditionalEmployeePunchinListResults));
		waitAndClick(AdditionalEmployeePunchOUTbutton);
		type(AdditionalEmployeeID,DataProperties.get("valid.login"));
		paste(AdditionalEmployeePass,DataProperties.get("valid.password"));
		waitAndClick(AdditionalEmployeeGobutton);
		return this;
	}

	

}
