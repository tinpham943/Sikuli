package com.DriverPortal.automation;

import static org.testng.Assert.assertTrue;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import com.DriverPortal.utils.DataProperties;
import com.DriverPortal.utils.TestLink;

import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;

public class LoginScreen extends AbstractScreen {

	private Pattern DriverId;
	private Pattern Password;
	private Pattern BusId;
	private Pattern LoginButton;
	private Pattern DriverInfo;
	private Pattern GGHome;
	private Pattern HomeKey;
	private Pattern Always;
	private Pattern DriverPortalAPP;
	private Pattern LoginRememberIDButton;
	private Pattern LoginRememberUnchecked;
	private Pattern Logoutbutton;
	private Pattern EdulogMenu;
	private Pattern PopupConfirmYes;
	private Pattern EdulogIcon;
	private Pattern LoginBusIDValue;
	private Pattern loginDriverIDValue;
	private Pattern LoginErrorMessagewrongIDP;
	private Pattern CloseallAppKey;
	private Pattern loginEmtyPasserr;
	private Pattern loginEmtyIDPerr;
	private Pattern loginEmtyAllerr;
	private Pattern loginEmtyfailed3timeerr;
	private Pattern LoginOKbutton;
	private Pattern loginEmtyIDerr;
	int i = 0;

	public LoginScreen() throws FindFailed {
		loginEmtyIDerr = new Pattern(DataProperties.getPathURL("loginEmtyIDerr.PNG"));
		loginEmtyPasserr = new Pattern(DataProperties.getPathURL("loginEmtyPasserr.PNG"));
		loginEmtyIDPerr = new Pattern(DataProperties.getPathURL("loginEmtyIDPerr.PNG"));
		loginEmtyAllerr = new Pattern(DataProperties.getPathURL("loginEmtyAllerr.PNG"));
		loginEmtyfailed3timeerr = new Pattern(DataProperties.getPathURL("loginEmtyfailed3timeerr.PNG"));
		LoginOKbutton = new Pattern(DataProperties.getPathURL("LoginOKbutton.PNG"));
		CloseallAppKey = new Pattern(DataProperties.getPathURL("CloseallAppKey.PNG"));
		LoginErrorMessagewrongIDP = new Pattern(DataProperties.getPathURL("LoginErrorMessagewrongIDP.PNG"));
		LoginBusIDValue = new Pattern(DataProperties.getPathURL("LoginBusIDValue.PNG"));
		loginDriverIDValue = new Pattern(DataProperties.getPathURL("loginDriverIDValue.PNG"));
		EdulogIcon = new Pattern(DataProperties.getPathURL("EdulogIcon.PNG"));
		DriverId = new Pattern(DataProperties.getPathURL("DriverId.PNG"));
		BusId = new Pattern(DataProperties.getPathURL("BusId.PNG"));
		Password = new Pattern(DataProperties.getPathURL("Password.PNG"));
		LoginButton = new Pattern(DataProperties.getPathURL("LoginButton.PNG"));
		DriverInfo = new Pattern(DataProperties.getPathURL("DriverInfo.PNG"));
		GGHome = new Pattern(DataProperties.getPathURL("GGHome.PNG"));
		HomeKey = new Pattern(DataProperties.getPathURL("HomeKey.PNG"));
		Always = new Pattern(DataProperties.getPathURL("Always.PNG"));
		DriverPortalAPP = new Pattern(DataProperties.getPathURL("DriverPortalAPP.PNG"));
		LoginRememberIDButton = new Pattern(DataProperties.getPathURL("LoginRememberIDButton.PNG"));
		LoginRememberUnchecked = new Pattern(DataProperties.getPathURL("LoginRememberUnchecked.PNG"));
		Logoutbutton = new Pattern(DataProperties.getPathURL("Logoutbutton.PNG"));
		EdulogMenu = new Pattern(DataProperties.getPathURL("EdulogMenu.PNG"));
		PopupConfirmYes = new Pattern(DataProperties.getPathURL("PopupConfirmYes.PNG"));

	}

