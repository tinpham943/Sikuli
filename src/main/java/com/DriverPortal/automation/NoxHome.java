package com.DriverPortal.automation;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import com.DriverPortal.utils.DataProperties;

public class NoxHome extends AbstractScreen {
	private Pattern Setting;
	private Pattern SettingApp;
	private Pattern SettingDriverportal;
	private Pattern UninstallDP;
	private Pattern SettingconfirmOK;
	private Pattern HomeKey;
	private Pattern APKDirection;
	private Pattern OpenAPKFile;
	private Pattern OpenSelectedApkFile;
	private Pattern NoxDatetimeSetting;
	private Pattern NoxDatetimeSettingOK;
	private Pattern NoxSearchSetting;
	private Pattern NoxSearchSettingTextField;
	private Pattern NoxSettime;
	private Pattern NoxSettime50Min;
	private Pattern NoxSettime00Min;
	private Pattern NoxSettime7AM;
	private Pattern NoxSettime8AM;
	private Pattern NoxSettingMore;
	private Pattern NoxSettingAirplanModeActive;
	private Pattern NoxSettingAirplanModeOn;
	private Pattern NoxSettimeAM;
	private Pattern NoxSettimeBacktoMainSetting;
	private Pattern DriverPortalAPP;
	private Pattern NoxSettime16h;
	private Pattern NoxSettime15min;
	int i;

	public NoxHome() throws FindFailed {
		NoxSettingAirplanModeOn = new Pattern(DataProperties.getPathURL("NoxSettingAirplanModeOn.PNG"));
		NoxSettingAirplanModeActive = new Pattern(DataProperties.getPathURL("NoxSettingAirplanModeActive.PNG"));
		NoxSettingMore = new Pattern(DataProperties.getPathURL("NoxSettingMore.PNG"));
		OpenSelectedApkFile = new Pattern(DataProperties.getPathURL("OpenSelectedApkFile.PNG"));
		DriverPortalAPP = new Pattern(DataProperties.getPathURL("DriverPortalAPP.PNG"));
		HomeKey = new Pattern(DataProperties.getPathURL("HomeKey.PNG"));
		OpenAPKFile = new Pattern(DataProperties.getPathURL("OpenAPKFile.PNG"));
		APKDirection = new Pattern(DataProperties.getPathURL("APKDirection.PNG"));
		Setting = new Pattern(DataProperties.getPathURL("Setting.PNG"));
		SettingApp = new Pattern(DataProperties.getPathURL("SettingApp.PNG"));
		SettingDriverportal = new Pattern(DataProperties.getPathURL("SettingDriverportal.PNG"));
		UninstallDP = new Pattern(DataProperties.getPathURL("UninstallDP.PNG"));
		SettingconfirmOK = new Pattern(DataProperties.getPathURL("SettingconfirmOK.PNG"));
		NoxDatetimeSetting = new Pattern(DataProperties.getPathURL("NoxDatetimeSetting.PNG"));
		NoxDatetimeSettingOK = new Pattern(DataProperties.getPathURL("NoxDatetimeSettingOK.PNG"));
		NoxSearchSettingTextField = new Pattern(DataProperties.getPathURL("NoxSearchSettingTextField.PNG"));
		NoxSettime50Min = new Pattern(DataProperties.getPathURL("NoxSettime50Min.PNG"));
		NoxSettime00Min = new Pattern(DataProperties.getPathURL("NoxSettime00Min.PNG"));
		NoxSettime = new Pattern(DataProperties.getPathURL("NoxSettime.PNG"));
		NoxSettime7AM = new Pattern(DataProperties.getPathURL("NoxSettime7AM.PNG"));
		NoxSettime8AM = new Pattern(DataProperties.getPathURL("NoxSettime8AM.PNG"));
		NoxSettimeAM = new Pattern(DataProperties.getPathURL("NoxSettimeAM.PNG"));
		NoxSettime16h = new Pattern(DataProperties.getPathURL("NoxSettime16h.PNG"));
		NoxSettime15min = new Pattern(DataProperties.getPathURL("NoxSettime15min.PNG"));
		NoxSearchSetting = new Pattern(DataProperties.getPathURL("NoxSearchSetting.PNG"));
		NoxSettimeBacktoMainSetting = new Pattern(DataProperties.getPathURL("NoxSettimeBacktoMainSetting.PNG"));
		OpenSelectedApkFile = new Pattern(DataProperties.getPathURL("OpenSelectedApkFile.PNG"));
		HomeKey = new Pattern(DataProperties.getPathURL("HomeKey.PNG"));
		OpenAPKFile = new Pattern(DataProperties.getPathURL("OpenAPKFile.PNG"));
		APKDirection = new Pattern(DataProperties.getPathURL("APKDirection.PNG"));
		Setting = new Pattern(DataProperties.getPathURL("Setting.PNG"));
		SettingApp = new Pattern(DataProperties.getPathURL("SettingApp.PNG"));
		SettingDriverportal = new Pattern(DataProperties.getPathURL("SettingDriverportal.PNG"));
		UninstallDP = new Pattern(DataProperties.getPathURL("UninstallDP.PNG"));
		SettingconfirmOK = new Pattern(DataProperties.getPathURL("SettingconfirmOK.PNG"));
		NoxDatetimeSetting = new Pattern(DataProperties.getPathURL("NoxDatetimeSetting.PNG"));
		NoxDatetimeSettingOK = new Pattern(DataProperties.getPathURL("NoxDatetimeSettingOK.PNG"));
		NoxSearchSettingTextField = new Pattern(DataProperties.getPathURL("NoxSearchSettingTextField.PNG"));
		NoxSettime50Min = new Pattern(DataProperties.getPathURL("NoxSettime50Min.PNG"));
		NoxSettime = new Pattern(DataProperties.getPathURL("NoxSettime.PNG"));
		NoxSettime7AM = new Pattern(DataProperties.getPathURL("NoxSettime7AM.PNG"));
		NoxSettimeAM = new Pattern(DataProperties.getPathURL("NoxSettimeAM.PNG"));
		NoxSearchSetting = new Pattern(DataProperties.getPathURL("NoxSearchSetting.PNG"));
		NoxSettimeBacktoMainSetting = new Pattern(DataProperties.getPathURL("NoxSettimeBacktoMainSetting.PNG"));
	}