	public LoginScreen SetNoxHomeAlwaysTrue() throws FindFailed {

		while (isexist(EdulogIcon) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait" + 5 * i + "s");
		waitAndClick(HomeKey);
		if (isexist(GGHome) == true) {
			waitAndClick(Always);
			waitAndClick(DriverPortalAPP);
		} else {
			waitAndClick(DriverPortalAPP);
		}

		return this;
	}

	public LoginScreen LoginFailedEmtyPass() throws FindFailed {

		// check emty pass
		waitAndClick(DriverPortalAPP);
		type(BusId, DataProperties.get("valid.busid"));
		type(DriverId, DataProperties.get("invalid.login"));
		waitAndClick(LoginButton);
		assertTrue(isexist(loginEmtyPasserr));
		waitAndClick(CloseallAppKey);
		return this;
	}

	public LoginScreen LoginFailedEmtyID() throws FindFailed {

		// check emty driver ID
		waitAndClick(DriverPortalAPP);
		type(BusId, DataProperties.get("valid.busid"));
		type(Password, DataProperties.get("invalid.password"));
		waitAndClick(LoginButton);
		assertTrue(isexist(loginEmtyIDerr));
		waitAndClick(CloseallAppKey);
		return this;
	}

	public LoginScreen LoginFailedEmtyIDPass() throws FindFailed {

		// check emty ID and Pass
		waitAndClick(DriverPortalAPP);
		type(BusId, DataProperties.get("valid.busid"));
		waitAndClick(LoginButton);
		assertTrue(isexist(loginEmtyIDPerr));
		waitAndClick(CloseallAppKey);
		return this;
	}

	public LoginScreen LoginFailedemtyAll() throws FindFailed {

		// check emty all
		waitAndClick(DriverPortalAPP);
		waitAndClick(LoginButton);
		assertTrue(isexist(loginEmtyAllerr));
		waitAndClick(CloseallAppKey);
		return this;
	}

	public LoginScreen LoginFailed3time() throws FindFailed {

		// check login failed 3time
		waitAndClick(DriverPortalAPP);
		type(BusId, DataProperties.get("valid.busid"));
		type(DriverId, DataProperties.get("invalid.login"));
		type(Password, DataProperties.get("invalid.password"));
		waitAndClick(LoginButton);
		waitAndClick(LoginButton);
		waitAndClick(LoginButton);
		assertTrue(isexist(loginEmtyfailed3timeerr));
		waitAndClick(LoginOKbutton);
		waitAndClick(CloseallAppKey);
		return this;
	}

	public LoginScreen LoginFailed() throws FindFailed {

		if (isexist(LoginButton) == false) {
			waitAndClick(HomeKey);
			waitAndClick(DriverPortalAPP);
		}
		type(BusId, DataProperties.get("valid.busid"));
		type(DriverId, DataProperties.get("invalid.login"));
		type(Password, DataProperties.get("invalid.password"));
		waitAndClick(LoginButton);
		assertTrue(isexist(LoginErrorMessagewrongIDP));
		waitAndClick(CloseallAppKey);

		return this;
	}

	public LoginScreen Login() throws FindFailed {

		if (isexist(LoginButton) == false) {
			waitAndClick(HomeKey);
			waitAndClick(DriverPortalAPP);
			paste(BusId, DataProperties.get("valid.busid"));
			paste(DriverId, DataProperties.get("valid.login"));
			paste(Password, DataProperties.get("valid.password"));
			waitAndClick(LoginRememberIDButton);
			waitAndClick(LoginButton);
			find(DriverInfo);

		} else {
			paste(BusId, DataProperties.get("valid.busid"));
			paste(DriverId, DataProperties.get("valid.login"));
			paste(Password, DataProperties.get("valid.password"));
			waitAndClick(LoginRememberIDButton);
			if (waittheresult(LoginRememberUnchecked) == true) {
				waitAndClick(LoginButton);
			} else {
				waitAndClick(LoginRememberIDButton);
				waitAndClick(LoginButton);
			}
			wait(1.0);
			if (waittheresult(DriverInfo) == true) {
				TestLink.updateTestLinkResult(3, ExecutionStatus.PASSED, "PASSED");
			} else {
				TestLink.updateTestLinkResult(3, ExecutionStatus.FAILED, "FAILED");
			}

		}

		return this;
	}

	

	public LoginScreen ReLogin() throws FindFailed {
		waitAndClick(HomeKey);
		waitAndClick(DriverPortalAPP);
		paste(DriverId, DataProperties.get("valid.login"));
		type(Password, DataProperties.get("valid.password"));
		// waitAndClick(LoginRememberIDButton);
		waitAndClick(LoginButton);
		find(DriverInfo);
		wait(1.0);
		assertTrue(waittheresult(DriverInfo));
		return this;
	}

	public LoginScreen ClearAllField() throws FindFailed {
		if (isexist(LoginButton) == false) {
			waitAndClick(HomeKey);
			waitAndClick(DriverPortalAPP);
		}
		if (isexist(LoginBusIDValue)) {
			DeleteTextof(LoginBusIDValue);
		}
		if (isexist(loginDriverIDValue)) {
			DeleteTextof(loginDriverIDValue);
		}
		return this;
	}

	public LoginScreen Logout() throws FindFailed {
		waitAndClick(EdulogMenu);
		waitAndClick(Logoutbutton);
		waitAndClick(PopupConfirmYes);
		return this;
	}

}