	public NoxHome UninstallDriverPortal() throws FindFailed {
		waitAndClick(Setting);
		waitAndClick(SettingApp);
		wait(5.0);
		if (isexist(SettingDriverportal) == true) {
			waitAndClick(SettingDriverportal);
			waitAndClick(UninstallDP);
			wait(2.0);
			waitAndClick(SettingconfirmOK);
			waitAndClick(HomeKey);
		} else {
			waitAndClick(HomeKey);
		}
		return this;
	}
	public NoxHome TurnOnAirPlanMode() throws FindFailed {
		waitAndClick(HomeKey);
		waitAndClick(Setting);
		waitAndClick(NoxSettingMore);
		waitAndClick(NoxSettingAirplanModeOn);
		wait(NoxSettingAirplanModeActive);
		waitAndClick(NoxSettimeBacktoMainSetting);
		return this;
	}
	public NoxHome TurnOffAirPlanMode() throws FindFailed {
		waitAndClick(HomeKey);
		waitAndClick(Setting);
		waitAndClick(NoxSettingMore);
		waitAndClick(NoxSettingAirplanModeOn);
		waitAndClick(NoxSettimeBacktoMainSetting);
		return this;
	}

	public NoxHome OpenFileAndSetupAPK() throws FindFailed {
		if (isexist(DriverPortalAPP) == true) {
			UninstallDriverPortal();
		}
		waitAndClick(OpenAPKFile);
		paste(APKDirection, DataProperties.get("apk.path"));
		waitAndClick(OpenSelectedApkFile);
		return this;
	}

	public NoxHome SettingTimeto7AM50() throws FindFailed {
		while (isexist(Setting) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait " + 5 * i + "s");
		waitAndClick(Setting);
		waitAndClick(NoxSearchSetting);
		type(NoxSearchSettingTextField, "date");
		waitAndClick(NoxDatetimeSetting);
		waitAndClick(NoxSettime);
		wait(3.0);
		if (isexist(NoxSettimeAM)) {
			waitAndClick(NoxSettimeAM);
		}
		waitAndClick(NoxSettime7AM);
		waitAndClick(NoxSettime50Min);
		waitAndClick(NoxDatetimeSettingOK);
		waitAndClick(NoxSettimeBacktoMainSetting);
		if (isexist(SettingApp) == false) {
			waitAndClick(NoxSettimeBacktoMainSetting);
		}
		waitAndClick(HomeKey);
		return this;

	}
	public NoxHome SettingTimeto8AM() throws FindFailed {
		
		while (isexist(Setting) == false) {
			wait(5.0);
			i++;
		}
		System.out.println("wait " + 5 * i + "s");
		waitAndClick(Setting);
		waitAndClick(NoxSearchSetting);
		type(NoxSearchSettingTextField, "date");
		waitAndClick(NoxDatetimeSetting);
		waitAndClick(NoxSettime);
		wait(3.0);
		if (isexist(NoxSettimeAM)) {
			waitAndClick(NoxSettimeAM);
		}
		waitAndClick(NoxSettime8AM);
		waitAndClick(NoxSettime00Min);	
		waitAndClick(NoxDatetimeSettingOK);
		waitAndClick(NoxSettimeBacktoMainSetting);
		if (isexist(SettingApp) == false) {
			waitAndClick(NoxSettimeBacktoMainSetting);
		}
		waitAndClick(HomeKey);
		return this;

	}

	public NoxHome SettingTimeto4PM15() throws FindFailed {
		waitAndClick(HomeKey);
		waitAndClick(Setting);
		waitAndClick(NoxSearchSetting);
		paste(NoxSearchSettingTextField, "date");
		waitAndClick(NoxDatetimeSetting);
		waitAndClick(NoxSettime);
		wait(2.0);
		waitAndClick(NoxSettime16h);
		waitAndClick(NoxSettime15min);
		waitAndClick(NoxDatetimeSettingOK);
		waitAndClick(NoxSettimeBacktoMainSetting);
		if (isexist(SettingApp) == false) {
			waitAndClick(NoxSettimeBacktoMainSetting);
		}
		waitAndClick(HomeKey);
		return this;

	}

}
